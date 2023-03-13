package figuras;

public abstract class Figura {
	private String color;

	//Constructor
	public Figura(String color) {
			this.color = color;
	}

	public abstract double calcularArea();
	
	public abstract double calcularPerimetro();
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}