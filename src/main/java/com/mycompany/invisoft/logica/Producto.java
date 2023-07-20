/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.invisoft.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author CAMILO
 */
@Entity
public class Producto implements Serializable {
    @Id
    @GeneratedValue(strategy =GenerationType.SEQUENCE)
    private int id_Llanta;
    private String Referencia;
    private String Rin;
    private String Fecha;
    private String Marca;
    private int Precio;
    //Proveedor provee;

    public Producto() {
    }

    public Producto(int id_Llanta,String Referencia, String Rin, String Fecha,String Marca,int Precio ) {
        this.id_Llanta= id_Llanta;
        this.Referencia = Referencia;
        this.Rin = Rin;
        this.Fecha = Fecha;
        this.Marca = Marca;
        this.Precio = Precio;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }
    
    

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }
    
    public int getId_Llanta() {
        return id_Llanta;
    }

    public void setId_Llanta(int id_Llanta) {
        this.id_Llanta = id_Llanta;
    }

    public String getReferencia() {
        return Referencia;
    }

    public void setReferencia(String Referencia) {
        this.Referencia = Referencia;
    }

    public String getRin() {
        return Rin;
    }

    public void setRin(String Rin) {
        this.Rin = Rin;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }
    
}  