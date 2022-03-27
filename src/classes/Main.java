/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classes;

import classes.mydb;
import ds.desktop.notify.DesktopNotify;
import java.sql.*;

/**
 *
 * @author Nico
 */
public class Main {

    static void Query(mydb db) throws SQLException {
         
        try {
            Thread.sleep(2000);
            Connection cn = db.getConexion();

            PreparedStatement pst = cn.prepareStatement("select * from py");
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                System.out.println("Se han hallado coincidencias");
            } else {
                System.out.println("No hay coincidencias");
            }
        } catch (SQLException e) {
             DesktopNotify.showDesktopMessage("ERROR", "" + e, DesktopNotify.ERROR);
            Query(db);
            
        } catch (Exception e) {
            DesktopNotify.showDesktopMessage("ERROR", "" + e, DesktopNotify.ERROR);
            Query(db);

        }
    }

    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        mydb db = new mydb();

        Query(db);
    }

}
