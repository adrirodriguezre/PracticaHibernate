package modelo.dao;

import java.util.ArrayList;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import modelo.entidades.Ejemplar;
import modelo.entidades.Libro;
import vista.vo.Conexion;

public class LibroDAO {
	
	public void insertar(Libro libro) {
		
		Session session = Conexion.obtenerSesion();
		session.beginTransaction();
		
		session.save(libro);
		session.getTransaction().commit();
	}
	
	public void modificar(Libro libro) {
		
		Session session = Conexion.obtenerSesion();
		session.beginTransaction();
		
		session.update(libro);
		session.getTransaction().commit();
		
	}
	
	public void borrar(Libro libro) {
		
		Session session = Conexion.obtenerSesion();
		session.beginTransaction();
		
		session.delete(libro);
		session.getTransaction().commit();
	}
	
	public Libro obtenerId(String codLibro) {
		
		Session session = Conexion.obtenerSesion();
		session.beginTransaction();
		
		Libro li = session.get(Libro.class, codLibro);
		
		return li;
		
	}
	
	

}
