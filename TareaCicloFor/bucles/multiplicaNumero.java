package bucles;

import java.util.Scanner;

public class multiplicaNumero {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		boolean comprobar = true;
		
		while (comprobar== true) {
		
		System.out.println("Ingresa un numero entero positivo");
		int numero = input.nextInt();
		
		if (numero>0) {
			
			for(int i=1; i<=10; i++) {
				System.out.println(numero+"*"+i+" = "+numero*i);
				
			} comprobar =false;
			
			}else {
			System.out.println("Numero Incorrecto");
			}
		 }
		input.close();
		}
	}


