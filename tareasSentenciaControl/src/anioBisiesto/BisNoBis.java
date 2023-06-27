package anioBisiesto;

import java.util.Scanner;

public class BisNoBis{

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Ingresa un año");
		int año = input.nextInt();
		
		if (Bisiesto(año)) {
			
			System.out.println("el año es bisiesto");
		}else {
			System.out.println("El año NO es bisiesto");
		}
		input.close();

	}
	
	 public static boolean Bisiesto(int año) {
	        if (año % 4 != 0) {
	            return false;
	        } else if (año % 100 != 0) {
	            return true;
	        } else if (año % 400 != 0) {
	            return false;
	        } else {
	            return true;
	        }
	    }

}

