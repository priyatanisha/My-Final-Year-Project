/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import beans.ExpenseDetails;
import beans.ExpenseValues;
import beans.UserDetails;
import bo.InsertBo;
import bo.LoginBo;
import bo.RegistrationBo;

import javax.swing.JOptionPane;

/**
 *
 * @author Dibyadyuti Roy
 */
public class Controller {
    
    public void registerUser(UserDetails user,ExpenseDetails ed){
        RegistrationBo rb=new RegistrationBo(user,ed);
        if(rb.Register()==1)
            new frames.load( null, true).setVisible(true);
        
        else
            JOptionPane.showMessageDialog(null,"user ALready Exists");
        
        
    }
    public boolean  noteExpense(ExpenseValues ev){
        boolean state=false;
            state=new InsertBo(ev).ExpenseNote();
            
        
        
        return state;
    }
    
    public boolean userlogin(String uname,String pass){
        System.out.print("in controller");
        LoginBo l=new LoginBo();
        if(l.login(uname, pass))
            return true;
        else 
            return false;
    }
    
}