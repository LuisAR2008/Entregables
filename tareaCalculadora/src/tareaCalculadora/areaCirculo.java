package tareaCalculadora;


//Cálculo del área de un círculo utilizando números flotantes usando clases
import java.util.Scanner;

public class areaCirculo {
	
	public static double areaCir (double pi, double radio) {
   	 
	 pi = Math.PI;                       //Constante del paquete java.lang
   	 double area= pi*(radio*radio);
   	 return area;
    }
    

	public static void main(String[] args) {

           
		Scanner entrada = new Scanner(System.in);
		System.out.print("Calculadora del area de un circulo\n");
		System.out.print("Ingresa el valor del radio: \n");
		float radio = entrada.nextFloat();
		
		double areaCirculo = areaCir(Math.PI , radio);
		String resultado = String.format("%.2f",areaCirculo); //String.format  para especificar que se desea formatear el número con dos decimales
		System.out.print("El Area del circulo es: \n"+resultado);		
		
		entrada.close();
	}

}
