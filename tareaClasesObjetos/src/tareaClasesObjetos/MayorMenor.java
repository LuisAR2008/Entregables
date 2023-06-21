/*Confeccionar una clase que permita ingresar tres valores 
por teclado. Luego mostrar el mayor y el menor*/


package tareaClasesObjetos;

import java.util.Scanner;

public class MayorMenor {
	
	
	public static void comparaNum(int a, int b, int c) {
	
		
	int mayor = a;
		
		if (mayor < b){ 
			mayor = b;			
		}
		if (mayor < c) {
			mayor = c;
		}
		
	int menor = a;
	
		if(menor > b) {
			menor = b;
		}
			if(menor > c){
			menor = c;
		}
			System.out.println("El numero Mayor es: " +mayor);
			System.out.println("El numero Menor es: " +menor);
		
	}
	

	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
		  
		  System.out.println("Ingresa el primer numero : ");
		  	int num1 = input.nextInt();
		  System.out.println("Ingresa el segundo numero: ");
		  	int num2 = input.nextInt();
		  System.out.println("Ingresa el tercer numero: " );
		  	int num3 = input.nextInt();
		  	
		  comparaNum (num1 , num2, num3);
		
	input.close();
		
	}

}
