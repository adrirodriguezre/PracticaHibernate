package modelo.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

import modelo.entidades.Prestamo;
import modelo.entidades.Usuario;
import vista.vo.Conexion;

public class UsuarioDAO {
	
public void insertar(Usuario usuario) {
		
		try(Session session = Conexion.obtenerSesion()){
			
		
		session.beginTransaction();
		
		session.save(usuario);
		session.getTransaction().commit();
		}
	}
	
	public void modificar(Usuario usuario) {
		
		try(Session session = Conexion.obtenerSesion()){
			session.beginTransaction();
			
			session.update(usuario);
			session.getTransaction().commit();
		}
		
	}
	
	public void borrar(Usuario usuario) {
		
		try(Session session = Conexion.obtenerSesion()){
			
		
		session.beginTransaction();
		//PASAR EL ESTADO A PERSISTENTE
		Usuario usu2=session.get(Usuario.class, usuario.getIdUsuario());
		session.delete(usu2);
		session.getTransaction().commit();
		}
	}
	
	public Usuario obtenerId(Integer idUsuario) {
		
		try(Session session = Conexion.obtenerSesion()){
			
		session.beginTransaction();
		Usuario usu = session.get(Usuario.class, idUsuario);
		return usu;
		}
	}
	
	public Usuario obtenerPorDni(String dni) {
		
		List<Usuario> listaUsu;
		
		try(Session session = Conexion.obtenerSesion()){
			
			System.out.println("Introducir un DNI: ");
			Query<Usuario> q = session.createQuery("FROM Usuario WHERE dni = :dni");
			q.setParameter("dni", dni);
			q.setReadOnly(true);
			
			listaUsu = q.getResultList();
			
		}
		return listaUsu.get(0);
	} 
	
	public Usuario obtenerUsuariosPorPrestamo() {
		
		List<Prestamo> listaUsu;
		
		try(Session session = Conexion.obtenerSesion()){
			
			Query<Prestamo> q = session.createQuery("FROM Prestamo");
			
			listaUsu = q.getResultList();
			
		}
		return listaUsu.get(0).getUsuario();
	} 

}
