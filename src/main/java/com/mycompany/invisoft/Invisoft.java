package com.mycompany.invisoft;

import com.mycompany.invisoft.igu.Clientes;
import com.mycompany.invisoft.igu.InicioInvisoft;
//import com.mycompany.invisoft.igu.LoginInvisoft;
import com.mycompany.invisoft.igu.Clientes;
//import com.mycompany.invisoft.igu.Proveedores;


//import com.mycompany.invisoft.igu.Principal;
//>>>>>>> parent of 0eea8e1 (Revert "listaprov")

public class Invisoft {
    public static void main(String[] args) {

//        LoginInvisoft empezamosfuerte = new LoginInvisoft();
//        empezamosfuerte.setVisible(true);
//        empezamosfuerte.setLocationRelativeTo(null);

        InicioInvisoft vista = new InicioInvisoft();
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);

       /* LoginInvisoft empezamosfuerte = new LoginInvisoft();
        empezamosfuerte.setVisible(true);
        empezamosfuerte.setLocationRelativeTo(null);*/
        
        Clientes clientes = new Clientes();
        clientes.setVisible(true);
        clientes.setLocationRelativeTo(null);
        
        

    }
}