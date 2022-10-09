package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        // реализуйте алгоритм здесь
        Util util = new Util();
        util.getConnection();

        UserDao userDao = new UserDaoJDBCImpl();

        userDao.createUsersTable();

        userDao.saveUser("Petr", "Sergeev", (byte) 20);
        userDao.saveUser("Dinara", "Pavlova", (byte) 25);
        userDao.saveUser("Oleg", "Tinkov", (byte) 50);
        userDao.saveUser("Joe", "Biden", (byte) 80);

        userDao.removeUserById(1);
        userDao.getAllUsers();
        userDao.cleanUsersTable();
        userDao.dropUsersTable();
    }
}