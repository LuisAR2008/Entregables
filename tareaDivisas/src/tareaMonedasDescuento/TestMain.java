package tareaMonedasDescuento;

import java.util.Scanner;

public class TestMain {

	public static void opciones() {
        System.out.println("----- Elija su moneda -----");
        System.out.println("1. Peso");
        System.out.println("2. Soles");
        System.out.println("3. Quetzales");
        System.out.println("4. Dolar");
        System.out.println("5. Salir");
        System.out.print("Selecciona una opción: \n\n");
    }
	
	public static void main(String[] args) {
	
		
	
        int opcion=0;
		
		Scanner entrada = new Scanner(System.in);
        
        do {
            opciones();
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                	System.out.println("Ingrese la cantidad de pesos:");
                    double cantidadPesos = entrada.nextDouble();

                    System.out.println("Ingrese la tasa de cambio de pesos a soles:");
                    double tasaPesosSoles = entrada.nextDouble();

                    System.out.println("Ingrese la tasa de cambio de pesos a dólares:");
                    double tasaPesosDolares = entrada.nextDouble();
                    
                    System.out.println("Ingrese la tasa de cambio de pesos a quetzales:");
                    double tasaPesosQuetzales = entrada.nextDouble();

                    CalcularDivisaPeso conversorPeso = new CalcularDivisaPeso(tasaPesosSoles, tasaPesosDolares, tasaPesosQuetzales);

                    double cantidadSoles = conversorPeso.convertirPesosASoles(cantidadPesos);
                    double cantidadDolares = conversorPeso.convertirPesosADolares(cantidadPesos);
                    double cantidadQuetzales = conversorPeso.convertirPesosAQuetzales(cantidadPesos);

                    System.out.println(" pesos son equivalentes a:"+cantidadPesos  );
                    System.out.println(" soles" +cantidadSoles);
                    System.out.println(" dólares"+cantidadDolares);
                    System.out.println(" quetzales"+cantidadQuetzales);
                        
                    break;
                case 2:
                	System.out.println("Ingrese la cantidad de Soles:");
                    double cantidadSoles1 = entrada.nextDouble();

                    System.out.println("Ingrese la tasa de cambio de soles a pesos:");
                    double tasaSolesPeso = entrada.nextDouble();

                    System.out.println("Ingrese la tasa de cambio de soles a dólares:");
                    double tasaSolesDolares = entrada.nextDouble();
                    
                    System.out.println("Ingrese la tasa de cambio de soles a quetzales:");
                    double tasaSolesQuetzales = entrada.nextDouble();

                    CalcularDivisaSol conversorSoles = new CalcularDivisaSol(tasaSolesPeso, tasaSolesDolares, tasaSolesQuetzales);

                    double cantidadPesos1 = conversorSoles.convertirSolesAPeso(cantidadSoles1);
                    double cantidadDolares1 = conversorSoles.convertirSolesADolares(cantidadSoles1);
                    double cantidadQuetzales1 = conversorSoles.convertirSolesAQuetzales(cantidadSoles1);

                    System.out.println(cantidadSoles1+ " Soles son equivalentes a:");
                    System.out.println( " Pesos\n"+cantidadPesos1);
                    System.out.println( " Dólares\n"+cantidadDolares1);
                    System.out.println( " Quetzales\n"+cantidadQuetzales1);
                    break;
                    
                   
                case 3:
                	System.out.println("Ingrese la cantidad de Quetzales:");
                    double cantidadQuetzales2 = entrada.nextDouble();

                    System.out.println("Ingrese la tasa de cambio de Quetzales a pesos:");
                    double tasaQuetzalesPeso = entrada.nextDouble();

                    System.out.println("Ingrese la tasa de cambio de Quetzales a dólares:");
                    double tasaQuetzalesDolares = entrada.nextDouble();
                    
                    System.out.println("Ingrese la tasa de cambio de Quetzales a Soles:");
                    double tasaquetzalesSoles = entrada.nextDouble();

                    CalcularDivisaQuetzal conversorquetzales = new CalcularDivisaQuetzal(tasaQuetzalesPeso, tasaQuetzalesDolares, tasaquetzalesSoles);

                    double cantidadPesos2 = conversorquetzales.convertirQuetzalAPeso(cantidadQuetzales2);
                    double cantidadDolares2 = conversorquetzales.convertirQuetzalADolares(cantidadQuetzales2);
                    double cantidadSoles2 = conversorquetzales.convertirQuetzalASoles(cantidadQuetzales2);

                    System.out.println(cantidadQuetzales2+ " Quetzales son equivalentes a:");
                    System.out.println( " Pesos\n"+cantidadPesos2);
                    System.out.println( " Dólares\n"+cantidadDolares2);
                    System.out.println( " Soles\n"+cantidadSoles2);
                  
                    break;
                case 4:
                	System.out.println("Ingrese la cantidad de Dolares:");
                    double cantidadDolares3 = entrada.nextDouble();

                    System.out.println("Ingrese la tasa de cambio de Dolares a pesos:");
                    double tasaDolaresPeso = entrada.nextDouble();

                    System.out.println("Ingrese la tasa de cambio de Dólares a Quetzales:");
                    double tasaDolaresQuetzales = entrada.nextDouble();
                    
                    System.out.println("Ingrese la tasa de cambio de Dólares a Soles:");
                    double tasaDolaresSoles = entrada.nextDouble();

                    CalcularDivisaDolar conversordolares = new CalcularDivisaDolar(tasaDolaresPeso, tasaDolaresQuetzales, tasaDolaresSoles);

                    double cantidadPesos3 = conversordolares.convertirDolarAPeso(cantidadDolares3);
                    double cantidadQuetzales3 = conversordolares.convertirDolarAQuetzales(cantidadDolares3);
                    double cantidadSoles3 = conversordolares.convertirDolarASoles(cantidadDolares3);

                    System.out.println(cantidadDolares3+ " Dolarea son equivalentes a:");
                    System.out.println( " Pesos\n"+cantidadPesos3);
                    System.out.println( " Dólares\n"+cantidadQuetzales3);
                    System.out.println( " Soles\n"+cantidadSoles3);
                    break;
                case 5:
                	System.out.println("Saliendo de la calculadora...");
                    break;
               default:
                    System.out.println("Opción inválida.");
                    break;
            }
        } while (opcion != 6);

   entrada.close();   
	     
	}
}
