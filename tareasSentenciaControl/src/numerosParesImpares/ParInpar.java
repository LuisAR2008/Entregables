package numerosParesImpares;

public class ParInpar {

	int num =0;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	
	 public boolean esPar() {
	        return num% 2 == 0;
	    }

	 public boolean esPrimo() {
	        if (num < 2) {
	            return false;
	        }

	        for (int i = 2; i <= Math.sqrt(num); i++) {
	            if (num % i == 0) {
	                return false;
	            }
	        }
	        return true;
	
	    }	
}
