package Hibernate;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import java.util.Iterator;
import java.util.List;

/**
 * Created by colbycooley on 11/15/16.
 */
public class Main {
    public static void main(String[] args) {


        //The nastiest of paths


        //Try to use wrong password
        try {
            SessionFactory sessionfactory;
            Main main = new Main();
            Configuration config = new Configuration();
            config.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
            config.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
            config.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/woot");
            config.setProperty("hibernate.connection.username", "user1");
            //Here's the oops
            config.setProperty("hibernate.connection.password", "user1badwrongohnu");
            config.setProperty("hibernate.connection.pool_size", "1");
            config.setProperty("hibernate.connection.autocommit", "true");
            config.setProperty("hibernate.cache.provider_class", "org.hibernate.cache.NoCacheProvider");
            config.setProperty("hibernate.show_sql", "true");
            config.setProperty("hibernate.transaction.factory_class", "org.hibernate.transaction.JDBCTransactionFactory");
            config.setProperty("hibernate.current_session_context_class", "thread");
            config.addAnnotatedClass(User.class);
            ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
            sessionfactory = config.buildSessionFactory(serviceRegistry);
            main.showAllUsers(sessionfactory, "select u from User as u order by u.userId");
        }
        catch(Exception e) {
            e.printStackTrace();
        }


        //Try to connect with wrong username
        try {
            SessionFactory sessionfactory;
            Main main = new Main();
            Configuration config = new Configuration();
            config.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
            config.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
            config.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/woot");
            //Here's the oops
            config.setProperty("hibernate.connection.username", "userbadwrong");
            config.setProperty("hibernate.connection.password", "user1");
            config.setProperty("hibernate.connection.pool_size", "1");
            config.setProperty("hibernate.connection.autocommit", "true");
            config.setProperty("hibernate.cache.provider_class", "org.hibernate.cache.NoCacheProvider");
            config.setProperty("hibernate.show_sql", "true");
            config.setProperty("hibernate.transaction.factory_class", "org.hibernate.transaction.JDBCTransactionFactory");
            config.setProperty("hibernate.current_session_context_class", "thread");
            config.addAnnotatedClass(User.class);
            ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
            sessionfactory = config.buildSessionFactory(serviceRegistry);
            main.showAllUsers(sessionfactory, "select u from User as u order by u.userId");
        }
        catch(Exception e) {
            e.printStackTrace();
        }


        //Try to connect to the wrong database
        try {
            SessionFactory sessionfactory;
            Main main = new Main();
            Configuration config = new Configuration();
            config.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
            config.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
            //Here's the oops
            config.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/ohnuuitwrongman");
            config.setProperty("hibernate.connection.username", "user1");
            config.setProperty("hibernate.connection.password", "user1");
            config.setProperty("hibernate.connection.pool_size", "1");
            config.setProperty("hibernate.connection.autocommit", "true");
            config.setProperty("hibernate.cache.provider_class", "org.hibernate.cache.NoCacheProvider");
            config.setProperty("hibernate.show_sql", "true");
            config.setProperty("hibernate.transaction.factory_class", "org.hibernate.transaction.JDBCTransactionFactory");
            config.setProperty("hibernate.current_session_context_class", "thread");
            config.addAnnotatedClass(User.class);
            ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
            sessionfactory = config.buildSessionFactory(serviceRegistry);
            main.showAllUsers(sessionfactory, "select u from User as u order by u.userId");
        }
        catch(Exception e) {
            e.printStackTrace();
        }


        //Try to use wrong driver
        try {
            SessionFactory sessionfactory;
            Main main = new Main();
            Configuration config = new Configuration();
            config.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
            //Here's the oops
            config.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driverbad");
            config.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/woot");
            config.setProperty("hibernate.connection.username", "user1");
            config.setProperty("hibernate.connection.password", "user1");
            config.setProperty("hibernate.connection.pool_size", "1");
            config.setProperty("hibernate.connection.autocommit", "true");
            config.setProperty("hibernate.cache.provider_class", "org.hibernate.cache.NoCacheProvider");
            config.setProperty("hibernate.show_sql", "true");
            config.setProperty("hibernate.transaction.factory_class", "org.hibernate.transaction.JDBCTransactionFactory");
            config.setProperty("hibernate.current_session_context_class", "thread");
            config.addAnnotatedClass(User.class);
            ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
            sessionfactory = config.buildSessionFactory(serviceRegistry);
            main.showAllUsers(sessionfactory, "select u from User as u order by u.userId");
        }
        catch(Exception e) {
            e.printStackTrace();
        }


        //Try to use wrong dialect
        try {
            SessionFactory sessionfactory;
            Main main = new Main();
            Configuration config = new Configuration();
            //Here's the oops
            config.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialectbad");
            config.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
            config.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/woot");
            config.setProperty("hibernate.connection.username", "user1");
            config.setProperty("hibernate.connection.password", "user1");
            config.setProperty("hibernate.connection.pool_size", "1");
            config.setProperty("hibernate.connection.autocommit", "true");
            config.setProperty("hibernate.cache.provider_class", "org.hibernate.cache.NoCacheProvider");
            config.setProperty("hibernate.show_sql", "true");
            config.setProperty("hibernate.transaction.factory_class", "org.hibernate.transaction.JDBCTransactionFactory");
            config.setProperty("hibernate.current_session_context_class", "thread");
            config.addAnnotatedClass(User.class);
            ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
            sessionfactory = config.buildSessionFactory(serviceRegistry);
            main.showAllUsers(sessionfactory, "select u from User as u order by u.userId");
        }
        catch(Exception e) {
            e.printStackTrace();
        }


        //Query: hello world, empty string, null


        try {
            SessionFactory sessionfactory;
            Main main = new Main();
            Configuration config = new Configuration();
            //Here's the oops
            config.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialectbad");
            config.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
            config.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/woot");
            config.setProperty("hibernate.connection.username", "user1");
            config.setProperty("hibernate.connection.password", "user1");
            config.setProperty("hibernate.connection.pool_size", "1");
            config.setProperty("hibernate.connection.autocommit", "true");
            config.setProperty("hibernate.cache.provider_class", "org.hibernate.cache.NoCacheProvider");
            config.setProperty("hibernate.show_sql", "true");
            config.setProperty("hibernate.transaction.factory_class", "org.hibernate.transaction.JDBCTransactionFactory");
            config.setProperty("hibernate.current_session_context_class", "thread");
            config.addAnnotatedClass(User.class);
            ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
            sessionfactory = config.buildSessionFactory(serviceRegistry);
            //Here's bad SQL
            main.showAllUsers(sessionfactory, "select from u.userId u");
        }
        catch(Exception e) {
            e.printStackTrace();
        }


        // Happy path mango
        try {


            SessionFactory sessionfactory;
            Main main = new Main();
            Configuration config = new Configuration();
            config.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");


            config.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");


            //change the next line of code to match your MySQL URL and port


            config.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/woot");


            //change the next two lines of code to match your MySQL user name and password.


            config.setProperty("hibernate.connection.username", "user1");


            config.setProperty("hibernate.connection.password", "user1");


            //change the pool size to reflect how many users you expect your application to have initially


            config.setProperty("hibernate.connection.pool_size", "1");


            config.setProperty("hibernate.connection.autocommit", "true");


            config.setProperty("hibernate.cache.provider_class", "org.hibernate.cache.NoCacheProvider");


     /*
      * un-comment the next line of code if you want to be able to drop and recreate tables for your data classes listed below.  This is generally a bad idea for security reasons.
      */


            //config.setProperty("hibernate.hbm2ddl.auto", "create-drop");


            config.setProperty("hibernate.show_sql", "true");


            config.setProperty("hibernate.transaction.factory_class", "org.hibernate.transaction.JDBCTransactionFactory");


            config.setProperty("hibernate.current_session_context_class", "thread");


     /*
      *  Add your classes here that you want to match your database tables
      *  The example has a User and a PhoneNumber class.
      */


            config.addAnnotatedClass(User.class);


/*
* There have been several changes to the Hibernate libraries.
* Please uncomment the source code for the version of Hibernate you are using.
*/
        /*Hibernate 4.3 - 5.x */ //ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
       /*Hibernate 3.x - 4.2*/
            ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();


            sessionfactory = config.buildSessionFactory(serviceRegistry);
            main.showAllUsers(sessionfactory, "select u from User as u order by u.userId");
        }
        catch(Exception e) {
            e.printStackTrace();
        }




    }


    private void showAllUsers(SessionFactory sessionfactory, String query) {


        try {
            Session session = sessionfactory.getCurrentSession();


            Transaction transaction = session.beginTransaction();
       /*
        * execute a HQL query against the database.  HQL is NOT SQL.  It is object based.
        */
            Query allUsersQuery = session.createQuery(query);
       /*
        * get a list of User instances based on what was found in the database tables.
        */
            List<User> users = allUsersQuery.list();
            System.out.println("num users: " + users.size());
       /*
        * iterate over each User instance returned by the query and found in the list.
        */
            Iterator<User> iter = users.iterator();


            while (iter.hasNext()) {
                User element = iter.next();
                System.out.println(element.getFirstName());
            }
            transaction.commit();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

}
