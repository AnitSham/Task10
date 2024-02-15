package task10;

public class HerbalTea extends GreenTea{

	public void prepareTea() {
		System.out.println("Receipe: Herbal Tea - Boil water then add Tea leaves,Ginger,Pepper again boil for 5 mins if you want add few drops of honey");
	}
	public static void main(String[] args) {
		HerbalTea obj=new HerbalTea();
		obj.prepareTea();

	}

}
