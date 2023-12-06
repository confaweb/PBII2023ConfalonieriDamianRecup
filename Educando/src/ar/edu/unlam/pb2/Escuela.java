package ar.edu.unlam.pb2;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import ar.edu.unlam.pb2.alumno.Alumno;
import ar.edu.unlam.pb2.alumno.AlumnoDePrimaria;
import ar.edu.unlam.pb2.curso.Curso;
import ar.edu.unlam.pb2.curso.GradoPrimaria;
import ar.edu.unlam.pb2.exception.NoEstaHabilitadoException;
import ar.edu.unlam.pb2.exception.SinCursosDisponiblesException;

public class Escuela {
	private String nombreDeLaEscuela;
	private Set <Curso>gradosOfertadosPrimaria;
	private Set <Curso>cursosOfertadosSecundaria;
	private Map <Alumno,Integer>inscriptosCicloLectivo;


	public Escuela(String nombreDeLaEscuela) {
		this.nombreDeLaEscuela=nombreDeLaEscuela;
		this.cursosOfertadosSecundaria=new HashSet<Curso>();
		this.gradosOfertadosPrimaria=new HashSet<Curso>();
		this.inscriptosCicloLectivo=new HashMap<Alumno, Integer>();
	}
	public String getNombreDeLaEscuela() {
		return nombreDeLaEscuela;
	}
	
	public void setNombreDeLaEscuela(String nombreDeLaEscuela) {
		this.nombreDeLaEscuela = nombreDeLaEscuela;
	}
	public Boolean crearCurso(Curso curso)  {
		Boolean cursoCreado=false;
		cursoCreado=gradosOfertadosPrimaria.add(curso);
		return cursoCreado;
	}

	public void inscribir(AlumnoDePrimaria alumno, Integer cL) throws SinCursosDisponiblesException,NoEstaHabilitadoException{
		if(gradosOfertadosPrimaria.isEmpty())
			throw new SinCursosDisponiblesException("No hay cursos diponibles");
		else if (gradosOfertadosPrimaria. != LocalDate.now().getDayOfYear())
			throw new NoEstaHabilitadoException("El curso no corresponde a este ciclo lectivo");
		inscriptosCicloLectivo.put(alumno, cL);
		
	}
	
	

}
