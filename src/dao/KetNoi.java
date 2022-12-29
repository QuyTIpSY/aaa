/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author tllsp
 */
public class KetNoi {
    public Connection cn;
    
    public void KetNoi() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=QLSinhVien;user=sa;password=123456";
            cn = DriverManager.getConnection(url);
            System.out.println("Connected");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        KetNoi kn=new KetNoi();
        kn.KetNoi();
    }
}
