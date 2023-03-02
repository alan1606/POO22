class Persona extends Object{
	String nombre;
	String sexo;
	Integer edad;
	
	Persona(){}
	
	Persona(String nombre, String sexo, Integer edad){
		this.nombre = nombre;
		this.sexo = sexo;
		this.edad = edad;
	}
	
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

	@Override
	public String toString() {
		return String.format("Nombre: %s"
				+ "\nSexo: %s"
				+ "\nEdad: %d", 
				nombre,
				sexo, 
				edad);
	}
	
}

//Extends+
class Alumno extends Persona{
	String uniforme;
	String matricula;
	String carrera;
	
	Alumno(){}
	
	Alumno(String nombre, String sexo, Integer edad,
			String uniforme, String matricula, 
			String carrera){
		super(nombre, sexo, edad);
		
		this.uniforme = uniforme;
		this.matricula = matricula;
		this.carrera = carrera;
	}
	
	void estudiar() {
		System.out.println
		("El alumno estudia");
	}
	void tomarClase() {
		System.out.println
		("El alumno toma clase");
	}
	
	@Override
	public String toString() {
		return String.format("Nombre: %s"
				+ "\nSexo: %s"
				+ "\nEdad: %d"
				+ "\nUniforme: %s"
				+ "\nMatricula: %s"
				+ "\nCarrera: %s", 
				nombre,
				sexo,
				edad,
				uniforme,
				matricula,
				carrera);
	}
}

class Profesor extends Persona{
	String matricula;
	String rfc;
	Double salario;
	
	Profesor(){}
	
	Profesor(String nombre, String sexo, Integer edad,
			String matricula, String rfc,
			Double salario){
		super(nombre, sexo, edad);
		
		this.matricula = matricula;
		this.rfc = rfc;
		this.salario = salario;
	}

	
	void darClases() {
		System.out.println
		("El profesor da clases");
	}
	
	@Override
	public String toString() {
		String padre = super.toString();
		return padre + String.format("\nMatricula: %s"+
				"\nRFC: %s"+
				"\nSalario: %s",
				matricula,
				rfc,
				salario);
	}
}

public class Main {
	public static void main(String[] args) {
		Persona persona = new Persona("Zayra", 
				"Femenino", 15);
		
		Alumno alumno = new Alumno(
				"Homero",
				"Masculino",
				22,
				"Oficial",
				"012323412",
				"TIRD");

		Profesor profesor = new Profesor(
				"Alan",
				"Femenino",
				69,
				"081813015",
				"rfc12314",
				10d
				);
		
		//alumno.respirar();
		
		System.out.println(profesor);
	}
}
