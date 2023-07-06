/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import dao.Dao;
import dao.DaoImpl;
import java.sql.ResultSet;

/**
 *
 * @author Ardent
 */
public class ReportBo {
    
     public ResultSet getReportBydate(String uid,java.sql.Date date){
         
         ResultSet res=null;
        try{
         
       Dao r=new DaoImpl();
        
        res=r.getExpenseValuesByDate(uid, date);
     return res;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return res;
    }
    
     public ResultSet getReportBycategory(String uid,String type){
        
         ResultSet res=null;
        try{
         
       Dao r=new DaoImpl();
        
        res=r.getExpenseValuesByCategory(uid,type);
     return res;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return res;
    }
     
      public ResultSet getReportByDateAndCategory(String uid,String type,java.sql.Date Date){
         
         ResultSet res=null;
        try{
         
       Dao r=new DaoImpl();
        
        res=r.getExpenseValuesByDateAndCategory(uid, type,Date);
     return res;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return res;
    }
      
    
}
