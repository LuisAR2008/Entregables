package tareaCalcularIva;

import java.util.Scanner;

public class TestIva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el precio del producto:");
        double precio = entrada.nextDouble();

        CalculaIva result = new CalculaIva(precio);

        double precioConIVA = result.calcularIVA();
        double precioConDescuento = result.calcularDescuento();

        System.out.println("Precio con IVA: " + precioConIVA);
        System.out.println("Precio con descuento: " + precioConDescuento);

        entrada.close();
    }
	

}
