package com.mycompany.invisoft.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Proveedor implements Serializable {    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id_proveedor;
    private String nom_proveedor;
    private String tipo_doc_proveedor;
    private String doc_proveedor;
    private String correo_proveedor;
    private String direc_proveedor;
    private String tel_proveedor;  

    public Proveedor(){
    }

    public Proveedor(int id_proveedor, String nom_proveedor, String tipo_doc_proveedor, String doc_proveedor, String correo_proveedor, String direc_proveedor, String tel_proveedor) {
        this.id_proveedor = id_proveedor;
        this.nom_proveedor = nom_proveedor;
        this.tipo_doc_proveedor = tipo_doc_proveedor;
        this.doc_proveedor = doc_proveedor;
        this.correo_proveedor = correo_proveedor;
        this.direc_proveedor = direc_proveedor;
        this.tel_proveedor = tel_proveedor;
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public String getNom_proveedor() {
        return nom_proveedor;
    }

    public void setNom_proveedor(String nom_proveedor) {
        this.nom_proveedor = nom_proveedor;
    }

    public String getTipo_doc_proveedor() {
        return tipo_doc_proveedor;
    }

    public void setTipo_doc_proveedor(String tipo_doc_proveedor) {
        this.tipo_doc_proveedor = tipo_doc_proveedor;
    }

    public String getDoc_proveedor() {
        return doc_proveedor;
    }

    public void setDoc_proveedor(String doc_proveedor) {
        this.doc_proveedor = doc_proveedor;
    }

    public String getCorreo_proveedor() {
        return correo_proveedor;
    }

    public void setCorreo_proveedor(String correo_proveedor) {
        this.correo_proveedor = correo_proveedor;
    }

    public String getDirec_proveedor() {
        return direc_proveedor;
    }

    public void setDirec_proveedor(String direc_proveedor) {
        this.direc_proveedor = direc_proveedor;
    }

    public String getTel_proveedor() {
        return tel_proveedor;
    }

    public void setTel_proveedor(String tel_proveedor) {
        this.tel_proveedor = tel_proveedor;
    }

    void setnombProveedor(String nombProveedor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setcelProveedor(String celProveedor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setcorreoProv(String correoProv) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setdocProveedor(String docProveedor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setdirecProveedor(String direcProveedor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void settipoDocumentoProveedor(String tipoDocumentoProveedor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    


    
}


