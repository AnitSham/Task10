package task10;

public class GreenTea extends BlackTea{

	public void prepareTea() {
		System.out.println("Receipe: Green Tea - Boil water then add Tea leaves again boil for 3 mins if you want add few drops of honey");
	}
	public static void main(String[] args) {
	 GreenTea obj=new GreenTea();
	 obj.prepareTea();

	}

}
