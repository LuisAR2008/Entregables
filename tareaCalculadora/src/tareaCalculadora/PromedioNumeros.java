package tareaCalculadora;

import java.util.Scanner;

//Cálculo del promedio de números flotantes usando clases
public class PromedioNumeros {

 public static double promedioNumero (double numero1 , double numero2) {
    	 
    	 double resultado= (numero1+numero2)/2;
    	 return resultado;
     }
	
	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa Numero1");
		double numero1 = entrada.nextDouble();
		
		System.out.println("Ingresa Numero2");
		double numero2 = entrada.nextDouble();
		
		double promedio = promedioNumero(numero1, numero2);
		String resultado = String.format("%.2f",promedio);
		System.out.println("El promedio de los numeros es: "+resultado);
		
		entrada.close();
	}

}
