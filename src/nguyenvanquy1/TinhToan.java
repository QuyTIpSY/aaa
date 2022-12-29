/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nguyenvanquy1;

import bean.sinhvienbean;
import dao.ktdndao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

/**
 *
 * @author tllsp
 */
public class TinhToan extends UnicastRemoteObject implements ITinhToan{

    public TinhToan() throws RemoteException {
    }

    ktdndao ktdn = new ktdndao();
    @Override
    public sinhvienbean ktdn(long msv, String mk) throws Exception {
        return ktdn.ktdn(msv, mk);
    }
    public ArrayList<sinhvienbean> timkiem (String keyword) throws Exception {
        return ktdn.timkiem(keyword);
    }
    public ArrayList<sinhvienbean> dtb () throws Exception{
        return ktdn.dtb();
    }
}
