/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo07group.squad6;

/**
 *
 * @author Vijay Kumar Chunchu(545712)
 */
/**
 * 
* security extending human
 */


public  class Security extends Human{
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
     * security constructor
     */
    public Security(String name) {
        super(name);
    }
    

    /**
     *  This method provides the role of Security
     */
    @Override
 public void role() {
        System.out.println("Ensures Public safety and provides emergency assistance to staff");
    }
    
    /**
     *  This method provides  experience of Security
     */
    @Override
    public void experience() {
        System.out.println("Zoo security has 5 years of experience");
    }
   
     /**
      * This method has salary info of Security
      */
    @Override
    public void salary(){
        System.out.println("Security has salary of $3000 per month");
    }
    
    /**
     *  This method has information of reports provided by Security
     */
    public void reports(){
        System.out.println("Initiates and writes Accident/Incident/Hazard Reports and various other documentation required");
    }
}
