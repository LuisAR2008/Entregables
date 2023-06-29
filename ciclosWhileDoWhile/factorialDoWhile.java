package ciclosWhileDoWhile;

import java.util.Scanner;

public class factorialDoWhile {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("ingresa un numero para calcular su Factorial:");
		int numero = input.nextInt();
		int contador = 1;
		int factorial=1;
		do {
			factorial = factorial*contador;
			contador++;
			
		    
		}while (contador <= numero);
		System.out.println("el factorial de " +numero+ " es: "+factorial);
		input.close();
	}

}
