/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.util.LinkedList;

/**
 *
 * @author Asus
 */
public class Person {
    private String name;
    private int age;
    private LinkedList<Device> devices;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.devices=new LinkedList<>();
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the devices
     */
    public LinkedList<Device> getDevices() {
        return devices;
    }

    /**
     * @param devices the devices to set
     */
    public void setDevices(LinkedList<Device> devices) {
        this.devices = devices;
    }
    
}
