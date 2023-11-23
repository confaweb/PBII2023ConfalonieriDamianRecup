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

}
