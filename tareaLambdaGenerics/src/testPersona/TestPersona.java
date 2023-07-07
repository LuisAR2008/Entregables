package testPersona;

import java.util.ArrayList;
import java.util.List;

import clasesPropias.Persona;

public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Persona> listaPersonas = new ArrayList<>();
		
		listaPersonas.add(new Persona("Luis", 38));
		listaPersonas.add(new Persona("Ivan", 40));
		listaPersonas.add(new Persona("Pedro", 38));
		listaPersonas.add(new Persona("Gloria", 16));
		listaPersonas.add(new Persona("Daniela", 34));
		listaPersonas.add(new Persona("Matias", 10));
		
		System.out.println("Las personas en la lista son:");
		System.out.println("+++++++++++++++++++++++++++++");
		for (Persona persona : listaPersonas) {
			System.out.println(persona.toString());
		}
		
		System.out.println("++++++++++++++++++++++++++++++");
		System.out.println("Los mayores son:");
		List<Persona> personasMayores = filtrarPersonas(listaPersonas, 35);
		for (Persona persona : personasMayores) {
			System.out.println(persona);
		}
	

	}
	
	 public static List<Persona> filtrarPersonas(List<Persona> personas, int edadMinima) {
	        List<Persona> personasFiltradas = new ArrayList<>();

	        for (Persona persona : personas) {
	            if (persona.getEdad() > edadMinima) {
	                personasFiltradas.add(persona);
	            }
	        }

	        return personasFiltradas;
	    }

}
