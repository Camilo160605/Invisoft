package com.mycompany.invisoft.logica;

import com.mycompany.invisoft.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {
    ControladoraPersistencia controlPersis;

    public Controladora() {
        controlPersis = new ControladoraPersistencia();
    }
    
//CLIENTES
    public void guardar(String nombreCliente, String celuCliente, String correoCli, String direcCliente, String docCliente, String tipoDocumentoCliente) {
        Cliente cli = new Cliente();
        cli.setCorreo_cliente(correoCli);
        cli.setDirec_cliente(direcCliente);
        cli.setDoc_cliente(docCliente);
        cli.setNom_cliente(nombreCliente);
        cli.setTel_cliente(celuCliente);
        cli.setTipo_Doc_Cliente(tipoDocumentoCliente);
        
        controlPersis.guardar(cli);
    }

    public List<Cliente> traerClientes() {        
        return controlPersis.traerClientes();
    }

    public void borrarCliente(int id_Cliente) {
        controlPersis.borrarCliente(id_Cliente);
    }

    public Cliente traerCliente(int id_Cliente) {
        return controlPersis.traerCliente(id_Cliente);
    }

    public void modificarDatosCliente(Cliente cli, String nombreCliente,String celuCliente,
            String correoCli, String direcCliente, String docCliente, String tipoDocumentoCliente) {
        cli.setNom_cliente(nombreCliente);
        cli.setTel_cliente(celuCliente);
        cli.setCorreo_cliente(correoCli);
        cli.setDirec_cliente(direcCliente);
        cli.setDoc_cliente(docCliente);
        cli.setTipo_Doc_Cliente(tipoDocumentoCliente);
        
        controlPersis.modificarCliente(cli);
        
        
    } 
//PROVEEDORES
    public void guardarprov(String nombProveedor, String celProveedor, String correoProv, String direcProveedor, String docProveedor, String tipoDocumentoProveedor) {
        Proveedor prov = new Proveedor();
        prov.setNom_proveedor(nombProveedor);
        prov.setTel_proveedor(celProveedor);
        prov.setCorreo_proveedor(correoProv);
        prov.setDirec_proveedor(direcProveedor);
        prov.setDoc_proveedor(docProveedor);
        prov.setTipo_doc_proveedor(tipoDocumentoProveedor);
        
        controlPersis.guardarprov(prov); 
    }

    public List<Proveedor> traerProveedor() {
           return controlPersis.traerProveedor();
       }

       public void borrarProveedor(int id_proveedor) {
          controlPersis.borrarProveedor (id_proveedor);
       }
       
    public Proveedor traerProv(int id_Proveedor) {
     return controlPersis.traerProv(id_Proveedor);
    }
    
     public void modificarprov(Proveedor prov, String nombProveedor, String celProveedor, 
        String correoProv, String direcProveedor, String docProveedor, String tipoDocumentoProveedor) {
        
       prov.setNom_proveedor(nombProveedor);
       prov.setTel_proveedor(celProveedor);
       prov.setCorreo_proveedor(correoProv);
       prov.setDirec_proveedor(direcProveedor);
       prov.setDoc_proveedor(docProveedor);
       prov.setTipo_doc_proveedor(docProveedor);
       
       controlPersis.modificarprov(prov);
    }



//LOGIN
   public String revisarCuenta(String usuarioLogin, String contraUsuario) {
        String mensaje = "";
        List<User> listaUsuarios = controlPersis.traerUsuarios();
        for (User usu : listaUsuarios){
            if(usu.getNombreUsuario().equals(usuarioLogin)){
                if(usu.getContraseña().equals(contraUsuario)){
                    mensaje = "Correcto";
                    return mensaje;
                }
                else{
                    mensaje = "ContraIncorrecta";
                    return mensaje;
                }               
                }
            else{
                    mensaje = "noencontrado";    
                }
        }
        return mensaje;
    }
//PRODUCTOS

   
    public void crearLlanta(int refLlanta, String rinLlanta, String fechaLlanta, String marcaLlanta, int precioLlanta,String nombreProveedor) {
        Producto llanta = new Producto();
        llanta.setReferencia(refLlanta);
        llanta.setRin(rinLlanta);
        llanta.setFecha(fechaLlanta);
        llanta.setMarca(marcaLlanta);
        llanta.setPrecio(precioLlanta);
        llanta.setProveedor(nombreProveedor);
        
        controlPersis.guardarLlanta(llanta);
    }

    public List<Producto> traerProducto() {
        return controlPersis.traerProducto();
    }

    public String revisarCliente(String identificacion) {
        String mensaje = "";
        List<Cliente> listaClientes = controlPersis.revisarClientes();
        for (Cliente cli : listaClientes){
            if(cli.getDoc_cliente().equals(identificacion)){
                mensaje = cli.getNom_cliente();
                return mensaje;
                }
//                else if(mensaje.isEmpty()){
//                    mensaje = "No encontrado";
//                    return mensaje;
//                }                       
        }
        return mensaje;
    }

    public Producto traerProd(int id_llanta) {
        return controlPersis.traerProd(id_llanta);
    }

    public void guardarVenta(String nombreCliente, Double suma) {
        VentasInvi ventas = new VentasInvi();
        ventas.setCliente(nombreCliente);
        ventas.setTotal(suma);
        
        controlPersis.guardarVentas(ventas);
        
    }

    public List<VentasInvi> traerVentas() {
        return controlPersis.traerVenta();
    }

   
}   
