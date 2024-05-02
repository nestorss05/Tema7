package ejercicioB1_04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		// ArrayList listaNombres: lista de nombres
		ArrayList<String> listaNombres = new ArrayList<>();
		
		// int contadorNombres: contador de nombres
		int contadorNombres = 0;
		
		// String nombre: nombre a insertar
		String nombre;
		
		// Inicia el Scanner
		Scanner sc = new Scanner(System.in);
		
		// While: añade cinco nombres
		while (contadorNombres != 5) {
			contadorNombres++;
			System.out.println("Inserta un nombre");
			nombre = sc.nextLine();
			listaNombres.add(nombre);
		} // Fin While
		
		// Invierte la lista
		Collections.reverse(listaNombres);		
		
		// Muestra la lista por pantalla
		System.out.println(listaNombres.toString());
		
		// Cierra el Scanner
		sc.close();
		
	}

}