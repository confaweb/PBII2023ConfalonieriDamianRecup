package ar.edu.unlam.pb2.exception;

public class SinCursosDisponiblesException extends Throwable {

	private String message;

	public SinCursosDisponiblesException(String message) {
		super(message);
		this.message=message;
	}

	

}
