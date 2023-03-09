package figuras;

public class Circulo extends Figura {

	private double radio;
	
	public Circulo(String color, double radio) {
		super(color);
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	@Override
	public double calcularArea() {
		return radio * radio  * Math.PI;
	}

	@Override
	public double calcularPerimetro() {
		return 2 * Math.PI * radio;
	}
	
}
