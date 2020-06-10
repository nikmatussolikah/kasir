/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Siti Nikmatus Solikah
 */
public class koneksi {
public koneksi() throws SQLException{
    bukaKoneksi();
}
      
public Connection bukaKoneksi()throws SQLException{
    Connection con=null;
    try{
        Class.forName("com.mysql.jdbc.Driver");//contoh Driver MYSQL
        //Format URL dimana lokasi data base di simpan
        con = DriverManager.getConnection("jdbc:mysql://localhost/percetakan", "root", "");
        //Tampilan ketika sudah terhubung
        System.out.println("connected");
        return con;
    }
    catch(SQLException se){
        System.out.println("No Connection open");
        return null;
    }
    catch(Exception ex){
    //tampilan belum terhubung
    System.out.println("Cound not open connection");
    return null;
    }
}
}
