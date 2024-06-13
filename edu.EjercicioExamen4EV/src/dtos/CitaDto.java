package dtos;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;

public class CitaDto {

	long id=0;
	String dni="aaaaa";
	String nombre="aaaaa";
	String apellidos="aaaaa";
	String especialidad="aaaaa";
	LocalDateTime fechaCita;
	boolean asistenciaCita;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	public LocalDateTime getFechaCita() {
		return fechaCita;
	}
	public void setFechaCita(LocalDateTime fechaCita) {
		this.fechaCita = fechaCita;
	}
	public boolean isAsistenciaCita() {
		return asistenciaCita;
	}
	public void setAsistenciaCita(boolean asistenciaCita) {
		this.asistenciaCita = asistenciaCita;
	}
	
	public CitaDto(long id, String dni, String nombre, String apellidos, String especialidad, LocalDateTime fechaCita,
			boolean asistenciaCita) {
		super();
		this.id = id;
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.especialidad = especialidad;
		this.fechaCita = fechaCita;
		this.asistenciaCita = asistenciaCita;
	}
	
	public CitaDto() {
		super();
	}
	
	@Override
	public String toString() {
		
		SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		String fechaCitaString=formatoFecha.format(this.fechaCita);
		String asistenciaCitaString=String.valueOf(this.asistenciaCita );
		
		String obejetoString=this.dni.concat(";").concat(this.nombre).concat(";").concat(this.apellidos).concat(";").concat(this.especialidad).concat(";").concat(fechaCitaString).concat(";").concat(asistenciaCitaString);
		return obejetoString;
	}
	
	

}
