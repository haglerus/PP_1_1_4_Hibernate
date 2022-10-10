package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

import static jm.task.core.jdbc.util.Util.getSessionFactory;

public class UserDaoHibernateImpl implements UserDao {

    public UserDaoHibernateImpl() {

    }

    @Override
    public void createUsersTable() {
        try (Session session = getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();

            String sql = "CREATE TABLE IF NOT EXISTS users " +
                    "(id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY, " +
                    "name VARCHAR(50) NOT NULL, lastName VARCHAR(50) NOT NULL, " +
                    "age TINYINT NOT NULL)";
            Query query = session.createSQLQuery(sql).addEntity(User.class);
            query.executeUpdate();
            transaction.commit();
        }
    }

    @Override
    public void dropUsersTable() {
        try (Session session = getSessionFactory().openSession()) {
                Transaction transaction = session.beginTransaction();
                String sql = "DROP TABLE IF EXISTS users";
                Query query = session.createSQLQuery(sql).addEntity(User.class);
                query.executeUpdate();
                transaction.commit();
        }
    }

    @Override
    public void saveUser(String name, String lastName, byte age) {
        try (Session session = getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            //String sql =
        }
    }

    @Override
    public void removeUserById(long id) {
        try (Session session = getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            //String sql =
    }

    @Override
    public List<User> getAllUsers() {
            List <User> userList = new ArrayList<>();
            try (Session session = getSessionFactory().openSession()) {
                Transaction transaction = session.beginTransaction();
                //String sql =
            }
            return userList;
    }

    @Override
    public void cleanUsersTable() {
                try (Session session = getSessionFactory().openSession()) {
                    Transaction transaction = session.beginTransaction();
                    //String sql =
    }
}