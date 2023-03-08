package ejercicio;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Object[][] matriz = {
				{"gansito", 8, 0.0},
				{"chocorrol", 7, 0.0},
				{"suavicrema", 7, 0.0},
				{"oreo", 3, 0.0},
				{"negrito", 10, 0.0},
				{"cremax", 9, 0.0},
				{"barritas", 10, 0.0},
				{"madalenas", 5, 0.0},
				{"reabanada", 10, 0.0},
				{"mantecadas", 10, 0.0},
				{"plativolos", 10, 0.0},
				{"emperador", 10, 0.0},
				{"principe", 7, 0.0},
				{"polvoron", 0, 0.0},
				{"maravillas", 6, 0.0},
				{"sponch", 8, 0.0},
				{"chokis", 8, 0.0},
		};
		
		double calificacionMaxima = sumarColumna(1, matriz) * 100;
		
		System.out.println("\tCalificaciones del 1 al 10 puede ser decimal");
		for(int i=0; i<matriz.length; i++) {
			System.out.println("Ingrese la calificacion de "+
				matriz[i][0] + ": ");
			double valor = entrada.nextDouble();
			matriz[i][2] = valor;
		}
		
		double calificacionActual = calificar(matriz);
		double valorReal = calificacionActual/calificacionMaxima*100;
		
		System.out.println("Tienes un " + valorReal);
	}

	private static double sumarColumna(int col, Object[][] matriz) {
		int limite = matriz.length;
		double suma = 0;
		for(int i=0; i<limite; i++) {
			suma += Double.parseDouble(matriz[i][col]+"");
		}
		return suma;
	}
	
	private static double calificar(Object[][] matriz) {
		int limite = matriz.length;
		double suma = 0;
		for(int i=0; i<limite; i++) {
			suma += Double.parseDouble(matriz[i][1]+"") * Double.parseDouble(matriz[i][2]+"");
		}
		return suma;
	}
}
