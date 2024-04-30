package ejercicioB1_02;

import java.util.LinkedHashSet;

public class Principal {

	public static void main(String[] args) {

		// LinkedHashSet numeros: lista de numeros a almacenar
		LinkedHashSet<Integer> numeros = new LinkedHashSet<>();

		// int contador: contador que delimita los numeros aleatorios a insertar
		int contador = 0;

		// While: se asignaran 10 numeros aleatorios en sus respectivas posiciones
		while (contador < 10) {
			numeros.add((int) ((Math.random() * 20) + 1));
			contador++;
		} // Fin While

		// Muestra la tabla
		System.out.println("Tabla original: " + numeros.toString());

	}

}
