/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author Dibyadyuti Roy
 */
import dao.Dao;
import dao.DaoImpl;

public class UserDetails {
private String name;
private String addr;
private String phno;
private String password;
private String email;
private int monthlyexp;
private int income;
private String ques;
private String ans;

    @Override
    public String toString() {
        return "UserDetails{" + "name=" + name + ", addr=" + addr + ", phno=" + phno + ", password=" + password + ", email=" + email + ", monthlyexp=" + monthlyexp + ", income=" + income + ", ques=" + ques + ", ans=" + ans + '}';
    }


public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddr() {
	return addr;
}
public void setAddr(String addr) {
	this.addr = addr;
}
public String getPhno() {
	return phno;
}
public void setPhno(String phno) {
	this.phno = phno;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getMonthlyexp() {
	return monthlyexp;
}
public void setMonthlyexp(int monthlyexp) {
	this.monthlyexp = monthlyexp;
}
public int getIncome() {
	return income;
}
public void setIncome(int income) {
	this.income = income;
}
public String getQues(){
    return ques;
}
public void setQues(String ques){
    this.ques=ques;
}
public String getAns(){
    return ans;
}
public void setAns(String ans){
    this.ans=ans;
}

public boolean login(String email,String password)
{
	Dao d=new DaoImpl();
	boolean b=d.loginUser(email, password);
	return b;
}

public int updateUser()
{
	Dao d=new DaoImpl();
	int i=d.updateUser(name, addr, phno, password, monthlyexp, income, email);
	return i;
}
public int deleteUser()
{
	Dao d=new DaoImpl();
	int i=d.deleteUser(email);
	return i;
}

}

