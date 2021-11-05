/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo07group.squad6;

/**
 *
 * @author Akshay krishna kintali
 * Added Veterinarian  and their role is to assess the animals
 */
public class Veterinarian extends Human{
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
     * constructor
     */
    public Veterinarian(String name) {
        super(name);
        }
    
    /**
     *overrides role
     */
    @Override
    public void role() {
        System.out.printf("Examine animals to assess their health and diagnose problems");
    }
    
    /**
     * overrides experience
     */
    @Override
    
    public void experience() {
        System.out.printf("veternian have 20years of experience");
    }
    
    /**
     *overrides salary
     */
    @Override
    
    public void salary(){
        System.out.printf("veternarian avg salary is 80k dollars");
    }

    /**
     *vaccine method
     */
    public void vaccinate(){
        System.out.println("Systemvaccinate animals against diseases");
    }
    
    /**
     *advice method
     */
    public void advise(){
        System.out.println("Advise pet owners on nutrition, preventive healthcare and general care");
        
    }
    
   
    
    
}
