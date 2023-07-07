package com.mycompany.invisoft;

//import com.mycompany.invisoft.igu.Clientes;

import com.mycompany.invisoft.igu.LoginInvisoft;
import com.mycompany.invisoft.igu.Proveedores;


//import com.mycompany.invisoft.igu.Principal;

public class Invisoft {

    public static void main(String[] args) {
        LoginInvisoft empezamosfuerte = new LoginInvisoft();
        empezamosfuerte.setVisible(true);
        empezamosfuerte.setLocationRelativeTo(null);
        
        Proveedores prov = new Proveedores();
        prov.setVisible(true);
        prov.setLocationRelativeTo(null);
    }
}