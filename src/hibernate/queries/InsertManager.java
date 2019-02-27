package hibernate.queries;

import java.util.List;

import org.hibernate.Session;

import hibernate.pojo.HibernateObject;

public class InsertManager {

    public static void insert(List<HibernateObject> pHibernateObjectList) {
        pHibernateObjectList.forEach(n -> insert(n));
    }

    public static void insert(HibernateObject pHibernateObject) {
        Session session = HibernateConnection.getSessionFactory()
                .openSession();
        session.beginTransaction();
        session.save(pHibernateObject);
        session.getTransaction()
                .commit();
        session.close();
    }
}
