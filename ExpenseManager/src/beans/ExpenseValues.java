package beans;
//*dibyadyuti Roy*/
import dao.Dao;
import dao.DaoImpl;
import java.sql.Date;

public class ExpenseValues {
	private String expensetype;
	private int amount;
	private java.sql.Date  expdate;
	private int month;
	private int year;
	private String details;
	private String usermail;

    @Override
    public String toString() {
        return "ExpenseValues{" + "expensetype=" + expensetype + ", amount=" + amount + ", expdate=" + expdate + ", month=" + month + ", year=" + year + ", details=" + details + ", usermail=" + usermail + '}';
    }
        
	public String getExpensetype() {
		return expensetype;
	}
	public void setExpensetype(String expensetype) {
		this.expensetype = expensetype;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public String getUsermail() {
		return usermail;
	}
	public void setUsermail(String usermail) {
		this.usermail = usermail;
	}
	
	
	/*public int insertExpenseValues()
	{
		Dao d=new DaoImpl();
		int serialno=d.getSerial("expense_details");
		int i=d.insertExpenseValues(serialno,expensetype, amount, expdate, details, usermail);
		return i;
	}*/

    public Date getExpdate() {
        return expdate;
    }

    public void setExpdate(Date expdate) {
        this.expdate = expdate;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
	
	
	
}
