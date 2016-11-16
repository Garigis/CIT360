package Hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * Created by colbycooley on 11/15/16.
 */

/*
* The Many-To-Many relationship between User and PhoneNumber objects requires two tables
* app_user and phone_number with a transition table user_number that maps phone numbers to users.
* The @ManyToMany annotation shows how to make the User object aware of its phone numbers.
*/

    @Entity
    @Table(name = "users")
    public class User {

    @Id
    @GeneratedValue
    private Integer userId;
    private String firstName;
    private String lastName;

    public String getFirstName(){
            return firstName;
        }
}
