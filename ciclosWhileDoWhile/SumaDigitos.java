package ciclosWhileDoWhile;

import java.util.Scanner;



/*Calculará la suma de los dígitos de un número 
ingresado por el usuario utilizando un bucle while*/

public class SumaDigitos {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int numero = input.nextInt();
        
        int suma = 0;
        int digitos;
        
        while (numero > 0) {
            digitos = numero % 10; // Obtiene el último dígito del número
            suma = suma +digitos;       // Suma el dígito al total
            numero = numero/ 10;          // Elimina el último dígito del número
        }
        
        System.out.println("La suma de los dígitos es: " + suma);
	}

}
