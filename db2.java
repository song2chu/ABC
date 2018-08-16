/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.*;

/**
 *
 * @author safev
 */
public class db2 {
    
    public void connection() throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/abc","root","");
        PreparedStatement ps = con.prepareStatement("select * from user");
        ResultSet result = ps.executeQuery();
        while (result.next()) {            
            System.out.println("รหัส : " + result.getInt("id"));

            System.out.println("ชื่อผู้ใช้ : " + result.getString("username"));

            System.out.println("รหัสผ่าน : " + result.getString("password"));

            System.out.println("สถานะ : " + result.getInt("status"));

            System.out.println("------------------");
        }
        ps.close();
        con.close();
    }

//    public void connection() throws Exception {
//        Class.forName("com.mysql.jdbc.Driver");
//        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/abc", "root", "");
//        PreparedStatement ps = con.prepareStatement("select * from user");
//        ResultSet result = ps.executeQuery();
//        while (result.next()) {
//            System.out.println("รหัส : " + result.getInt("id"));
//
//            System.out.println("ชื่อผู้ใช้ : " + result.getString("username"));
//
//            System.out.println("รหัสผ่าน : " + result.getString("password"));
//
//            System.out.println("สถานะ : " + result.getInt("status"));
//
//            System.out.println("------------------");
//        }
//        ps.close();
//        con.close();
//    }
}
