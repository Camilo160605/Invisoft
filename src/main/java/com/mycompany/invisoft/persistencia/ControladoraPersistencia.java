package com.mycompany.invisoft.persistencia;

import com.mycompany.invisoft.logica.Cliente;
import com.mycompany.invisoft.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    ClienteJpaController clientejpa = new ClienteJpaController();

    public void guardar(Cliente cli) {
        clientejpa.create(cli);
    }

    public List<Cliente> traerClientes() {
        return clientejpa.findClienteEntities();
    }

    public void borrarMascota(int id_Cliente) {
        try {
            clientejpa.destroy(id_Cliente);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Cliente traerCliente(int id_Cliente) {
        return clientejpa.findCliente(id_Cliente);
    }

    public void modificarCliente(Cliente cli) {
        try {
            clientejpa.edit(cli);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
