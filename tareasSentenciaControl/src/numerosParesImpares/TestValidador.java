package numerosParesImpares;

import java.util.Scanner;

public class TestValidador {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Ingresa un numero");
		int numeroIn = input.nextInt();
		
		ParInpar valida = new ParInpar();
		valida.setNum(numeroIn);
		
		int numero = valida.getNum();
		
		if (valida.esPar()) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }

        if (valida.esPrimo()) {
            System.out.println("El número es primo");
        } else {
            System.out.println("El número no es primo");
        }

    
	}

}
