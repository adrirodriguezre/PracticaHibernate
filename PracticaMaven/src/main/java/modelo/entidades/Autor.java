package modelo.entidades;
// Generated 29 ene. 2021 11:51:03 by Hibernate Tools 5.2.12.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Autor generated by hbm2java
 */
public class Autor implements java.io.Serializable {

	private Integer idAutor;
	private String nombre;
	private String apellidos;

	private Set Libros = new HashSet(0);

	public Autor() {
	}

	public Autor(String nombre, String apellidos) {
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	public Integer getIdAutor() {
		return this.idAutor;
	}

	public void setIdAutor(Integer idAutor) {
		this.idAutor = idAutor;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return this.apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public Set getLibros() {
		return this.Libros;
		
	}
	public void setLibros(Set Libros) {
		this.Libros=Libros;
	}

}
