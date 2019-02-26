package hibernate;


import hibernate.pojo.HibernateObject;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.List;

public class HibernateConnection {

    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
            StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure("/main/resources/hibernate.cfg.xml").build();
            Metadata metadata  = new MetadataSources(registry).getMetadataBuilder().build();
            return metadata.getSessionFactoryBuilder().build();
        } catch (HibernateException he) {
            throw he;
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static void save(List<HibernateObject> pHibernateObjectList) {
        pHibernateObjectList.forEach(n -> n.print());
        pHibernateObjectList.forEach(n -> save(n));
    }

    public static void save(HibernateObject pHibernateObject) {
        Session session = HibernateConnection.getSessionFactory()
                .openSession();
        session.beginTransaction();
        session.save(pHibernateObject);
        session.getTransaction()
                .commit();
        session.close();
    }

}
