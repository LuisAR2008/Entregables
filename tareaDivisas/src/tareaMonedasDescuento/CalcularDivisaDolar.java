package tareaMonedasDescuento;

public class CalcularDivisaDolar {
	
	private double tasaPesos;
    private double tasaQuetzales;
    private double tasaSoles;

    public CalcularDivisaDolar(double tasaPesos, double tasaQuetzales,double tasaSoles) {
        this.tasaPesos = tasaPesos;
        this.tasaQuetzales = tasaQuetzales;
        this.tasaSoles = tasaSoles;
    }

    public double convertirDolarAPeso(double cantidadDolares) {
        return cantidadDolares * tasaPesos;
    }
    
    public double convertirDolarAQuetzales(double cantidadDolares) {
        return cantidadDolares * tasaQuetzales;
    }
    public double convertirDolarASoles(double cantidadDolares) {
        return cantidadDolares * tasaSoles;
    }

}
