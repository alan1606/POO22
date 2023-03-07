package modificadores;

public class Planta {

	private String nombre;
	private int clorofila;
	private int edad;
	
	public Planta(String nombre, int clorofila, int edad) {
		this.nombre = nombre;
		this.clorofila = clorofila;
		this.edad = edad;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getClorofila() {
		return clorofila;
	}
	public void setClorofila(int clorofila) {
		this.clorofila = clorofila;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	
	
}
