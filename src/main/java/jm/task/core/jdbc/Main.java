package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        UserDao userDao = new UserDaoHibernateImpl();

        userDao.createUsersTable();

        userDao.saveUser("John", "Doe", (byte) 30);
        userDao.saveUser("Alice", "Smith", (byte) 25);

        System.out.println(userDao.getAllUsers());

        userDao.cleanUsersTable();
        userDao.dropUsersTable();

        Util.shutdown(); // Закрываем SessionFactory
    }
}
