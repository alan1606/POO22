
public class Main {
	public static void main
	(String[] args) 
	{
		Coffee coffee = 
		new Coffee(
				"Brown", 
				"Dark",
				"Starb", 
				"Arabic",
				false,
				10);
		
		System.out.println(coffee.color);
		
		Coffee c2 = new Coffee("Gila");
		
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
