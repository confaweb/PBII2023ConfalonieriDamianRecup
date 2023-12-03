package ar.edu.unlam.pb2.curso;

public   abstract class Curso {
	protected Integer cL;
	protected String descripcionDelcurso;
	protected Integer edad;

	public Curso(String descripciondelCurso, Integer cL, Integer edad) {
		this.cL=cL;
		this.descripcionDelcurso=descripciondelCurso;
		this.edad=edad;
		
	}

	public Integer getcL() {
		return cL;
	}

	public void setcL(Integer cL) {
		this.cL = cL;
	}

	public String getDescripcionDelcurso() {
		return descripcionDelcurso;
	}

	public void setDescripcionDelcurso(String descripcionDelcurso) {
		this.descripcionDelcurso = descripcionDelcurso;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	

}
