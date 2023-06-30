package tareaSwitch;

import java.util.Scanner;

public class Menu {
	
	public static void opciones () {
		
		System.out.println("Selecciona una Opcion");
		System.out.println("++++++Menu++++++");
		System.out.println("1. Combo Chico");
		System.out.println("2. Combo Mediano");
		System.out.println("3. Combo Grande");
		System.out.println("4. Combo Jumbo");
		System.out.println("5. Combo Llevar");
		
	}
	
	public static void main(String[] args) {
		
	int opcion=0;	
	Scanner entrada= new Scanner(System.in);
	
		
		do {
			
		opciones();
		opcion = entrada.nextInt();
		
		switch(opcion) {
		
		case 1:
			System.out.println(" +Papas chicas\n +Refresco Chico\n +Hamburguesa");
			break;
		case 2: 
			System.out.println(" +Papas Medianas\n +Refresco Medianas\n +Hamburguesa c/Queso");
			break;
		case 3:
			System.out.println(" +Papas Grandes\n +Refresco Grandes\n +Hamburguesa doble");
			break;
		case 4: 
			System.out.println(" +Papas Jumbo\n +Refresco Jumbo\n +Hamburguesa triple");
			break; 
		case 5:			
			System.out.println(" +Papas Grandes\n +Refresco Grandes\n +Hamburguesa doble");
			break;
		default:
            System.out.println("Opción inválida.");
          
		}
		
		
		}while(opcion !=6 );
	entrada.close();
 }
}