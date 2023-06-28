package bucles;

public class SumaCienNumeros {

	
	public static void main(String[] args) {
		
		int suma = 0;
		
		for(int i=1; i<= 100; i++) {
			suma = suma + i;
			System.out.println(suma+ "+" +i);
		} 
		System.out.println("La suma de los numeros es: "+suma);
		
	}

}
