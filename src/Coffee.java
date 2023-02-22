
public class Coffee {
	//Attributes
	String color;
	String toast;
	String brand;
	String blend;
	boolean isEmpty;
	int sugar;
	
	//Constructor
	//Inciailizar valores
	Coffee(String color, 
		   String toast,
		   String brand,
		   String blend,
		   boolean isEmpty,
		   int sugar){
		this.color=color;
		this.toast=toast;
		this.brand=brand;
		this.blend=blend;
		this.isEmpty=isEmpty;
		this.sugar=sugar;
	}
	
	Coffee(String brand){
		this.brand = brand;
	}
	
	//Constructor por defecto
	Coffee(){}
	
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
