package ar.edu.unlam.pb2.alumno;

import java.time.LocalDate;

public class AlumnoDeSecundaria extends Alumno {

	public AlumnoDeSecundaria(Integer dni, String nombreDelEstudiante, LocalDate fechaDeNac) {
		super(dni, nombreDelEstudiante, fechaDeNac);
		
		super.dni=dni;
		super.nombreDelEstudiante=nombreDelEstudiante;
		super.fechaDeNac=fechaDeNac;
	}
	
}


