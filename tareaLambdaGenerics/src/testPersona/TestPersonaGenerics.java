package testPersona;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import clasesPropias.PersonaGenerics;

public class TestPersonaGenerics {

	public static void main(String[] args) {

		List<PersonaGenerics<String, Integer>> listaPer = new ArrayList<>();		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Cuentos Nombre desea agregar a la lista");
		int totalRagistros = input.nextInt();
		input.nextLine();
		
		int edad = 0;
		for(int i=0; i<totalRagistros; i++) {
			
			System.out.println("Ingresa nombre" +(i+1)+":");
			String nombre = input.nextLine();
		
			System.out.println("Ingresa edad:");
			edad = input.nextInt();
			input.nextLine();
			listaPer.add(new PersonaGenerics<String, Integer>(nombre, edad));
		}
		
		
		System.out.println("Las personas mayores de 30 son:");
		for (PersonaGenerics<String, Integer> personaGenerics : listaPer) {
			
			if (personaGenerics.getEdad() >30) {
				System.out.println(personaGenerics.toString());
			}
		} 
		input.close();
	}
}
