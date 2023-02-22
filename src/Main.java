
public class Main {
	public static void main
	(String[] args) 
	{
		Coffee coffee = new Coffee();
		//Attr
		coffee.blend = "Arabic";
		coffee.brand = "Estarbuks";
		coffee.color = "Brown";
		coffee.isEmpty = true;
		coffee.sugar = 10;
		coffee.toast = "Dark";
		
		//Methods
		coffee.drink();
		coffee.refill();
		coffee.addSugar(10);
		
		System.out.println(coffee.sugar);
		
		if(coffee.isEmpty) {
			coffee.refill();
		}
		else {
			coffee.drink();
		}
		
	}
}
