package tareaMonedasDescuento;

public class CalcularDivisaSol {

	private double tasaPesos;
    private double tasaDolares;
    private double tasaQuetzales;

    public CalcularDivisaSol(double tasaPesos, double tasaDolares,double tasaQuetzales) {
        this.tasaPesos = tasaPesos;
        this.tasaDolares = tasaDolares;
        this.tasaQuetzales = tasaQuetzales;
    }

    public double convertirSolesAPeso(double cantidadSoles) {
        return cantidadSoles * tasaPesos;
    }
    
    public double convertirSolesADolares(double cantidadSoles) {
        return cantidadSoles * tasaDolares;
    }
    public double convertirSolesAQuetzales(double cantidadSoles) {
        return cantidadSoles * tasaQuetzales;
    }

}

