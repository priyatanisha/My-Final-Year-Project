package dao;

import beans.ExpenseDetails;
import java.util.ArrayList;

import beans.ExpenseValues;
import beans.UserDetails;
import java.sql.ResultSet;

public interface Dao {
int registerUser(UserDetails u);
boolean loginUser(String mail,String password);
public int updateUser(String name, String addr, String phno, String password,int monthlyexp, int income, String email);

 public boolean isExists(UserDetails u);
public int deleteUser(String email);
//public ResultSet getList(String uname);
public int isertExpenseDetails(ExpenseDetails ed);
public int insertExpenseValues(ExpenseValues ex);
public int editExpenseValues(String expensetype,int amount,String expdate,String details,String usermail);
public int getSerial(String table);

public  ResultSet getExpenseValuesByDate(String uid,java.sql.Date date);
public ResultSet getExpenseValuesByCategory(String uid,String type);
public ResultSet getExpenseValuesByDateAndCategory(String uid,String type,java.sql.Date dSate);
public ArrayList<String> getExpenseType(String email);
public boolean isExpensePresent(ExpenseValues ev);
public boolean updateDetails(ExpenseValues ev);
public ResultSet getDetailsByDateAndType(java.sql.Date date,String type);

//    public ResultSet getforgotpwd(String email);


}