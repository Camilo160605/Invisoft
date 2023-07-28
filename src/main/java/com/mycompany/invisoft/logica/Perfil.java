
package com.mycompany.invisoft.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Perfil implements Serializable {
   
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id_Perfil;
    private int Documento;
    private String Nombre;
    private String RazonSocial;
    private String TipoContribuyente;
    private String Pais;
    private String Municipio;
    private String Departamento;
    private String Direccion;
    private String Correo;
    private String Telefono;

    public Perfil() {
    }

    public Perfil(int id_Perfil, int Documento, String Nombre, String RazonSocial, String TipoContribuyente, String Pais, String Municipio, String Departamento, String Direccion, String Correo, String Telefono) {
        this.id_Perfil = id_Perfil;
        this.Documento = Documento;
        this.Nombre = Nombre;
        this.RazonSocial = RazonSocial;
        this.TipoContribuyente = TipoContribuyente;
        this.Pais = Pais;
        this.Municipio = Municipio;
        this.Departamento = Departamento;
        this.Direccion = Direccion;
        this.Correo = Correo;
        this.Telefono = Telefono;
    }

    public int getId_Perfil() {
        return id_Perfil;
    }

    public void setId_Perfil(int id_Perfil) {
        this.id_Perfil = id_Perfil;
    }

    public int getDocumento() {
        return Documento;
    }

    public void setDocumento(int Documento) {
        this.Documento = Documento;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getRazonSocial() {
        return RazonSocial;
    }

    public void setRazonSocial(String RazonSocial) {
        this.RazonSocial = RazonSocial;
    }

    public String getTipoContribuyente() {
        return TipoContribuyente;
    }

    public void setTipoContribuyente(String TipoContribuyente) {
        this.TipoContribuyente = TipoContribuyente;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public String getMunicipio() {
        return Municipio;
    }

    public void setMunicipio(String Municipio) {
        this.Municipio = Municipio;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    
    
}
