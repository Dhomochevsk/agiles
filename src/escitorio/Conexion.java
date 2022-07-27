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
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/id19227042_proyectoagiles","root","");
/*            
//con = (Connection) DriverManager.getConnection("jdbc:mysql://sql304.byetcluster.com/epiz_32140834_proyAgil","epiz_32140834","vLmK3TeqBnPok");
            //con = (Connection) DriverManager.getConnection("jdbc:mysql://--SERVIDOR--/--BD--","--USER--","--PASS--");
            //con = (Connection) DriverManager.getConnection("https://proyectoma2022.000webhostapp.com/conexionBD.php");
            
            //con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/id19227042_proyectoagiles","id19227042_root","MAgiles2022P$%@");
            //con = (Connection) DriverManager.getConnection("jdbc:mysql://databases.000webhost.com/id19227042_proyectoagiles","id19227042_root","MAgiles2022P$%@");
*/        
            } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e);
            
        }
        return con;
    }
    
    public Connection localhost(String bd){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/id19227042_proyectoagiles","root","");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://sql10.freemysqlhosting.net/sql10508766","sql10508766","fsB6zlVxWF");
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return con;
    }

}
