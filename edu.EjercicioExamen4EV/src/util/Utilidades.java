package util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Utilidades {

	public static String nombreLog() {
		
		LocalDate fechaActual=LocalDate.now();
		DateTimeFormatter fechaFormateada=DateTimeFormatter.ofPattern("ddMMyyyy");
		
		String fechaFormato=fechaActual.format(fechaFormateada);
		
		String nombreLog="log-".concat(fechaFormato).concat(".txt");
		
		return nombreLog;
	}
}
