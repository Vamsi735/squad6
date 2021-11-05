/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo07group.squad6;

/**
 *
 * @author Vamsi Bhogireddy
 */
public class Guide extends Human {
    private int salary;
    private String location;
    private  boolean hasfulltime;

    /**
     *
     * @return
     * returns salary
     */
    public int getSalary() {
        return salary;
    }

    /**
     *
     * @param salary
     * sets salary
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     *
     * @return
     * returns location
     */
    public String getLocation() {
        return location;
    }

    /**
     *
     * @param location
     * sets location 
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     *
     * @return
     * returns ishasSSn
     */
    public boolean hasfulltime() {
        return hasfulltime;
    }

    /**
     *
     * @param hasfulltime
     * returns has full time

     */
    public void hasfulltime(boolean hasfulltime) {
        this.hasfulltime = hasfulltime;
    }

     /**
     *
     * @param name
     * creating constructor
     */
     public Guide (String name) {
        super(name);
    }
     /**
     *overriding experience method
     */
    @Override
    public void experience() {
        System.out.println("Guide has 10 years of experience");
    }
    /**
     *overriding salary method
     */
    @Override
    public void salary() {
        System.out.println("guide has salary around 90k dollars");
    }
    /**
     *overriding role method
     */
    @Override
    public void role() {
        System.out.println("Role of the guide is to guide audience");
    }
    /**
     * creating the method workableDays
     */
    public void workableDays() {
    System.out.println("Weekly 3days is work days for guide");
}
    
}