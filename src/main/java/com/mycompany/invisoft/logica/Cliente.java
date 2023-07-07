package com.mycompany.invisoft.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id_cliente;
    private String nom_cliente;
    private String doc_cliente;
    private String correo_cliente;
    private String direc_cliente;
    private String tel_cliente;
    private String tipo_Doc_Cliente;

    public Cliente() {
    }

    public Cliente(int id_cliente, String nom_cliente, String doc_cliente, String correo_cliente, String direc_cliente, String tel_cliente, String tipo_Doc_Cliente) {
        this.id_cliente = id_cliente;
        this.nom_cliente = nom_cliente;
        this.doc_cliente = doc_cliente;
        this.correo_cliente = correo_cliente;
        this.direc_cliente = direc_cliente;
        this.tel_cliente = tel_cliente;
        this.tipo_Doc_Cliente = tipo_Doc_Cliente;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNom_cliente() {
        return nom_cliente;
    }

    public void setNom_cliente(String nom_cliente) {
        this.nom_cliente = nom_cliente;
    }

    public String getDoc_cliente() {
        return doc_cliente;
    }

    public void setDoc_cliente(String doc_cliente) {
        this.doc_cliente = doc_cliente;
    }

    public String getCorreo_cliente() {
        return correo_cliente;
    }

    public void setCorreo_cliente(String correo_cliente) {
        this.correo_cliente = correo_cliente;
    }

    public String getDirec_cliente() {
        return direc_cliente;
    }

    public void setDirec_cliente(String direc_cliente) {
        this.direc_cliente = direc_cliente;
    }

    public String getTel_cliente() {
        return tel_cliente;
    }

    public void setTel_cliente(String tel_cliente) {
        this.tel_cliente = tel_cliente;
    }

    public String getTipo_Doc_Cliente() {
        return tipo_Doc_Cliente;
    }

    public void setTipo_Doc_Cliente(String tipo_Doc_Cliente) {
        this.tipo_Doc_Cliente = tipo_Doc_Cliente;
    }
    
    

    
    
}
