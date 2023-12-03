package ar.edu.unlam.pb2.alumno;

import java.time.LocalDate;

public class AlumnoDePrimaria  extends Alumno{

	public AlumnoDePrimaria(Integer dni, String nombreDelEstudiante, LocalDate fechaDeNac) {
		super(dni, nombreDelEstudiante, fechaDeNac);
		super.dni=dni;
		super.nombreDelEstudiante=nombreDelEstudiante;
	}

	@Override
	public void asistir(LocalDate now) {
	
		
		
	}
	@Override

	public boolean asistio(LocalDate now) {
		
		return false;
	}

}
