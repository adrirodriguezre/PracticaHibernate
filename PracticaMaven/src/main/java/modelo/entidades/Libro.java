package modelo.entidades;
// Generated 29 ene. 2021 11:51:03 by Hibernate Tools 5.2.12.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Libro generated by hbm2java
 */
public class Libro implements java.io.Serializable {

	private String codLibro;
	private String titulo;
	private String editorial;
	private float precio;
	private Set ejemplars = new HashSet(0);
	private Set Autores = new HashSet(0);

	public Libro() {
	}

	public Libro(String codLibro, String titulo, String editorial, float precio) {
		this.codLibro = codLibro;
		this.titulo = titulo;
		this.editorial = editorial;
		this.precio = precio;
	}

	public Libro(String codLibro, String titulo, String editorial, float precio, Set ejemplars) {
		this.codLibro = codLibro;
		this.titulo = titulo;
		this.editorial = editorial;
		this.precio = precio;
		this.ejemplars = ejemplars;
	}

	public String getCodLibro() {
		return this.codLibro;
	}

	public void setCodLibro(String codLibro) {
		this.codLibro = codLibro;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEditorial() {
		return this.editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public float getPrecio() {
		return this.precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public Set getEjemplars() {
		return this.ejemplars;
	}

	public void setEjemplars(Set ejemplars) {
		this.ejemplars = ejemplars;
	}
	public Set getAutores() {
		return this.Autores;
	}
	public void setAutores(Set Autores) {
		this.Autores=Autores;
	}

}
