package task10;

import java.util.Scanner;

public class TeaParent {

	public void prepareTea() {
		System.out.println("Receipe: Boil water add some tea leaves and wait for 5 mins");
	}
	
    public void addMilk() {
		System.out.println("Receipe: Boil water then add tea powder then add milk and wait for 10 mins");
	}
    
    public void addSugar() {
		System.out.println("Receipe: Boil water then add tea powder and add milk and sugar and wait for 12 mins");
	}

	public static void main(String[] args) {
		
		TeaParent obj = new TeaParent();
		obj.prepareTea();
		obj.addMilk();
		obj.addSugar();
		


	}

}
