/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import beans.ExpenseDetails;
import beans.UserDetails;
import dao.*;


/**
 *
 * @author Dibyadyuti Roy
 */
public class RegistrationBo {
    UserDetails u;
    ExpenseDetails exd;
   static Dao d;
    public RegistrationBo(UserDetails u,ExpenseDetails exd) {
        this.u = u;
        this.exd=exd;
    }
    static
    {
    d=new DaoImpl();    
    }
    
    
   public int Register(){
       int state=0;
       if(d.isExists(u)){
           
           if(d.registerUser(u)==1){
               d.isertExpenseDetails(exd);
                   state=1;
           }
         
       
       }
      return state;
   }
    
    
}
