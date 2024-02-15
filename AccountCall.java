package task10;

public class AccountCall {


	
	public static void main(String[] args) {
		
		Account obj=new Account("Ravi", 27);
		System.out.println(obj.name);
		System.out.println(obj.old);
		System.out.println("Total Amount in bank is" +" " +obj.getBalance());
	    obj.deposit(4000);
	    obj.withdraw(2000);
        
		
}
}