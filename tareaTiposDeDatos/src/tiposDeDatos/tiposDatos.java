//Calcula el producto de 3 enteros


package tiposDeDatos;

import java.util.Scanner;

public class tiposDatos {
	
	private int num1, num2, num3;
	private int result, result1;

	
	//Metodo para solicitar datos
	
	public void producto () {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Ingresa numero1:");
		this.num1 = input.nextInt();
		
		System.out.println("Ingresa numero2:");
		this.num2 = input.nextInt();
		
		System.out.println("Ingresa numero3:");
		this.num3 = input.nextInt();
		
		this.result = num1*num2*num3;
		
		System.out.println("El Producto de los 3 numeros es: " +result);
				 
	}
	
	

}

	

