/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.invisoft.persistencia;

import com.mycompany.invisoft.logica.VentasInvi;
import com.mycompany.invisoft.persistencia.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author CAMILO
 */
public class VentasInviJpaController implements Serializable {

    public VentasInviJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;
    
    public VentasInviJpaController(){
        emf = Persistence.createEntityManagerFactory("InvisfotPU");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(VentasInvi ventasInvi) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(ventasInvi);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(VentasInvi ventasInvi) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            ventasInvi = em.merge(ventasInvi);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = ventasInvi.getId();
                if (findVentasInvi(id) == null) {
                    throw new NonexistentEntityException("The ventasInvi with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            VentasInvi ventasInvi;
            try {
                ventasInvi = em.getReference(VentasInvi.class, id);
                ventasInvi.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The ventasInvi with id " + id + " no longer exists.", enfe);
            }
            em.remove(ventasInvi);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<VentasInvi> findVentasInviEntities() {
        return findVentasInviEntities(true, -1, -1);
    }

    public List<VentasInvi> findVentasInviEntities(int maxResults, int firstResult) {
        return findVentasInviEntities(false, maxResults, firstResult);
    }

    private List<VentasInvi> findVentasInviEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(VentasInvi.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public VentasInvi findVentasInvi(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(VentasInvi.class, id);
        } finally {
            em.close();
        }
    }

    public int getVentasInviCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<VentasInvi> rt = cq.from(VentasInvi.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
