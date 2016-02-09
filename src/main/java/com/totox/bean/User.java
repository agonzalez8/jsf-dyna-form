package com.totox.bean;

import java.util.List;
import java.io.Serializable;

public class User implements Serializable{
    private String name;
    private List<String> emails;
    private List<DataValue> values;

    public User(String name, List<String> emails) {
        super();
        this.name = name;
        this.emails = emails;
    }
    //Setters Getters

    public void setName(String name){
    	this.name = name;
    }
    
    public String getName(){
    	return name;
    }

    public void setEmails(List<String> emails){
    	this.emails = emails;
    }
    
    public List<String> getEmails(){
    	return emails;
    }

    public void setValues(List<DataValue> values){
    	this.values = values;
    }
    
    public List<DataValue> getValues(){
    	return values;
    }
    


    public String toString(){
    	return "[User:"+name+" - "+emails+" ]";
    }

}