package ar.edu.unlam.pb2;

import java.util.HashSet;
import java.util.Set;

import ar.edu.unlam.pb2.alumno.AlumnoDePrimaria;
import ar.edu.unlam.pb2.curso.Curso;
import ar.edu.unlam.pb2.curso.GradoPrimaria;

public class Escuela {
	private String nombreDeLaEscuela;
	private Set <Curso>gradosOfertadosPrimaria;
	private Set <Curso>cursosOfertadosSecundaria;

	public Escuela(String nombreDeLaEscuela) {
		this.nombreDeLaEscuela=nombreDeLaEscuela;
		this.cursosOfertadosSecundaria=new HashSet<Curso>();
		this.gradosOfertadosPrimaria=new HashSet<Curso>();
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

	public void inscribir(AlumnoDePrimaria alumno, Integer cL) {
		// TODO Auto-generated method stub
		
	}
	
	

}
