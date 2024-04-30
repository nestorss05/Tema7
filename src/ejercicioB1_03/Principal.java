package ejercicioB1_03;

import java.util.TreeMap;

public class Principal {

	public static void main(String[] args) {

		// String texto: texto a analizar
		String texto = "En un agujero en el suelo, vivia un hobbit. No un agujero humedo, sucio, repugnante, con restos de gusanos y olor a fango, ni tampoco un agujero, seco, desnudo y arenoso, sin nada en que sentarse o que comer: era un agujero-hobbit, y eso significa comodidad";

		// TreeMap caracteres: lista de la cantidad de caracteres en un texto
		TreeMap<Character, Integer> caracteres = new TreeMap<>();

		// Recorre el texto y ve contando las letras
		for (char letra : texto.toCharArray()) {
			
			// If: Analiza si el caracter es una letra, y asignalo a caracteres
			if (Character.isLetter(letra)) {
				letra = Character.toLowerCase(letra);
				caracteres.put(letra, caracteres.getOrDefault(letra, 0) + 1);
			} // Fin If
			
		}

		// Muestra la tabla
		System.out.println("Tabla: " + caracteres.toString());

	}

}
