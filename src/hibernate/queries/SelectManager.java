package hibernate.queries;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import hibernate.pojo.HibernateObject;
import hibernate.pojo.Word;

@SuppressWarnings("unchecked")
public class SelectManager {
	

	public static List<Word> selectAllWords() {
		return (List<Word>)(List<?>)executeTransaction("From Word");
	}
	
	public static List<Word> selectWord(String pstrWord) {
		return (List<Word>)(List<?>)executeTransaction("From Word Where fstrWord = '" + pstrWord + "'");
	}
	
	public static List<HibernateObject> executeTransaction(String HQL) {
		Session session = HibernateConnection
				.getSessionFactory()
                .openSession();
        session.beginTransaction();
        
        Query<HibernateObject> query = session.createQuery(HQL);
        List<HibernateObject> hoList = query.list();
        
        session.getTransaction().commit();
        session.close();
        
        return hoList;
	}

}
