package vista.vo;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;

import org.hibernate.Session;

import modelo.dao.AutorDAO;
import modelo.dao.ContactousuarioDAO;
import modelo.dao.EjemplarDAO;
import modelo.dao.LibroDAO;
import modelo.dao.PrestamoDAO;
import modelo.dao.UsuarioDAO;
import modelo.entidades.Autor;
import modelo.entidades.Contactousuario;
import modelo.entidades.Ejemplar;
import modelo.entidades.Libro;
import modelo.entidades.Prestamo;
import modelo.entidades.Usuario;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Session session = Conexion.obtenerSesion();
		session.beginTransaction();
        System.out.println("FUNCIONA");
        
        
        //CREAR UN AUTOR
        Autor autor = new Autor();
        AutorDAO autorD= new AutorDAO();
        
        autor.setIdAutor(8);
        autor.setNombre("Juan");
        autor.setApellidos("Castro");
              
        //CREAR UN LIBRO
        Libro libro = new Libro();
        LibroDAO libroD = new LibroDAO();
        
        libro.setCodLibro("reSLppf5hd");
        libro.setEditorial("Anaya");
        libro.setPrecio((float) 25.99);
        libro.setTitulo("Matemáticas científicas");
        
        
        //ASIGNAR AUTOR A LIBRO Y GUARDARLO  
        /*libro.getAutores().add(autor);
        autorD.insertar(autor);
        libroD.insertar(libro);*/
        
        
        //OBTENER AUTOR POR ID
        //autor = autor1.obtenerId(2);
        //System.out.println(autor.getNombre());
        
        
        //CREAR EJEMPLAR DE LIBRO E INTENTAR ELIMINARLO
        Ejemplar ejemplar = new Ejemplar();
        EjemplarDAO ejemplarD = new EjemplarDAO();
        
        ejemplar.setIdEjemplar(2);
        ejemplar.setNumEjemplar(4000);
        ejemplar.setEstado("Gastado");
        ejemplar.setLibro(libro);
        
        //ejemplarD.insertar(ejemplar);
        //ejemplarD.borrar(ejemplar);
        
        
        //CREAR UN USUARIO Y SU CONTACTO USUARIO Y ELIMINARLO
        Usuario usuario = new Usuario();
        UsuarioDAO usuarioD = new UsuarioDAO();
        
        usuario.setIdUsuario(1);
        usuario.setNombre("Juan");
        usuario.setApellidos("Alvarez");
        Date fecha = new Date(93, 10, 12);
        usuario.setFechaNacimiento(fecha);
        
        Contactousuario contactousuario = new Contactousuario();
        ContactousuarioDAO contactousuarioD = new ContactousuarioDAO();
        
        contactousuario.setEmail("correo@gmail.com");
        contactousuario.setTelefonoMovil("637676277");
        contactousuario.setTelefonoFijo("947383821");
        contactousuario.setUsuario(usuario);
        usuario.setContactousuario(contactousuario);
        //INSERTAR
        /*usuarioD.insertar(usuario);
        contactousuarioD.insertar(contactousuario);
        
        usuarioD.borrar(usuario);*/
        
        
        //CREAR UN PRESTAMO PARA UN LIBRO Y ESTE USUARIO Y OBTENER LOS PRESTAMOS
    
        usuario=usuarioD.obtenerId(4);
        ejemplar=ejemplarD.obtenerId(1);
        
        Prestamo prestamo = new Prestamo();
        PrestamoDAO prestamoD = new PrestamoDAO();
        
        prestamo.setIdPrestamo(2);
        Date fechaPr = new Date(121, 11, 18);
        prestamo.setFechaPrestamo(fechaPr);
        Date fechaDev = new Date(122, 8, 25);
        prestamo.setFechaDevolucion(fechaDev);
        prestamo.setEjemplar(ejemplar);
        prestamo.setUsuario(usuario);
        //prestamoD.insertar(prestamo);
        
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int mon = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        Date fechaActual = new Date(year-1900, mon, day);
        
        usuario=usuarioD.obtenerId(4);
        for(Prestamo prest: usuario.getPrestamos()) {
	        //prestamo = prestamoD.obtenerId(3);
	        if(prest.getFechaDevolucion() == null) {
	        	
	        	prest.setFechaDevolucion(fechaActual);
	        	prestamoD.modificar(prest);
	        }
        }
        
	}

}
