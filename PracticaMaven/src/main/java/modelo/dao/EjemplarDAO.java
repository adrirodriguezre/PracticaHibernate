package modelo.dao;

import java.util.ArrayList;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import modelo.entidades.Ejemplar;
import modelo.entidades.Usuario;
import vista.vo.Conexion;

public class EjemplarDAO {
	
	public void insertar(Ejemplar ejemplar) {
		
		Session session = Conexion.obtenerSesion();
		session.beginTransaction();
		
		session.save(ejemplar);
		session.getTransaction().commit();
	}
	
	public void modificar(Ejemplar ejemplar) {
		
		Session session = Conexion.obtenerSesion();
		session.beginTransaction();
		
		session.update(ejemplar);
		session.getTransaction().commit();
		
	}
	
	public void borrar(Ejemplar ejemplar) {
		
		Session session = Conexion.obtenerSesion();
		session.beginTransaction();
		
		session.delete(ejemplar);
		session.getTransaction().commit();
	}
	
	public Ejemplar obtenerId(Integer idEjemplar) {
		
		Session session = Conexion.obtenerSesion();
		session.beginTransaction();
		
		Ejemplar ej = session.get(Ejemplar.class, idEjemplar);
		
		return ej;
		
	}

}
