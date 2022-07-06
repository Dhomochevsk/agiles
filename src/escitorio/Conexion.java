/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escitorio;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class Conexion {

    Connection con;
    public Connection conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/base_agil","root","");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://sql10.freemysqlhosting.net/sql10503397","sql10503397","bfNbMT86ph");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return con;
    }

}
