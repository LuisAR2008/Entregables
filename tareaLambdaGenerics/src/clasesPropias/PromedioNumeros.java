package clasesPropias;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PromedioNumeros {

	public static void main(String[] args) {

			List<Integer> listaNumeros = new ArrayList<>();
			
			Scanner input = new Scanner(System.in);
			System.out.println("A cuantos numeros deseas sacar promedio");
			int totalNumeros = input.nextInt();
			
			System.out.println("Ingresa " +totalNumeros+ " Numeros Enteros:");
			System.out.println("--------------------");
			for (int i = 0; i < totalNumeros; i++) {
				
				System.out.print("Numero"+(i+1)+": ");
				int numIngresado = input.nextInt();
				listaNumeros.add(numIngresado);
				
			}
			
			double promedio = promedioNumeros(listaNumeros);
			System.out.println("El Proedio de los numeros es:\n"+promedio);
			
	}
	
	public static double promedioNumeros(List<Integer> listaNumeros){
		
		double suma = 0;
		
		if (listaNumeros.isEmpty()) {
			return 0.0;
		}
	
		
		for (Integer numero : listaNumeros) {
			
			suma = suma + numero.doubleValue();
		}
		return suma /listaNumeros.size();
	}

}
