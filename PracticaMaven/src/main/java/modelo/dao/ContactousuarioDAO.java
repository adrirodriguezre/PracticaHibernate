package modelo.dao;

import java.util.ArrayList;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import modelo.entidades.Autor;
import modelo.entidades.Contactousuario;
import modelo.entidades.Usuario;
import vista.vo.Conexion;

public class ContactousuarioDAO {
	
public void insertar(Contactousuario contactousuario) {
		
		try(Session session = Conexion.obtenerSesion()){
		session.beginTransaction();
		
		session.save(contactousuario);
		session.getTransaction().commit();
		}
	}
	
	public void modificar(Contactousuario contactousuario) {
		
		try(Session session = Conexion.obtenerSesion()){
		session.beginTransaction();
		
		session.update(contactousuario);
		session.getTransaction().commit();
		}
		
	}
	
	public void borrar(Contactousuario contactousuario) {
		
		try(Session session = Conexion.obtenerSesion()){
		session.beginTransaction();
		
		session.delete(contactousuario);
		session.getTransaction().commit();
		}
	}
	
	public Contactousuario obtenerId(Integer idUsuario) {
		
		try(Session session = Conexion.obtenerSesion()){
		session.beginTransaction();
		
		Contactousuario cu = session.get(Contactousuario.class, idUsuario);
		return cu;
		}
	}
	

}
