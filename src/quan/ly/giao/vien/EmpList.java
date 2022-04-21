/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quan.ly.giao.vien;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Latitude 5570
 */
public class EmpList {
    List<Employee> ls = new ArrayList<>();
    public int add(Employee e){
        ls.add(e);
        return 1;
    }
    public int count(){
        return ls.size();
    }
    
    public Employee findBymaGV(String maGV){
        for (Employee lss : ls) {
            if(lss.getMaGV().equalsIgnoreCase(maGV)){
                return lss;
            }
        }
        return null;
    }
    
    public int edit(Employee lss){
        for (Employee gv : ls) {
            if(gv.getMaGV().equalsIgnoreCase(lss.getMaGV())){
                gv.setTenGV(lss.getTenGV());
                gv.setGioiTinh(lss.isGioiTinh());
                gv.setNgaySinh(lss.getNgaySinh());
                gv.setDiaChi(lss.getDiaChi());
                gv.setPhongBan(lss.getPhongBan());
                return 1;
            }
            
        }
        return -1;
            
        }
    
    
    public int del(String maGV){
        Employee gv = findBymaGV(maGV);
        if(gv != null){
            ls.remove(gv);
            return 1;
        }
        return -1;
    }
    
    
    public Employee getoneEmloyeAtPosition(int pos){
        return ls.get(pos);
    }
    
    
   
    
    public List<Employee> getALLGV(){
        return ls;
    }
    
    }
    

