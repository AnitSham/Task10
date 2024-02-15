package task10;

public class BlackTea extends TeaParent{

	public void prepareTea() {
		System.out.println("Receipe: Black Tea - Boil water for 4 mins then add Tea powder if yiou want add few drops of honey");
	}
	public static void main(String[] args) {
		
BlackTea obj=new BlackTea();
obj.prepareTea();
	}

}
