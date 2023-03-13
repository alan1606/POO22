package ejemploInterfaces;


public class Moto implements MedioTransporte {

	public static int cantidad = 0;
	
	@Override
	public void avanzar() {
		System.out.println("la moto avanza");
	}

	@Override
	public void chocar() {
		System.out.println("la moto choca");
	}

	@Override
	public void frenar() {
		System.out.println("la moto frena");
	}

	@Override
	public void cambiarDireccion(String direccion) {
		System.out.println("la moto va a la: " + direccion);
	}

}
