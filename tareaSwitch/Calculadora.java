package tareaSwitch;

import java.util.Scanner;

public class Calculadora {

     public static double sumar (double numero1, double numero2) {
    	 
    	 double resultado= numero1+numero2;
    	 return resultado;
     }
     
     public static double restar (double numero1, double numero2) {
    	 
    	 double resultado= numero1-numero2;
    	 return resultado;
     }
     
     public static double multiplicar (double numero1, double numero2) {
    	 
    	 double resultado= numero1*numero2;
    	 return resultado;
     }
	
     public static double dividir (double numero1, double numero2) {
    
    	 if (numero2 != 0) {
    	     return numero1 / numero2;   	      
    	       
     }else {    	 
    	 	return Double.NaN;  //En Java, NaN (Not-a-Number) es una constante especial 
    	 	                    //del tipo de dato double que representa un valor 
        	                    //numérico no válido o indefinido.
    	 
     }
    	  
     }  
     
     public static void opciones() {
         System.out.println("----- MENÚ -----");
         System.out.println("1. Suma");
         System.out.println("2. Resta");
         System.out.println("3. multiplicacion");
         System.out.println("4. Division");
         System.out.println("5. Salir");
         System.out.print("Selecciona una opción: \n\n");
     }
    
    		
	public static void main(String[] args) {
		
		double numero1, numero2;
		int opcion=0;
		
		Scanner entrada = new Scanner(System.in);
        
        do {
            opciones();
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingresa numero1");
                    numero1 = entrada.nextDouble();
                    System.out.println("Ingresa numero2");
                    numero2 = entrada.nextDouble();
                    double suma = sumar(numero1, numero2);
                    System.out.println("El resultado  de la suma es:\n"+suma);                 
                    break;
                case 2:
                	 System.out.println("Ingresa numero1");
                     numero1 = entrada.nextDouble();
                     System.out.println("Ingresa numero2");
                     numero2 = entrada.nextDouble();
                     double resta = restar(numero1, numero2);
                     System.out.println("El resultado de la resta es:"+resta); 
                    break;
                case 3:
                	 System.out.println("Ingresa numero1");
                     numero1 = entrada.nextDouble();
                     System.out.println("Ingresa numero2");
                     numero2 = entrada.nextDouble();
                     double mult = multiplicar(numero1, numero2);
                     System.out.println("El resultado de la multiplicación es:"+mult); 
                    break;
                case 4:
                	 System.out.println("Ingresa numero1");
                     numero1 = entrada.nextDouble();
                     System.out.println("Ingresa numero2");
                     numero2 = entrada.nextDouble();
                                          
                     double division = dividir(numero1, numero2);
                     if (division == Double.NaN) {
                         System.out.println("El resultado de la división es: " + division);
                     } else {
                         System.out.println("La operación no se puede realizar.");
                     }                  
                    break;
                case 5:
                	System.out.println("Saliendo de la calculadora...");
                    break;
               default:
                    System.out.println("Opción inválida.");
                    break;
            }
        } while (opcion != 6);

   entrada.close();   
	     
	     
	  
	     
	     

	}

}