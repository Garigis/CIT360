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
import java.util.Scanner;

/**
 * Created by colbycooley on 11/15/16.
 */
public class Main {
    public static void main(String[] args) {

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
        } catch (Exception e) {
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
        } catch (Exception e) {
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
        } catch (Exception e) {
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
        } catch (Exception e) {
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
        } catch (Exception e) {
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
        } catch (Exception e) {
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
        } catch (Exception e) {
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
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Creating Users
    private static void createUser(SessionFactory factory) {

        Scanner scanner = new Scanner(System.in);

        Session session = factory.getCurrentSession();

        //create user happy path
        User user1 = new User();
        user1.setId(1);
        user1.setFirstName("Colby");
        user1.setLastName("Cooley");

        //nasty path negative id
        User user2 = new User();
        user2.setId(-2);
        user2.setFirstName("Jim");
        user2.setLastName("Bob");

        //nasty path duplicate id
        User user3 = new User();
        user3.setId(1);
        user3.setFirstName("Brent");
        user3.setLastName("Walker");

        //create users to delete
        User user4 = new User();
        user3.setId(4);
        user3.setFirstName("Zach");
        user3.setLastName("Tanner");

        User user5 = new User();
        user3.setId(5);
        user3.setFirstName("Hal");
        user3.setLastName("Hauk");

        //create transaction
        session.beginTransaction();

        //save user objects to be committed to the database
        session.save(user1);

        try{
            //nasty path: negative id
            session.save(user2);
        }
        catch(Exception ex){
            System.out.println("Error, cannot create object with negative id");
        }

        try{
            session.save(user3);
        }
        catch (Exception ex){
            System.out.println("Error, can't create object with duplicate id");
        }

        session.save(user4);
        session.save(user5);

        //Need to commit and close transaction
        session.getTransaction().commit();

        /* Retrieving object from database
		*  To retrieve an object from the database you retrieve it by it's id
		*/

        //Get a new session and start a transaction
        session = factory.getCurrentSession();
        session.beginTransaction();

        //Happy Path
        //retrieve student based on the id: primary key arguments are the class and the object id
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("Retrieving object with user id of " + user1.getId());
        User user = (User) session.get(User.class, user1.getId());

        //Print out object retrieved from the database in java
        System.out.println(user);
        System.out.println("--------------------------------------------------------------------------------------------------");

        try{
            //nasty path: Retrieving wrong primary key from object that does not exist
            System.out.println("Retrieving another object with customer id of 74");
            User testUser = (User) session.get(User.class, 74);
            System.out.println(testUser);
            System.out.println("--------------------------------------------------------------------------------------------------");
        }
        catch(Exception ex){
            System.out.println("Error, customer id does not exist in database");
        }

        //commit the transaction
        session.getTransaction().commit();

        //Update object

        //Get a new session and start a transaction
        session = factory.getCurrentSession();
        session.beginTransaction();

        //declare variable to hold a customer id number
        int userId = 1;

        //Happy Path: retrieve the object you want to update
        User nextUser = (User) session.get(User.class, userId);
        System.out.println("update: " + nextUser);

        //Happy Path: Use your setter in your object to update the first name
        nextUser.setFirstName("UPDATED");

        //Happy Path: commit the transaction: Once commited the firstname with its updated value
        //saved in memory commits to the database
        session.getTransaction().commit();


        //Deleting Objects

        //Get a new session and start a transaction
        session = factory.getCurrentSession();
        session.beginTransaction();

        //Happy Path: retrieve object for deletion
        User delUser4 = (User) session.get(User.class, 4);

        //Happy Path: delete object with id of 1
        System.out.println("Deleting Customer " + delUser4);
        session.delete(delUser4);

        //Commit deletion
        session.getTransaction().commit();
    }
}
