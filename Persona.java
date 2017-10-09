package serializacion;

import java.io.Serializable;

public class Persona implements Serializable{
	
	private String nombre;
	private  String edad;
	private Genero genero;
	private String telefono;
	private String correo;
	
	
	public Persona(String nombre, String edad, Genero genero) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
	}

	
	public Persona(String nombre, String edad, Genero genero, String telefono, String correo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
		this.telefono = telefono;
		this.correo = correo;
	}

	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}


	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}


	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + "]";
	}
	
	


}
