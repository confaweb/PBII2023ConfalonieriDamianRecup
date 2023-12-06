package ar.edu.unlam.pb2.docente;

import java.util.HashSet;
import java.util.Set;

import ar.edu.unlam.pb2.competencia.Grado;
import ar.edu.unlam.pb2.interfaces.Competencia;

public class Docente implements Competencia {

	private String nombreDocente;
	private Integer dniDocente;
	private Grado grado;
	private Set<Grado> competencias;



	public Docente(String nombreDocente,Integer dniDocente ) {
		this.nombreDocente=nombreDocente;
		this.dniDocente=dniDocente;
		this.competencias= new HashSet<Grado>();
	}




public String getNombreDocente() {
	return nombreDocente;
}


public void setNombreDocente(String nombreDocente) {
	this.nombreDocente = nombreDocente;
}


public Integer getDniDocente() {
	return dniDocente;
}


public void setDniDocente(Integer dniDocente) {
	this.dniDocente = dniDocente;
}


public Grado getGrado() {
	return grado;
}


public void setGrado(Grado grado) {
	this.grado = grado;
}


public Set<Grado> getCompetencia() {
	return competencias;
}


public void setCompetencia(Set<Grado> competencia) {
	this.competencias = competencia;
}
@Override
public void agregarCompetencia(Grado cuarto) {
	cuarto =Grado.CUARTO;
	competencias.add(cuarto);
	
}


}
