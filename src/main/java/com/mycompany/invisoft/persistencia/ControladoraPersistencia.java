package com.mycompany.invisoft.persistencia;

import com.mycompany.invisoft.logica.Cliente;
import com.mycompany.invisoft.logica.Producto;
import com.mycompany.invisoft.logica.Proveedor;
import com.mycompany.invisoft.logica.User;
import com.mycompany.invisoft.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    ClienteJpaController clientejpa = new ClienteJpaController();
    

    //CLIENTE
    public void guardar(Cliente cli) {
        clientejpa.create(cli);
    }

    public List<Cliente> traerClientes() {
        return clientejpa.findClienteEntities();
    }

    public void borrarCliente(int id_Cliente) {
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

    //PROVEEDOR
    ProveedorJpaController proveedorjpa = new ProveedorJpaController(); 
    
    public void guardarprov(Proveedor prov) {
        proveedorjpa.create(prov);
    }
        public List<Proveedor> traerProveedor() {
      return proveedorjpa.findProveedorEntities();
    }
    public void borrarProveedor(int id_Proveedor) {
        try {
            proveedorjpa.destroy(id_Proveedor);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     public Proveedor traerProv(int id_Proveedor) {
      return proveedorjpa.findProveedor(id_Proveedor);
    }
     
     public void modificarprov(Proveedor prov) {
        try {
            proveedorjpa.edit(prov);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


//USUARIOS
    UserJpaController usuJpa = new UserJpaController();
    public List<User> traerUsuarios() {
        List<User> listaUsuario = usuJpa.findUserEntities();
        return listaUsuario;
        //Select * User       
    }  
    ProductoJpaController producJpa = new ProductoJpaController();
    public void guardarLlanta(Producto llanta) {
        producJpa.create(llanta);
    }

   
   
   
    


}

