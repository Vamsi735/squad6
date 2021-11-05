/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo07group.squad6;

/**
 *
 * @author  ruthvikbhairav 
 */
/**
 * 
* zoo coordinator extending human
 */


public class Zoocoordinator extends Human {
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
    public Zoocoordinator(String name) {
        super(name);
    }

    /**
     * overrides role method
     */
    @Override
    public void role() {
        System.out.printf("my role is regarding helping tourists");
    }
  /**
* over ride role
 */
    @Override
    public void experience() {
        System.out.printf("as a coordinator has 11 years of experience");
    }
  /**
* over ride experience
 */
    @Override
    public void salary(){
        System.out.printf("as a coordinator salary would be 6000$ dollars");
    }
     /**
** over ride salary
 */
    public void perfomance()
    {
            System.out.printf("as a coordinator i have good nice performance");
}
    
}
