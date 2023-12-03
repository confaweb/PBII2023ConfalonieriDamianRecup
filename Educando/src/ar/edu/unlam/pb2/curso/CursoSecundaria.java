package ar.edu.unlam.pb2.curso;

import ar.edu.unlam.pb2.competencia.Anio;

public class CursoSecundaria extends Curso {

	private Anio anio;

	public CursoSecundaria(String descripciondelCurso, Integer cL, Integer edad, Anio anio) {
		super(descripciondelCurso, cL, edad);
		super.descripcionDelcurso = descripcionDelcurso;
		super.cL = cL;
		super.edad = edad;
		this.anio=anio;
	}

	public Anio getAnio() {
		return anio;
	}

	public void setAnio(Anio anio) {
		this.anio = anio;
	}

}
