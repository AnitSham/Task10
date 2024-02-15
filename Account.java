package task10;

public class Account {

	String name;
	int old;
	static int amount=50000;
	
public  Account() {
		System.out.println("Here we are going to do transaction function");
	}
	
	public Account(String customer, int age) {
		name=customer;
		old=age;
	}
	public int getBalance(){
		return amount;
	}
	    public void deposit(int addamount) {
	    amount=amount+addamount;
	    System.out.println("Amount deposited");
	    System.out.println("Total balance"+" "+amount);
	    	
	    }
	    
	    public void withdraw(int addamount) {
	        if(amount>addamount) {
	        	amount=amount-addamount;
	        	System.out.println("Collect your cash");
	        	System.out.println("Available balance is"+ " "+amount);
	        }else {
	        	System.out.println("Invalid transaction");
	        }
	        	
	        }
}
