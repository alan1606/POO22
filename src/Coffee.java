
public class Coffee {
	//Attributes
	String color;
	String toast;
	String brand;
	String blend;
	boolean isEmpty;
	int sugar;
	
	//Methods
	void drink() {
		System.out.println(
		"I am drinking the coffee");
	}
	
	void refill() {
		System.out.println(
		"Coffee is refilling");
	}
	
	void addSugar(int quantity) {
		System.out.println(
		"Adding " + quantity 
		+ " sugar"
	    );
		sugar += quantity;
	}
}
