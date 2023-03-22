package mediosTransporte;

public abstract class Aereo implements MediosDeTransporte{
	
	//Atributos
	String aerodinamica;
	String piloto;
	String motor;
	
	//Métodos
	abstract void volar();
	abstract void atterizar();
}
