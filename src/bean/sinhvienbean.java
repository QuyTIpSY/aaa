/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

import java.io.Serializable;

/**
 *
 * @author tllsp
 */
public class sinhvienbean implements Serializable{
    private long masinhvien;
    private String hoten;
    private String diachi;
    private double dtb;
    private String matkhau;
    private String malop;

    public sinhvienbean(long masinhvien, String hoten, String diachi, double dtb, String matkhau, String malop) {
        this.masinhvien = masinhvien;
        this.hoten = hoten;
        this.diachi = diachi;
        this.dtb = dtb;
        this.matkhau = matkhau;
        this.malop = malop;
    }

    public sinhvienbean() {
    }

    public long getMasinhvien() {
        return masinhvien;
    }

    public void setMasinhvien(long masinhvien) {
        this.masinhvien = masinhvien;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public double getDtb() {
        return dtb;
    }

    public void setDtb(double dtb) {
        this.dtb = dtb;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public String getMalop() {
        return malop;
    }

    public void setMalop(String malop) {
        this.malop = malop;
    }
    
}
