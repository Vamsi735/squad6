/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template


 */
/**
 * doctor class
 */
package edu.nwmissouri.zoo07group.squad6;

/**
 *
 * @author Manoj Kota
 */
/**
 * 
* doctor extending human
 */

public class Doctor extends Human {

    /**
     *
     * @param name
     * defines name
     */
    private int salary;
    private String location;
    private  boolean hasMBBS;

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
     * sets salay to value
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     *
     * @return
     * returns getlocation
     */
    public String getLocation() {
        return location;
    }

    /**
     *
     * @param location
     * sets location value
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     *
     * @return
     * returns isHasmbbs degree
     */
    public boolean isHasMBBS() {
        return hasMBBS;
    }

    /**
     *
     * @param hasMBBS
     * sets mbbs degree
     */
    public void setHasMBBS(boolean hasMBBS) {
        this.hasMBBS = hasMBBS;
    }
    
    /**
     *
     * @param name
     * doctor constructor
     */
    public Doctor(String name) {
        super(name);
    }
    enum Degree{
        DM,
        MBBS
    }

    /**
     *overriding role method
     */
   
    public void role() {
        System.out.printf("Doctor has to perform opearations");
    }

    /**
     * overriding experience method
     */
    
    public void experience() {
        System.out.printf("Doctor has 11 years of experience");
    }

    /**
     *overriding salary method
     */
  
    public void salary(){
        System.out.printf("Doctor salary would be 120K dollars");
    }
    /**
     * duties method
     */
     public void duties(){
        System.out.printf("he advices duties on their and experince");
    }
     public static void main(String[] args) {
         Doctor d=new Doctor("general");
         d.duties();
     }

    
}
