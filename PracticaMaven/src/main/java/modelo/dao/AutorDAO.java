package modelo.dao;

import java.util.ArrayList;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import modelo.entidades.Autor;
import vista.vo.Conexion;

public class AutorDAO {
	
	public void insertar(Autor autor) {
		
		Session session = Conexion.obtenerSesion();
		session.beginTransaction();
		
		session.save(autor);
		session.getTransaction().commit();
	}
	
	public void modificar(Autor autor) {
		
		Session session = Conexion.obtenerSesion();
		session.beginTransaction();
		
		session.update(autor);
		session.getTransaction().commit();
		
	}
	
	public void borrar(Autor autor) {
		
		Session session = Conexion.obtenerSesion();
		session.beginTransaction();
		
		session.delete(autor);
		session.getTransaction().commit();
	}
	
	public Autor obtenerId(Integer idAutor) {
		
		Session session = Conexion.obtenerSesion();
		session.beginTransaction();
		
		Autor au = session.get(Autor.class, idAutor);
		return au;
		
	}

}
