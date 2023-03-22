package excepciones;

import java.util.Scanner;

class EllaNoTeAmaException extends Exception{

	public EllaNoTeAmaException(String message) {
		super(message);
	}
	
}

public class Excepciones {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		try {
			System.out.println("Ingrese un numero ");
			int x = entrada.nextInt();

			System.out.println(x);
		} catch (RuntimeException ex) {
			System.out.println("Ocurrió un error ");
			System.out.println(ex.getMessage());
		}
		
		try {
			int y = 5/1;
			System.out.println(y);
		} catch (ArithmeticException e) {
			
		}
		catch(RuntimeException re) {
			
		}
		catch(Exception general) {
			
		}
		finally {
			System.out.println("Se ejecuta sí o sí");
		}
		
		
		try {
			volverConElEx(0);
		} catch (EllaNoTeAmaException e) {
			System.out.println("Llorar porque " + 
		e.getMessage());
		}

	}

	private static void volverConElEx(int esfuerzo) throws EllaNoTeAmaException{
		if(esfuerzo > 0 ) {
			throw new EllaNoTeAmaException(" no te ama");
		}
		System.out.println("Ella sí te ama");
	}
}
