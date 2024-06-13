package controladores;

import java.util.ArrayList;
import java.util.List;

import dtos.CitaDto;
import servicios.FicheroImplementacion;
import servicios.FicheroInterfaz;
import servicios.MenuImplementacion;
import servicios.MenuInterfaz;
import util.Utilidades;

public class Inicio {

	public static final String RUTACARPETALOGS = "C:\\Users\\apgsm\\eclipse-workspace\\edu.EjercicioExamen4EV\\logs\\";

	public static final String RUTAFICHEROLOG = RUTACARPETALOGS.concat(Utilidades.nombreLog());
	
	public static final String RUTAFICHEROCARGAINICIAL="C:\\Users\\apgsm\\eclipse-workspace\\edu.EjercicioExamen4EV\\citas.txt";
	
	public static List<CitaDto> listaCitas=new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MenuInterfaz mi = new MenuImplementacion();
		FicheroInterfaz fi = new FicheroImplementacion();

		int opcion;
		boolean cerrarMenu = false;
		fi.escribirFicheroLog("HAS ENTRADO");

		try {
			while (!cerrarMenu) {
				
				fi.cargarInicalFichero();
				opcion = mi.menuPrincipal();

				switch (opcion) {

				case 0:
					System.out.println("SE CIERRA EL MENU");
					cerrarMenu = true;
					fi.escribirFicheroLog("SE CIERRA EL MENU");
					break;
				case 1:
					System.out.println("OPCION 1");
					for(CitaDto citas: listaCitas) {
						System.out.println(citas.toString());
					}
					fi.escribirFicheroLog("REGISTRO DE LLEGADA");
					break;
				case 2:
					System.out.println("OPCION 2");

					int opcion2 = mi.menuListadoConsultas();
					fi.escribirFicheroLog("LISTADO DE CONSULTAS");

					switch (opcion2) {
					
					case 0:
						fi.escribirFicheroLog("VOLVER");
						break;
					case 1:
						System.out.println("OPCION 1");
						fi.escribirFicheroLog("MOSTRAR CONSULTAS");
						break;
					case 2:
						System.out.println("OPCION 2");
						fi.escribirFicheroLog("IMPRIMIR CONSULTAS");
						break;
					default:
						System.out.println("LA OPCION SELECCIONADA NO ES CORRECTA O NO EXISTE");
						fi.escribirFicheroLog("LA OPCION SELECCIONADA NO ES CORRECTA O NO EXISTE");
						break;
					}
					break;
				default:
					System.out.println("LA OPCION SELECCIONADA NO ES CORRECTA O NO EXISTE");
					fi.escribirFicheroLog("LA OPCION SELECCIONADA NO ES CORRECTA O NO EXISTE");
					break;
				}
			}
		} catch (Exception ex) {
			System.out.println("ERROR DETECTADO: ".concat(ex.getMessage()));
			fi.escribirFicheroLog("ERROR");
		}
	}

}
