package ejemploInterfaces;

public class Main {
	public static void main(String[] args) {
		Moto moto = new Moto();
		acelerar(moto);

		//Llamada a método estático
		Math.abs(2d);
		

		//Llamada a atributo estático de moto
		int cantidadMoto = Moto.cantidad;
		
		Moto.cantidad++;
		
		
	}
	
	public static void acelerar(MedioTransporte transporte) {
		transporte.avanzar();
	}
	
	public void chocar(MedioTransporte transporte) {
		transporte.chocar();
	}
	
	public void frenar(MedioTransporte transporte) {
		transporte.frenar();
	}
	
	public void girar(MedioTransporte transporte, String direccion) {
		transporte.cambiarDireccion(direccion);;
	}
	
}
