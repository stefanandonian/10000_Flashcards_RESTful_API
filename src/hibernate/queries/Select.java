package hibernate.queries;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import hibernate.pojo.Connection;
import hibernate.pojo.Definition;
import hibernate.pojo.HibernateObject;
import hibernate.pojo.Noun;
import hibernate.pojo.SpanishVerbConjugation;
import hibernate.pojo.Word;

@SuppressWarnings("unchecked")
public class Select {
	
	public static List<HibernateObject> executeTransaction(String HQL) {
		Session session = HibernateConnection
				.getSessionFactory()
                .openSession();
		session.beginTransaction();
        
        Query<HibernateObject> query = session.createQuery(HQL);
        System.out.println(query.getQueryString());
        List<HibernateObject> hoList = query.list();
        
        session.getTransaction().commit();
        session.close();
        return hoList;
	}

	public static boolean isInDB(String pstrWord) {
		if (pstrWord.equals(getWord(pstrWord).getMstrWord())) {
			return true;
		} else {
			return false;
		}
	}
	
	public static <T> List<T> selectAll(String pstrClass) {
		return (List<T>)executeTransaction("From " + pstrClass);
	}
	
	public static <T> List<T> select(String pstrClass, String pstrWord) {
		return (List<T>)executeTransaction("From " + pstrClass + " Where fstrWord = '" + pstrWord + "'");
	}
	
	public static List<Word> getAllWords() {
		return Select.<Word>selectAll("Word");
	}
	
	public static Word getWord(String pstrWord) {
		List<Word> queryResults = Select.<Word>select("Word", pstrWord);
		if (queryResults.size() > 0) {
			return queryResults.get(0);
		} else {
			return new Word();
		}
	}
	
	public static List<Connection> getAllConnections() {
		return Select.<Connection>selectAll("Connection");
	}

	public static List<Connection> getConnections(String pstrWord) {
		return Select.<Connection>select("Connection", pstrWord);
	}
	
	public static List<Definition> getAllDefinitions() {
		return Select.<Definition>selectAll("Definition");
	}

	public static List<Definition> getDefinitions(String pstrWord) {
		return Select.<Definition>select("Definition", pstrWord);
	}
	
	public static List<Noun> getAllNouns() {
		return Select.<Noun>selectAll("Noun"); 
	}
	
	public static List<Noun> getNoun(String pstrWord) {
		return Select.<Noun>select("Noun", pstrWord); 
	}
	
	public static List<SpanishVerbConjugation> getAllSpanishVerbConjugations() {
		return Select.<SpanishVerbConjugation>selectAll("SpanishVerbConjugation"); 
	}
	
	public static List<SpanishVerbConjugation> getSpanishVerbConjugation(String pstrWord) {
		return Select.<SpanishVerbConjugation>select("SpanishVerbConjugation", pstrWord); 
	}
}
