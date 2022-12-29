/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.sinhvienbean;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author tllsp
 */
public class ktdndao {
    public sinhvienbean ktdn (long msv, String mk) {
        try {
            // b1: Ket noi csdl
            KetNoi kn=new KetNoi();
            kn.KetNoi();
            // b2: Lay du lieu ve
            String sql = "select * from SinhVien where masinhvien=? and matkhau=?";
       
            PreparedStatement cmd = kn.cn.prepareStatement(sql);
            cmd.setLong(1, msv);
            cmd.setString(2, mk);
            ResultSet rs = cmd.executeQuery();
            sinhvienbean sv = null;
            
            if(rs.next()) {
                long masinhvien=rs.getLong("masinhvien");
                String hoten=rs.getString("hoten");
                String diachi=rs.getString("diachi"); 
                double dtb=rs.getDouble("dtb");
                String matkhau=rs.getString("matkhau"); 
                String malop=rs.getString("malop");
                sv=new sinhvienbean(masinhvien, hoten, diachi, dtb, matkhau, malop);
            }
            rs.close();
            kn.cn.close();
            return sv;
            
        } catch(Exception e) {
            e.printStackTrace(); return null;
        }
    }
    
    public ArrayList<sinhvienbean> timkiem (String keyword) {
        try {
            // b1: Ket noi csdl
            KetNoi kn=new KetNoi();
            kn.KetNoi();
            // b2: Lay du lieu ve
            String sql = "select SinhVien.* from SinhVien, LopHoc where tenlop=? and SinhVien.malop=LopHoc.malop";
       
            PreparedStatement cmd = kn.cn.prepareStatement(sql);
            cmd.setString(1, keyword);
            ResultSet rs = cmd.executeQuery();
            ArrayList<sinhvienbean> ds=new ArrayList<sinhvienbean>();
            
            if(rs.next()) {
                long masinhvien=rs.getLong("masinhvien");
                String hoten=rs.getString("hoten");
                String diachi=rs.getString("diachi"); 
                double dtb=rs.getDouble("dtb");
                String matkhau=rs.getString("matkhau"); 
                String malop=rs.getString("malop");
                ds.add(new sinhvienbean(masinhvien, hoten, diachi, dtb, matkhau, malop));
            }
            rs.close();
            kn.cn.close();
            return ds;
            
        } catch(Exception e) {
            e.printStackTrace(); return null;
        }
    }
    
    public ArrayList<sinhvienbean> dtb () {
        try {
            // b1: Ket noi csdl
            KetNoi kn=new KetNoi();
            kn.KetNoi();
            // b2: Lay du lieu ve
            String sql = "select * from SinhVien order by dtb DESC";
       
            PreparedStatement cmd = kn.cn.prepareStatement(sql);
            
            ResultSet rs = cmd.executeQuery();
           ArrayList<sinhvienbean> ds=new ArrayList<sinhvienbean>();
            if(rs.next()) {
                long masinhvien=rs.getLong("masinhvien");
                String hoten=rs.getString("hoten");
                String diachi=rs.getString("diachi"); 
                double dtb=rs.getDouble("dtb");
                String matkhau=rs.getString("matkhau"); 
                String malop=rs.getString("malop");
                ds.add(new sinhvienbean(masinhvien, hoten, diachi, dtb, matkhau, malop));
            }
            rs.close();
            kn.cn.close();
            return ds;
            
        } catch(Exception e) {
            e.printStackTrace(); return null;
        }
    }
}
