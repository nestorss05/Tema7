package ejercicioB1_05;

import java.util.HashMap;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		// HashMap series: lista de series
		HashMap<String, String> series = new HashMap<>();
		
		// int opcion: opcion elegida por el usuario
		int opcion = 0;
		
		// String nombre: nombre de la serie
		String nombre;
		
		// String valor: valor de la serie
		String valor;
		
		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Do-While: se ejecutara el programa mientras que la opcion no sea 4
		do {
			
			// Muestra el menu
			mostrarMenu();
			
			// Pide al usuario una opcion
			opcion = sc.nextInt();
			
			// Switch opcion: por cada opcion, se ejecutara una accion en cuestion
			switch (opcion) {
			
			// Case 1: agrega una serie
			case 1 -> {
				
				// Pide al usuario el nombre de la serie
				System.out.println("Inserta el nombre de la serie a añadir");
				nombre = sc.nextLine();
				
				// Pide al usuario una valoracion para la serie
				System.out.println("Inserta una valoracion para la serie");
				valor = sc.nextLine();
				
				// Añade la serie al HashMap
				series.put(nombre, valor);
				System.out.println("Añadido correctamente");
				
			} // Fin Case 1
			
			// Case 2: busca una serie
			case 2 -> {
				
				// Pide al usuario el nombre de la serie
				System.out.println("Inserta el nombre de la serie a eliminar");
				nombre = sc.nextLine();
				
				// If-Else: si se encuentra la serie, muestralo por pantalla
				if(series.containsKey(nombre)) {
					System.out.println(nombre + ": " + series.get(nombre));
				} else {
					System.out.println("ERROR: serie no encontrada");
				} // Fin If-Else
				
			} // Fin Case 2
			
			// Case 3: elimina una serie
			case 3 -> {
				
				// Pide al usuario el nombre de la serie
				System.out.println("Inserta el nombre de la serie a eliminar");
				nombre = sc.nextLine();
				
				// If-Else: si se encuentra la serie, quitala del HashMap
				if(series.containsKey(nombre)) {
					series.remove(nombre);
				} else {
					System.out.println("ERROR: serie no encontrada");
				} // Fin If-Else
				
			} // Fin Case 3
			
			// Case 4: sal del programa
			case 4 -> {
				System.out.println("Saliendo del programa...");
			} // Fin Case 4
			
			// Default: opcion invalida
			default -> {
				System.out.println("ERROR: opcion invalida");
			} // Fin Default
			
			} // Fin Switch
			
		} while (opcion != 4); // Fin Do-While
		
		// Cierra el Scanner
		sc.close();
		
	}
	
	private static void mostrarMenu() {
		System.out.println("1. Agregar serie");
		System.out.println("2. Buscar serie");
		System.out.println("3. Eliminar serie");
		System.out.println("4. Salir");
	}

}
