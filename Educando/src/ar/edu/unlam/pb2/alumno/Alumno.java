package ar.edu.unlam.pb2.alumno;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Alumno {
	protected Integer dni;
	protected String nombreDelEstudiante;
	protected LocalDate fechaDeNac;
	protected Boolean presente;

	public Alumno(Integer dni, String nombreDelEstudiante, LocalDate fechaDeNac) {
		this.dni=dni;
		this.nombreDelEstudiante=nombreDelEstudiante;
		this.fechaDeNac=fechaDeNac;
		
		
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getNombreDelEstudiante() {
		return nombreDelEstudiante;
	}

	public void setNombreDelEstudiante(String nombreDelEstudiante) {
		this.nombreDelEstudiante = nombreDelEstudiante;
	}

	public LocalDate getFechaDeNac() {
		return fechaDeNac;
	}

	public void setFechaDeNac(LocalDate fechaDeNac) {
		this.fechaDeNac = fechaDeNac;
	}
	public Boolean getPresente() {
		return presente;
	}

	public void setPresente(Boolean presente) {
		this.presente = presente;
	}

	public abstract void asistir(LocalDate fecha);
	public abstract Boolean asistio(LocalDate fecha);



	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return Objects.equals(dni, other.dni);
	}

	@Override
	public String toString() {
		return "Alumno [dni=" + dni + ", nombreDelEstudiante=" + nombreDelEstudiante + ", fechaDeNac=" + fechaDeNac
				+ "]";
	}

	
}
