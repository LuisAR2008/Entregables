package tareaMonedasDescuento;

public class CalcularDivisaPeso {

	
	
	private double tasaSoles;
    private double tasaDolares;
    private double tasaQuetzales;
    

    public CalcularDivisaPeso (double tasaSoles, double tasaDolares,double tasaQuetzales) {
        this.tasaSoles = tasaSoles;
        this.tasaDolares = tasaDolares;
        this.tasaQuetzales = tasaQuetzales;
    }

    public double convertirPesosASoles(double cantidadPesos) {
        return cantidadPesos * tasaSoles;
    }
    
    public double convertirPesosADolares(double cantidadPesos) {
        return cantidadPesos * tasaDolares;
    }
    public double convertirPesosAQuetzales(double cantidadPesos) {
        return cantidadPesos * tasaQuetzales;
    }

}


