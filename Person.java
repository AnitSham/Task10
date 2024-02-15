package task10;

import java.util.Scanner;

public class Person {

	private String name;
    private int age;
	
	public String getname() {
		return name;
	}
	
	public int getage() {
		return age;
	}
	
	public void setname(String newname) {
		this.name=newname;
	}
	
	public void setage(int newage) {
		this.age= newage;
	}
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=sc.nextLine();
	
		System.out.println("Enter the age");
		int age=sc.nextInt();
		
		Person obj=new Person();
		obj.setname(name);
		System.out.println(obj.getname());
		
		obj.setage(age);
		System.out.println(obj.getage());
		
	}
}
