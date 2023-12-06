package ar.edu.unlam.pb2.alumno;

import java.time.LocalDate;

import ar.edu.unlam.pb2.competencia.Grado;

public class AlumnoDePrimaria  extends Alumno{

	public AlumnoDePrimaria(Integer dni, String nombreDelEstudiante, LocalDate fechaDeNac,Grado grado) {
		super(dni, nombreDelEstudiante, fechaDeNac);
		super.dni=dni;
		super.nombreDelEstudiante=nombreDelEstudiante;
	}

	@Override
	public void asistir(LocalDate fecha) {
	if (fecha==LocalDate.now())
		super.setPresente(true);
	super.setPresente(false);
		
		
		
	}
	@Override

	public Boolean asistio(LocalDate fecha) {
		Boolean asistio=false;
		if(super.getPresente()==true)
			asistio=true;
		return asistio;
	}

}
