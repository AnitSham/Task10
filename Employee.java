package task10;

import java.util.Scanner;

public class Employee {

	private int ID;
	private int Salary;
	private String Name;
	 int AnnualSalary;
	
	public int getID() {
		return ID;
	}
	public void setID(int ID) {
		this.ID=ID;
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name= Name;
	}

	public int getSalary() {
		return Salary;
	}
	public void setSalary(int Salary) {
		this.Salary= Salary;
	}
	
	public int getAnnualSalary() {
		return Salary*12;
	}
	
	public void raiseSalary() {
		
		int increment = 0;  
       
        if ((Salary >=10000) && (Salary <=15000))  
        {  
            increment += (Salary * 2)/100;  
            Salary = Salary+increment;  
            System.out.println("Salary is incremented by 2%");  
            System.out.println();  
              
        }else if ((Salary >=15000) && (Salary <=20000))
        {  
            increment += (Salary * 5)/100;  
            Salary = Salary+increment;  
            System.out.println("Salary is incremented by 5%");  
            System.out.println();  
        }else {  
            System.out.println("Salary is not incremented");  
            System.out.println();  
        }    
	}
	public static void main(String[] args) {
		
		Employee obj=new Employee();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the ID");
		int IDC=sc.nextInt();
		
		obj.setID(IDC);
		System.out.println(obj.getID());

		obj.setName("Babu");
		System.out.println(obj.getName());
		
		obj.setSalary(15000);
		System.out.println(obj.getSalary());
		
		System.out.println(obj.getAnnualSalary());
		
		obj.raiseSalary();
	    }  

}

