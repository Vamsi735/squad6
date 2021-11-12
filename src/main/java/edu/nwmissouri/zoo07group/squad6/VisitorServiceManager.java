/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo07group.squad6;

/**
 *
 * @author Vijay Kumar Chunchu(S545712)
 */
/**
 * 
* visitor service manager extending human
 */

public class VisitorServiceManager extends Human{
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
     * constructor for class
     */
    public VisitorServiceManager(String name) {
        super(name);
    }
    
    
    /**
     *  This method contains role info of Visitor Service Manager
     */
    @Override
 public void role() {
        System.out.println("Provide guests with information on all aspects of the Zoo experience such as exhibits, shuttles, train, and membership information;");
    }
     
    /**
     *  This method provides experience info
     */
    @Override
    public void experience() {
        System.out.println("Visitor Service manager has 10 years of experience");
    }
   
    /**
     *  This method has salary info
     */
    @Override
    public void salary(){
        System.out.println("Visitor Service manager has salary of $4000 per month");
    }
    
    /**
     *  This method has safety information
     */
    public void safety(){
        System.out.println("Assist with transporting guests safely to and from designated locations throughout assigned shift");
    }
    
}
