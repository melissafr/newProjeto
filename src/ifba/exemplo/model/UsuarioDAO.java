package ifba.exemplo.model;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;

import ifba.exemplo.util.HibernateUtil;

public class UsuarioDAO {
	public List<Usuario> getlistarTodos(){
		Session s = HibernateUtil.getSessionFactory().openSession();
		SQLQuery query = s.createSQLQuery("select * from usuario");
		query.addEntity(Usuario.class);
		List<Usuario>lista = query.list();
		s.close();
		return lista;
	}

}
