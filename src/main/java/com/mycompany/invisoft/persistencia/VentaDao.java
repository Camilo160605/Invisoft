package com.mycompany.invisoft.persistencia;

import com.mycompany.invisoft.logica.VentasInvi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;




public class VentaDao {
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    int r;
    public int RegistrarVenta(VentasInvi v){
        String sql = "INSERT INTO VentasInvi (cliente,vendedor,total) VALUES(?,?,?)";
        
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, v.getCliente());
            ps.setDouble(2, v.getTotal());
            ps.execute();
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    
    return r;
    }
    
}
