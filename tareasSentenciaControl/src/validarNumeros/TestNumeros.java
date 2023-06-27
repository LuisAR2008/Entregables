package validarNumeros;

import java.util.Scanner;

public class TestNumeros {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Ingresa un Numero");
		int numero = input.nextInt();
		
		VerificaNumeros valida = new VerificaNumeros();
		valida.setNumero(numero);
		
	     String resultado = valida.validarNumero();
         System.out.println(resultado);

	     input.close();
		

	}

}
