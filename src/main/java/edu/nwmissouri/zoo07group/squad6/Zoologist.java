/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo07group.squad6;

/**
 *
 * @author Vamsi Areti
 */
/**
 * 
* zoologist extending human
 */

public class Zoologist extends Human {
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
     * defines name
     */
    public Zoologist(String name) {
        super(name);
    }

    /**
     *overriding role method
     */
    @Override
    public void role() {
        System.out.printf("Promoting the conservation of zoolife.");
    }

    /**
     * overriding experience method
     */
    @Override
    public void experience() {
        System.out.printf("Zoologist should have enough expereince to deal with zoo life.");
    }

    /**
     *overriding salary method
     */
    @Override
    public void salary(){
        System.out.printf("Zoologist has salary around 120k dollars");
    }
    /**
     * created method WorkKnowledge
     */
     public void workKnowledge(){
        System.out.printf("I have more knowledge on animals.");
    }
    
}
