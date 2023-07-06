package dao;
import beans.ExpenseDetails;
import java.sql.*;
import java.util.ArrayList;



import dbcon.*;
import beans.ExpenseValues;
import beans.UserDetails;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class DaoImpl implements Dao{
	Connection con;
        ResultSet res;
        boolean status;
        public static ArrayList<String> al;
        {
    con=DbCon2.getConnected();
    al=new ArrayList<String>();
}
	public  String getuname(String mail){
             try{
         
            PreparedStatement ps=DbCon2.getConnected().prepareStatement("select name from user_master where email=?");
            ps.setString(1, mail);
              ResultSet r=ps.executeQuery();
            if(!r.next())
                return r.getString("name");
           
            
            
             }
             catch(Exception e){
                 e.printStackTrace();
                 
             }
             return null;
            
        }
//        
//        
//        
//        
        @Override
	 public boolean isExists(UserDetails u){
        
           boolean status=false;
           try{
         
            PreparedStatement ps=DbCon2.getConnected().prepareStatement("select * from user_master where email=?");
            ps.setString(1, u.getEmail());
            ResultSet r=ps.executeQuery();
            if(!r.next())
                status=true;
            
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return status;
        
    }
//    
//         @Override
//         public ResultSet getList(String uname){
//        ResultSet list=null;
//             try {
//            
//            PreparedStatement ps=DbCon2.getConnected().prepareStatement("select expense1,expense2,expense3,expense4,expense5,expense6,expense7,expense8 from expenditure_master where usermail=?");
//            ps.setString(1, uname);
//            list=ps.executeQuery();
//            System.out.print(list);
//        } catch (SQLException ex) {
//            Logger.getLogger(DaoImpl.class.getName()).log(Level.SEVERE, null, ex);
//        }
//             return list;
//             
//         }
	@Override
	public int registerUser(UserDetails u) {
		// TODO Auto-generated method stub
		int i=0;
                System.out.println(u);
		String sql="insert into user_master values(?,?,?,?,?,?,?,?,?)";
		try{
			con=DbCon2.getConnected();
			System.out.println("Con "+con);
			PreparedStatement ps=con.prepareStatement(sql);
			
                        ps.setString(1, u.getName());
			ps.setString(2, u.getAddr());
			ps.setString(3, u.getPhno());
			ps.setString(4, u.getPassword());
			ps.setInt(5, u.getMonthlyexp());
			ps.setInt(6, u.getIncome());
                        ps.setString(7, u.getEmail());
			ps.setString(8,u.getQues());
                        ps.setString(9,u.getAns());
                        
			i=ps.executeUpdate();
		}catch(Exception e){e.printStackTrace();}
		return i;
	}

	@Override
	public boolean loginUser(String mail, String password) {
		// TODO Auto-generated method stub
		boolean b=false;
		String sql="select * from user_master where email=? and password=?";
		try{
			Connection con=DbCon2.getConnected();
			PreparedStatement ps=con.prepareStatement(sql);
			System.out.println(mail+"\n.....................\n "+password);
			ps.setString(1, mail);
			ps.setString(2, password);
			ResultSet rs=ps.executeQuery();
                        System.out.print("in Dao imp"+rs);
			if(rs.next())
			{
				b=true;
                                return b;
			}
		}catch(Exception e){e.printStackTrace();}
		return b;
	}

	public int updateUser(String name, String addr, String phno, String password,
			int monthlyexp, int income, String email)
	{
		return 0;
	}
	
	public int deleteUser(String email)
	{
		return 0;
	}

	@Override
	public int isertExpenseDetails(ExpenseDetails ed) {
		// TODO Auto-generated method stub
		int i=0;
		String sql="insert into expenditure_master values(?,?,?,?,?,?,?,?,?,?)";
		try{
			con=DbCon2.getConnected();
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1,this.getSerial("expenditure_master"));
			ps.setString(2, ed.getExpense1());
			ps.setString(3, ed.getExpense2());
			ps.setString(4, ed.getExpense3());
			ps.setString(5, ed.getExpense4());
			ps.setString(6, ed.getExpense5());
			ps.setString(7, ed.getExpense6());
			ps.setString(8, ed.getExpense7());
			ps.setString(9, ed.getExpense8());
			ps.setString(10,ed.getEmail() );
			i=ps.executeUpdate();
		}catch(Exception e){e.printStackTrace();}
		return i;
	}

        @Override
        public boolean isExpensePresent(ExpenseValues ev){
            try{
                PreparedStatement ps=con.prepareStatement("select * from expense_details where expdate=? and expensetype=?");
                ps.setDate(1,ev.getExpdate());
                ps.setString(2,ev.getExpensetype());
                status=ps.executeQuery().next();
                
                
            }catch(Exception e){
                e.printStackTrace();
            }
            
            
            return status;
        }
	@Override
	public int insertExpenseValues(ExpenseValues ev) {
		// TODO Auto-generated method stub
		int i=0;
		String sql="insert into expense_details values(sl.nextval,?,?,?,?,?,?,?)";
		try{
                   
			if(!this.isExpensePresent(ev)){
			PreparedStatement ps=con.prepareStatement(sql);
			
			ps.setString(1,ev.getExpensetype());
			ps.setInt(2,ev.getAmount() );
			ps.setDate(3,ev.getExpdate());
                        ps.setInt(4,ev.getMonth());
                        ps.setInt(5,ev.getYear());
			ps.setString(6, ev.getDetails());
			ps.setString(7, ev.getUsermail());
			i=ps.executeUpdate();
                        }
		}catch(Exception e){e.printStackTrace();}
		return i;
	}
        
        
        
        @Override
        public boolean updateDetails(ExpenseValues ev){
            try{
               
                
                PreparedStatement ps=con.prepareStatement("update expense_details set details=? ,amount=?  where expdate=? and expensetype=?");
                ps.setString(1,ev.getDetails());
                  ps.setInt(2,ev.getAmount());
                    ps.setDate(3,ev.getExpdate());
                      ps.setString(4,ev.getExpensetype());
                      if(ps.executeUpdate()>0)
                          status=true;
                
            }catch(Exception e){
                 e.printStackTrace();
            }
            
            
            
            return status;
        }
        

	@Override
	public int editExpenseValues(String expensetype, int amount,
			String expdate, String details, String usermail) {
		// TODO Auto-generated method stub
		
		return 0;
	}
        @Override
	public int getSerial(String table)
	{
		int serial=10;
		try{
			
			String sql="select max(serialno) from "+table;
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				serial=rs.getInt("max(serialno)")+10;
			}
		}catch(Exception e){e.printStackTrace();}
		return serial;
	}

        @Override
        public ResultSet getDetailsByDateAndType(java.sql.Date date,String type){
    
		String sql="select amount,details from expense_details where expdate=? and EXPENSETYPE=? ";
		
		try{
			Connection con=DbCon2.getConnected();
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setDate(1, date);
                         ps.setString(2,type);
			res=ps.executeQuery();
                        return res;
			
		}catch(Exception e){e.printStackTrace();}
		return res;    
        }
