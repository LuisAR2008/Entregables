/*Crear una clase donde se ingrese el nombre 
de la persona y su edad, imprimirlo al final y saludar*/



package tareaClasesObjetos;

import java.util.Scanner;

public class NombreSaludo {
	
	public void mostrarMensaje(){
		
		Scanner input =new Scanner(System.in);
	    System.out.println("Escribe tu nombre Por favor");
		String nombre = input.next();
		System.out.println("Escribe tu edad por favor");
		int edad =input.nextInt();
		
		System.out.println("Tu nombre es:  " +nombre);
		System.out.println("Tu edad es:  "+edad);
		
		
		input.close();
		
	}

	public static void main(String[] args) {
		
		NombreSaludo muestraNomEdad = new NombreSaludo();
		muestraNomEdad.mostrarMensaje();
		
	}

}
