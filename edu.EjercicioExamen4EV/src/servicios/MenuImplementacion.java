package servicios;

import java.util.Scanner;

public class MenuImplementacion implements MenuInterfaz{

	Scanner sc = new Scanner(System.in);
	
	public int menuPrincipal() {
		
		int opcionUsuario;
		
		System.out.println("BIENVENIDO");
		System.out.println("-----------------");
		System.out.println("0. CERRAR MENU");
		System.out.println("1. REGISTRO DE LLEGADA");
		System.out.println("2. LISTADO DE CONSULTAS");
		System.out.println("-----------------");
		System.out.println("SELECCIONE LA OPCION QUE DESEE: ");
		
		opcionUsuario=sc.nextInt();
		
		return opcionUsuario;
	}
	
	public int menuListadoConsultas() {
		
		int opcionUsuario;
		
		System.out.println("0. VOLVER");
		System.out.println("1. MOSTRAR CONSULTAS");
		System.out.println("2. IMPRIMIR CONSULTAS");
		System.out.println("-----------------");
		System.out.println("SELECCIONE LA OPCION QUE DESEE: ");
		
		opcionUsuario=sc.nextInt();
		
		return opcionUsuario;
	}
}
