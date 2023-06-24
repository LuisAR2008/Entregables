package tareaMonedasDescuento;

public class CalcularDivisaQuetzal {

	private double tasaPesos;
    private double tasaDolares;
    private double tasaSoles;

    public CalcularDivisaQuetzal(double tasaPesos, double tasaDolares,double tasaSoles) {
        this.tasaPesos = tasaPesos;
        this.tasaDolares = tasaDolares;
        this.tasaSoles = tasaSoles;
    }

    public double convertirQuetzalAPeso(double cantidadQuetzales) {
        return cantidadQuetzales * tasaPesos;
    }
    
    public double convertirQuetzalADolares(double cantidadQuetzales) {
        return cantidadQuetzales * tasaDolares;
    }
    public double convertirQuetzalASoles(double cantidadQuetzales) {
        return cantidadQuetzales * tasaSoles;
    }
}
