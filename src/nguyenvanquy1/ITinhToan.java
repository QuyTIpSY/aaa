/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nguyenvanquy1;

import bean.sinhvienbean;
import java.rmi.*;
import java.util.ArrayList;

/**
 *
 * @author tllsp
 */
public interface ITinhToan extends Remote{
    public sinhvienbean ktdn(long msv, String mk) throws Exception;
}
