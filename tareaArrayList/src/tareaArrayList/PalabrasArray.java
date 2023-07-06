package tareaArrayList;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class PalabrasArray {

	public static void main(String[] args) {
		
		List<String> palabras = new ArrayList<>();
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa la cantidad de palabras a verificar");
		int cantidadPalabras = entrada.nextInt();
		
		for(int i=0; i < cantidadPalabras; i++) {
			
			System.out.println("Ingresa Palabra "+ (i+1)+":" );
			String palabra = entrada.next();
			palabras.add(palabra);
		}
		System.out.println();
		System.out.println("Las palabras a revisar son: ");
		
		for(String totalPalabras: palabras) {
			System.out.println(totalPalabras);
		}
		System.out.println("-------------------------");
		
		Set<String> unicos = new LinkedHashSet<>(palabras);
		List<String> palabrasSinDuplicados = new ArrayList<>(unicos);
		
		for(String duplicados: palabras) {
			if(unicos.add(duplicados)) {
				palabrasSinDuplicados.add(duplicados);
				System.out.println();
			}
		}
		System.out.println("-------------------------");
		System.out.println("La lista sin palabras duplicadas es: ");
		
		for(String totalPalabras: palabrasSinDuplicados) {
			System.out.println(totalPalabras);
		}
		entrada.close();
	}

}