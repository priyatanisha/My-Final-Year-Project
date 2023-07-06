/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import dao.Dao;
import dao.DaoImpl;

/**
 *
 * @author Ardent
 */
public class LoginBo {
    
    public boolean login(String uname,String pass){
        
        boolean state=false;
        Dao d=new DaoImpl();
        if(d.loginUser(uname, pass))
            state=true;
        return state;
        
    }
    
}
