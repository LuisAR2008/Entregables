package tareaSwitch;

import java.util.Scanner;

public class DiaSemana {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Ingresa un numero del 1 al 7:");
		int i = input.nextInt();
		

		switch (i) {
		
		case 1:
			System.out.println(i+": Lunes");
			break;
		case 2:
			System.out.print(i+": Martes");
			break;
		case 3:
			System.out.println(i+" : Miercoles");
			break;
		case 4:
			System.out.println(i+" : Jueves");
			break;
		case 5:
			System.out.println(i+" : Viernes");
			break;
		case 6:
			System.out.println(i+ " : Sabado");
			break;
		case 7:
			System.out.println(i+" : Domingo");
			break;
		default:
			  System.out.println("Numero no valido"); 
		}
		
		input.close();
	}
}

