package ar.edu.unlam.pb2.curso;

import java.util.Set;
import java.util.TreeSet;

import ar.edu.unlam.pb2.alumno.Alumno;
import ar.edu.unlam.pb2.competencia.Grado;
import ar.edu.unlam.pb2.docente.Docente;
import ar.edu.unlam.pb2.exception.DocenteNoTieneCompetencia;

public class GradoPrimaria extends Curso {

	private Grado grado;
	private Set<Docente> docentesHabilitados ;
	private Set<Alumno> listadoCurso;
	

	public GradoPrimaria(String descripcionDelcurso, Integer cL, Integer edad, Grado grado) {
		super(descripcionDelcurso, cL, edad);
		super.descripcionDelcurso = descripcionDelcurso;
		super.cL = cL;
		super.edad = edad;
		this.grado = grado;
		this.docentesHabilitados= new TreeSet<Docente>();
		this.listadoCurso=new TreeSet<Alumno>();
	}

	public Grado getGrado() {
		return grado;
	}

	public void setGrado(Grado grado) {
		this.grado = grado;
	}
	public Set<Alumno> getListadoCurso() {
		return listadoCurso;
	}

	
	public void setDocente(Docente docente) throws DocenteNoTieneCompetencia {
		for (Docente maestro : docentesHabilitados) {
			if (maestro.getCompetencia().contains(docente.getGrado().equals(this.getGrado())))
				docentesHabilitados.add(docente);
			throw new DocenteNoTieneCompetencia("Docente no tiene competencia para asignarle este Grado");
		}

	}

}
