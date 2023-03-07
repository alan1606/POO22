package modificadores;

public class Profesor {

	//encapsulamiento
	
	/*public -> todo (metodos)
	 *private -> la propia clase
	 *protected -> herencia
	 */
	
	private String nombre;
	private int edad;
	
	public void mostrar() {
		System.out.println(nombre + " " + edad);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	
	
	
}
