package ciclosWhileDoWhile;

import java.util.Scanner;


/*Perdir números hasta que ingrese un número negativo mayor a 5*/

public class NumerosPositivos {

	public static void main(String[] args) {
		

		Scanner input = new Scanner(System.in);
        int numero;

        System.out.println("Ingresa números positivos");
        System.out.println("Ingresa un numero negativo mayor a -5 para terminar:");
		    
         	do {
         		System.out.print("Ingrese un número: ");
         		numero = input.nextInt();

         			if (numero > -5 && numero < 0) {
		                System.out.println("Número negativo mayor a -5 ingresado. Terminando el programa...");
		                break;
		            }

         	} while (true);
		        
         	    System.out.println("Programa terminado.");
		        input.close();  
		    }
	}


