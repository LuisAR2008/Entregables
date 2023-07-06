package tareaArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OrdenarNumeros {

	public static void main(String[] args) {

		List<Integer> numeros = new ArrayList<>();
		Scanner entrada = new Scanner(System.in);
		
		int cantidadNumeros =5;
		System.out.println("Ingresa 5 numeros enteros");
		System.out.println("***************************");
		
		
		for(int i=0; i<cantidadNumeros; i++) {
			
			System.out.println("Numero"+(i+1)+":");
			int numeroIngresados = entrada.nextInt();
			numeros.add(numeroIngresados);
		}
		
		System.out.println("***************************");
		System.out.println("Los numeros ingresados son:");
		for(Integer num : numeros) {
			System.out.println(num);
		}
		
		Collections.sort(numeros);
		System.out.println("***************************");
		System.out.println("Numeros ordenados:" +numeros);
		
		entrada.close();
	}

}
