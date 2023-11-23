package ar.edu.unlam.pb2.curso;

import ar.edu.unlam.pb2.competencia.Grado;
import ar.edu.unlam.pb2.docente.Docente;

public class GradoPrimaria extends Curso {

	private Grado grado;
	

	public GradoPrimaria(String descripcionDelcurso, Integer cL, Integer edad, Grado grado) {
		super(descripcionDelcurso, cL, edad);
		super.descripcionDelcurso = descripcionDelcurso;
		super.cL = cL;
		super.edad = edad;
		this.grado=grado;
	}

	

	public void setDocente(Docente susana) {
		// TODO Auto-generated method stub

	}



	public Grado getGrado() {
		return grado;
	}



	public void setGrado(Grado grado) {
		this.grado = grado;
	}

}
