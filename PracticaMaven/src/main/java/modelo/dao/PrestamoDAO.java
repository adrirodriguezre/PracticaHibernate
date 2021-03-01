package modelo.dao;

import java.util.ArrayList;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import modelo.entidades.Libro;
import modelo.entidades.Prestamo;
import vista.vo.Conexion;

public class PrestamoDAO {
	
	public void insertar(Prestamo prestamo) {
		
		Session session = Conexion.obtenerSesion();
		session.beginTransaction();
		
		session.save(prestamo);
		session.getTransaction().commit();
	}
	
	public void modificar(Prestamo prestamo) {
		
		Session session = Conexion.obtenerSesion();
		session.beginTransaction();
		
		session.update(prestamo);
		session.getTransaction().commit();
		
	}
	
	public void borrar(Prestamo prestamo) {
		
		Session session = Conexion.obtenerSesion();
		session.beginTransaction();
		
		session.delete(prestamo);
		session.getTransaction().commit();
	}
	
	public Prestamo obtenerId(Integer idPrestamo) {
		
		Session session = Conexion.obtenerSesion();
		session.beginTransaction();
		
		Prestamo pr = session.get(Prestamo.class, idPrestamo);
		
		return pr;
		
	}

}
