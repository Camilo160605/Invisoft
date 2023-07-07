package com.mycompany.invisoft.logica;

import com.mycompany.invisoft.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

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
        controlPersis.borrarMascota(id_Cliente);
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

    public void revisarCuenta(String usuarioLogin, String contraUsuario) {
        
    }
    
    
}
