package foreachStream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class filtrarNumeros {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		List<Integer> listaNumeros = new ArrayList<>();
		
		int totalNumeros =10;
		System.out.println("INGRESA 10 NUMEROS ENTEROS");
		System.out.println("++++++++++++++++++++");
		
		for(int i =0; i<totalNumeros; i++) {
			
			System.out.println("Numero"+(i+1)+":");
			int numero = entrada.nextInt();
			entrada.nextLine();
			listaNumeros.add(numero);
		}
	
		
		List<Integer> pares = listaNumeros.stream().filter(num -> num %2 ==0).collect(Collectors.toList());
		
		System.out.println("***********************");
		System.out.println("Los numeros pares son:");
		
		for (Integer integer : pares) {
			System.out.println(+integer);
			
		}
		
		entrada.close();
	}

}
