package task10;

import java.util.Scanner;

public class Circle {

static double result;
 static int r;

 double pi;
 String name;

 public Circle() {

 }

 public Circle(double d, String n) {
 	pi=d;
 	name=n;
 }
public  static double Calculate() {
result=Math.PI*2*r;
return result;
}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius value: ");
		r=sc.nextInt();
	    System.out.println(Calculate());
	    
	    Circle obj=new Circle();
	    System.out.println("Hello All");
	    
	    Circle obj1=new Circle(3.14, "House");
	    System.out.println(obj1.pi);
		System.out.println(obj1.name);
	}

}
