package tareaCalculadora;

import java.util.Scanner;

//Cálculo del promedio de números flotantes usando clases
public class PromedioNumeros {

 public static double promedioNumero (double numeros[]) {
    	 
	  if (numeros.length == 0) {
          return 0;   
      }

      double total = 0;
      for (double numero : numeros) {
          total += numero;
      }
      double promedio = total / numeros.length;
      return promedio;
     }
	
	public static void main(String[] args) {
		
		int cantidadNumeros;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa la cantidad de Numeros a calcular ");
		cantidadNumeros = entrada.nextInt();
		
		 double[] numeros = new double[cantidadNumeros];
	       
		 for (int i = 0; i < cantidadNumeros; i++) {
	            System.out.print("Ingrese el número " + (i + 1) +":\n");
	            numeros[i] = entrada.nextDouble();
	        }
		
		 double resultado =(float) promedioNumero(numeros);
		 String resultado1 = String.format("%.2f",resultado);
	     System.out.println("El promedio es: " + resultado1);
		
		entrada.close();
	}

}
