package tareaCalcularIva;

public class CalculaIva {

	 private double precio;

	    public CalculaIva(double precio) {
	        this.precio = precio;
	    }

	    public double calcularIVA() {
	        double iva = precio * 0.16;
	        return precio + iva;
	    }

	    public double calcularDescuento() {
	        double descuento;
	        if (precio > 50) {
	            descuento = precio * 0.1;
	        } else {
	            descuento = precio * 0.05;
	        }
	        return precio - descuento;
	    }
}
