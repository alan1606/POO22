class Persona{
	String nombre;
	String sexo;
	Integer edad;
	
	void respirar() {
		System.out.println
		("La persona respira");
	}
	
	void comer() {
		System.out.println
		("La persona come");
	}
	
	void dormir() {
		System.out.println
		("La persona duerme");
	}
}

class Alumno extends Persona{
	String uniforme;
	String matricula;
	String carrera;
	
	void estudiar() {
		System.out.println
		("El alumno estudia");
	}
	void tomarClase() {
		System.out.println
		("El alumno toma clase");
	}
}

class Profesor extends Persona{
	String matricula;
	String rfc;
	Double salario;
	
	void darClases() {
		System.out.println
		("El profesor da clases");
	}
}

public class Main {
	public static void main(String[] args) {
		Persona persona = new Persona();
		Alumno alumno = new Alumno();
		Profesor profesor = new Profesor();
		
		alumno.respirar();
		alumno.nombre = "Said";
	}
}
