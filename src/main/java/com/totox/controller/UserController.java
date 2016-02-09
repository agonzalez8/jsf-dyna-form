package com.totox.controller;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.annotation.PostConstruct;

import com.totox.bean.User;
import com.totox.bean.DataValue;


@ManagedBean
@ViewScoped
public class UserController implements Serializable {
    private List<User> userList;
    private List<DataValue> values;

    public UserController() {
        userList = new ArrayList<User>();
        ArrayList<String> emails= new ArrayList<String>();
        values = new ArrayList<DataValue>();


        emails.add("user1.1@mail.com");
        emails.add("user1.2@mail.com");
        userList.add(new User("User1", (List<String>) emails.clone()));

        emails.clear();
        emails.add("user2.1@mail.com");
        emails.add("user2.2@mail.com");
        emails.add("user2.3@mail.com");
        userList.add(new User("User2", (List<String>) emails.clone()));

        values.add(new DataValue("input","none","some value","label 1"));
        values.add(new DataValue("checkbox","none",true,"Checkbox 1"));

    }
    public void action(){
        for(User u : userList){
          System.out.println(u);
        }

        for (DataValue value : values ) {
            System.out.println(value);
            
        }
    }
    //Setters Getters

    public void setUserList(List<User> userList){
        this.userList = userList;
    }
    
    public List<User> getUserList(){
        return userList;
    }
    public void setValues(List<DataValue> values){
        this.values = values;
    }
    
    public List<DataValue> getValues(){
        return values;
    }
    

    @PostConstruct
    private void initialize() {
        System.out.println("Bean is initialized ");       
    }
    
}