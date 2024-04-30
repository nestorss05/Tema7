package ejercicioB1_01;

import java.util.ArrayList;
import java.util.Collections;

public class Principal {

	public static void main(String[] args) {

		// ArrayList numeros: lista de numeros a almacenar
		ArrayList<Integer> numeros = new ArrayList<>();
		
		// int contador: contador que delimita los numeros aleatorios a insertar
		int contador = 0;
		
		// While: se asignaran 10 numeros aleatorios en sus respectivas posiciones
		while (contador < 10) {
			numeros.add((int) ((Math.random() * 10) + 1));
			contador++;
		} // Fin While
		
		// Muestra la tabla original
		System.out.println("Tabla original: " + numeros.toString());
		
		// Mezcla la tabla y muestrala por pantalla
		Collections.shuffle(numeros);
		System.out.println("Tabla aleatoria: " + numeros.toString());
	
	}

}
