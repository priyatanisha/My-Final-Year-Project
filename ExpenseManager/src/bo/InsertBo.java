/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import beans.ExpenseValues;
import dao.Dao;
import dao.DaoImpl;
import javax.swing.JOptionPane;

/**
 *
 * @author Ardent
 */
public class InsertBo {
    
    ExpenseValues ex;

    public InsertBo(ExpenseValues ex) {
        this.ex = ex;
    }
    
   
    public boolean ExpenseNote(){
       boolean state=false;
       Dao d=new DaoImpl();
       
       if(d.insertExpenseValues(ex)==1)
       {
           state=true;
           JOptionPane.showMessageDialog(null,"Entry Successfull");
       }
           else
           JOptionPane.showMessageDialog(null,"Same type of expense can not be noted ,please edit");
               
        return state;
    }
    
}
