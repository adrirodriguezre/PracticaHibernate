package vista.vo;

import org.hibernate.Session;

public class Conexion {

	public static Session obtenerSesion() {
		
		return HibernateUtil.getSessionFactory().openSession();
	}

}
