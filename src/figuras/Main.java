package figuras;

public class Main {
	public static void main(String[] args) {
		
		Circulo circulo = new Circulo("verde", 1.4d);
		Cuadrado cuadrado = new Cuadrado("rojo", 5d);
		
		mostrarArea(circulo);
		mostrarArea(cuadrado);
		
		
	}
	
	public static void mostrarArea(Figura figura) {
		double area = figura.calcularArea();
		System.out.println(area);
	}
	
	public static void mostrarPerimetro(Figura figura) {
		double perimetro = figura.calcularPerimetro();
		System.out.println(perimetro);
	}
	
	
}