//        
//        
//        
//        
      
	@Override
	public ResultSet getExpenseValuesByDate(String uid,java.sql.Date date) {
		// TODO Auto-generated method stub
            System.out.println("in DaoImpl "+date+" "+uid);
		ResultSet rs=null;
		String sql="select expensetype,amount,expdate,details from expense_details where expdate=? and usermail=?";
		
		try{
		
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setDate(1, date);
                         ps.setString(2, uid);
			rs=ps.executeQuery();
                        return rs;
			
		}catch(Exception e){e.printStackTrace();}
		return rs;
	}

	@Override
	public ResultSet getExpenseValuesByCategory(String uid,String type) {
		// TODO Auto-generated method stub
		ResultSet rs=null;
		String sql="select EXPENSETYPE,amount,expdate,details from expense_details where EXPENSETYPE=? and usermail=?";
		
		try{
		
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, type);
                        ps.setString(2, uid);
			rs=ps.executeQuery();
			return rs;
                        
		}catch(Exception e){e.printStackTrace();}
		return rs;
	}

	@Override
	public ResultSet getExpenseValuesByDateAndCategory(String uid,String type,java.sql.Date date) {
		// TODO Auto-generated method stub
		ResultSet rs=null;
		String sql="select expensetype,amount,expdate,details as total from expense_details where EXPENSETYPE=? and usermail=? and expdate=?";
		
		try{
			Connection con=DbCon2.getConnected();
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, type);
                         ps.setString(2, uid);
                         ps.setDate(3, date);
			rs=ps.executeQuery();
			return rs;
                        
		}catch(Exception e){e.printStackTrace();}
		return rs;
	}

	@Override
	public ArrayList<String> getExpenseType(String email) {
            System.out.println("email-"+email);
		String sql="select * from expenditure_master where usermail=?";
		
		try{
                    al.clear();
			Connection con=DbCon2.getConnected();
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, email);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
                            
                            for(int i=1;i<9;i++){
                                String type=rs.getString("expense"+i);
				if(type!=null)
                                    al.add(rs.getString("expense"+i));
                            }
			}
		}catch(Exception e){e.printStackTrace();}
		return al;
	}
 
        
}
