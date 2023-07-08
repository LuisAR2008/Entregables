package foreachStream;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ContarCaracteres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> palabras = Arrays.asList("Hoy", "Martes", "Pie", "Jueves", "Mano");
		
		int contador = 0;
		//con foreach
		for (String palabra : palabras) {
			
				if(palabra.length() > 4) {
					contador++;
			}
		}
		System.out.println("--------foreach--------");
		System.out.println("Las palabras en la lista son:\n"+ palabras);
		System.out.println("Cantidad de palabras con mas 4 caracteres: "+contador);
		System.out.println("");
		
		//con streams
		long caracteres = palabras.stream().filter(palabra -> palabra.length() > 4).count();
		
		System.out.println("---------streams--------");
		System.out.println("Las palabras en la lista son:\n"+ palabras);
		System.out.println("Cantidad de palabras con mas 4 caracteres: "+caracteres);
		
		
		//Mostrar palabras en mayusculas con stream
		
		List<String> palabrasMayusculas = palabras.stream()
					.map(String :: toUpperCase )
					.collect(Collectors.toList());
		
		System.out.println("");
		System.out.println("---------streams--------");
		System.out.println("Lista de palabras en Mayuscula: " +palabrasMayusculas);
		
		 // Cambiar a mayúsculas utilizando un bucle foreach
        for (int i = 0; i < palabras.size(); i++) {
        		String palabra = palabras.get(i);
        		palabra = palabra.toUpperCase();
        		palabras.set(i, palabra);
        }

        // Mostrar las palabras en mayúsculas
        System.out.println("");
		System.out.println("---------foreach--------");
        for (String palabra : palabras) {
        		System.out.println(palabra);
        }
	}

}
