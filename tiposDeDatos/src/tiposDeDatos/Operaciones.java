package tiposDeDatos;

public class Operaciones {
	
	
//Encuentra el significado de las siguientes expresiones. 
//Datos de prueba: -16 + 32 / 4 (48 - 7)% 11 (18 + 2) / (17 - 12) 17 - 18 / 6 * 3 + 11% 4
		
		public void significado() {
			
			System.out.println();
			System.out.println("Dados los datos de Prueba:\n-16 + 32 / 4 (48 - 7)% 11 (18 + 2) / (17 - 12) 17 - 18 / 6 * 3 + 11% 4\n ");
			
		  int   oper1= 48-7,           
			    oper2= 32/4,            
			    oper3= oper2*oper1,     
			    oper4= oper3 %11,      
			    oper5= 18+2,               
			    oper6= 17-12,          
			    oper7= oper5/oper6,     
			    oper8= 18/6,           
			    oper9= oper8*3,        
			    oper10= 11%4,            
		    resultado= (-16 + oper4 * oper7 - oper9 + oper10);  
		  System.out.println("El resultado de la operacion es: " +resultado);
		  System.out.println();
			
		}

}
