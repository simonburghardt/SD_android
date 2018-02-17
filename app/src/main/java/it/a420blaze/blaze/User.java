package it.a420blaze.blaze;

/**
 * Created by Simon on 08.03.2017.
 */

public class User {

    private String name, username, password;
    private int id;

    public User(String name, String username, String password, int id){

        this.name = name;
        this.username = username;
        this.password = password;
        this.id = id;
    }

    public String getUsername(){
        return this.username;
    }

    public String getName(){
        return this.name;
    }

    public String getPassword(){
        return this.password;
    }

    public int getId(){
        return this.id;
    }
}
