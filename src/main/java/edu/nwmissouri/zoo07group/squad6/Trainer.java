
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo07group.squad6;

/**
 *
 * @author Vamsi Bhogireddy
 */
public class Trainer extends Human{
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
     public Trainer (String name) {
        super(name);
    }
     /**
     *overriding role method
     */
    @Override
    public void role() {
        System.out.printf("Trainer has to train the animals to do some comedy actions infront of the audience");
    }
    /**
     *overriding experience method
     */
    @Override
    public void experience() {
        System.out.printf("Trainer  has 17 years of experience");
    }
    /**
     *overriding salary method
     */
    @Override
    public void salary(){
        System.out.printf("Trainer salary would be around 110K dollars");
    }
    /**
     *Creating a method with name preference
     */
    public void preference(){
      System.out.println("Trainer used to train elephant and tiger");
    }
}