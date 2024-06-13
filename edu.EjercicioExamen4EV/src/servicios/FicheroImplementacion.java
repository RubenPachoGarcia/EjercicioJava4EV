package servicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import controladores.Inicio;
import dtos.CitaDto;

public class FicheroImplementacion implements FicheroInterfaz {

	public void cargarInicalFichero() throws IOException {

		try {

			FileReader fr = new FileReader(Inicio.RUTAFICHEROCARGAINICIAL);
			BufferedReader br = new BufferedReader(fr);
			DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

			String lineas;

			while ((lineas = br.readLine()) != null) {

				String[] campos = lineas.split(";");

				CitaDto cita = new CitaDto();

				cita.setDni(campos[0]);
				cita.setNombre(campos[1]);
				cita.setApellidos(campos[2]);
				cita.setEspecialidad(campos[3]);
				cita.setFechaCita(LocalDateTime.parse(campos[4], formato));
				cita.setAsistenciaCita(Boolean.parseBoolean(campos[5]));

				Inicio.listaCitas.add(cita);
			}
			
			br.close();

		} catch (FileNotFoundException ex) {
			System.out.println("ERROR: ".concat(ex.getMessage()));
		}
	}
	
	public void escribirFicheroLog(String mensaje) {
		
		try {
			
			FileWriter fr=new FileWriter(Inicio.RUTAFICHEROLOG, true);
			BufferedWriter bw=new BufferedWriter(fr);
			bw.write(mensaje.concat("\n"));
			bw.close();
		
		} catch (IOException ex) {
			System.out.println("ERROR: ".concat(ex.getMessage()));
		}
	}
}
