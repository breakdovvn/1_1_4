package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class UserDaoHibernateImpl implements UserDao {
    public UserDaoHibernateImpl() {
    }


    @Override
    public void createUsersTable() {
//        try (Session session = Util.getSessionFactory().openSession()) {
//            Transaction transaction = session.beginTransaction();
//            session.createSQLQuery("""
//                CREATE TABLE IF NOT EXISTS users (
//                    id BIGINT AUTO_INCREMENT PRIMARY KEY,
//                    name VARCHAR(50) NOT NULL,
//                    lastName VARCHAR(50) NOT NULL,
//                    age TINYINT NOT NULL
//                )
//            """).executeUpdate();
//            transaction.commit();
//        }
    }

    @Override
    public void dropUsersTable() {
//        try (Session session = Util.getSessionFactory().openSession()) {
//            Transaction transaction = session.beginTransaction();
//            session.createSQLQuery("DROP TABLE IF EXISTS users").executeUpdate();
//            transaction.commit();
//        }
    }

    @Override
    public void saveUser(String name, String lastName, byte age) {
//        try(Session session = Util.getSessionFactory().openSession()) {
//            Transaction transaction = session.beginTransaction();
//            session.persist(new User(name, lastName, age));
//            transaction.commit();
//        }
    }

    @Override
    public void removeUserById(long id) {
//        try (Session session = Util.getSessionFactory().openSession()) {
//            Transaction transaction = session.beginTransaction();
//            User user = session.get(User.class, id);
//            if (user != null) {
//                session.remove(user);
//            }
//            transaction.commit();
//        }
    }

    @Override
    public List<User> getAllUsers() {
//        try (Session session = Util.getSessionFactory().openSession()) {
//            return session.createQuery("FROM User", User.class).list();
//        }
        return null;
    }

    @Override
    public void cleanUsersTable() {
//        try (Session session = Util.getSessionFactory().openSession()) {
//            Transaction transaction = session.beginTransaction();
//            session.createQuery("DELETE FROM User").executeUpdate();
//            transaction.commit();
//        }
    }
}
