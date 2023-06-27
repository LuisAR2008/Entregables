package validarNumeros;

public class VerificaNumeros {

	private int numero;
	
	public int getNumero() {
		
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String validarNumero() {
		
		if (numero > 0) {
			return "El numero es positivo";
		
		}else if (numero < 0) {
			return "El numero es negativo";
		
		}else {
			
			return "El numero es cero"; 
		}
		
	}
}
