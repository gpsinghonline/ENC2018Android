package com.auribises.activitylifecycle;

import java.io.Serializable;

/**
 * Created by ishantkumar on 27/02/18.
 */

public class Customer implements Serializable{

    public int id;
    public String name;
    public String phone;
    public String city;
    public String gender;

    public Customer(){

    }

    public Customer(int id, String name, String phone, String city, String gender) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.city = city;
        this.gender = gender;
    }
}
