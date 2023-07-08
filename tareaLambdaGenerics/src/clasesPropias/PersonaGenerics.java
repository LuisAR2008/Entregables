package clasesPropias;

import java.util.ArrayList;

public class PersonaGenerics <T,N> {
	private T nombre;
	private N edad;
	
	
	public PersonaGenerics (T nombre, N edad){
		
		this.nombre = nombre;
		this.edad = edad;
	
	}

	public T getNombre() {
		return nombre;
	}

	public void addNombre(T nombre) {
		this.nombre = nombre;
	
	}

	public N getEdad() {
		return edad;
	}

	public void addEdad(N edad) {
		this.edad = edad;
		
	}

	@Override
	public String toString() {
		return " [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	
}

