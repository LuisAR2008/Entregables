package tiposDeDatos;


//Divide los siguiente números: Dados 2 números 17 y 3, 
//encuentra el cociente, el resto de la separación
//y la respuesta real. Datos de prueba: 17 y 3


public class Division {

	public void division () {
		
		System.out.println("Dados los datos de Prueba:\n encuentra el cociente, el resto de la separación\ny la respuesta real. Datos de prueba: 17 y 3\n ");

		int dividendo =17;
		int divisor =3;
		int cociente = dividendo/divisor;
		int residuo = dividendo%divisor;
		float real = (float) dividendo / divisor;
		
		System.out.println("El cociente de la division es:"+cociente);
		System.out.println("El residuo de la division es:"+residuo);
		System.out.println("El resultado real de la division es:"+real);
	}

}
