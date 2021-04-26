package torneo;

public class Persona {

	private String nombre;
	private String telefono;
	private int edad;
	private String dni;
	
	
	public Persona(String nombre, String telefono, int edad, String dni) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
		this.edad = edad;
		this.dni = dni;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
}
