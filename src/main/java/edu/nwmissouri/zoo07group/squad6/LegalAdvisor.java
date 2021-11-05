/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo07group.squad6;

/**
 *
 * @author Manoj Kota
 */
/**
 * 
* legal advisor extending human
 */

public class LegalAdvisor extends Human{
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
     * set salary amount
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
     * returns isHasmbbs
     * 
     */
    public boolean isHasMBBS() {
        return hasMBBS;
    }

    /**
     *
     * @param hasMBBS
     * sets mbbs degree boolean
     */
    public void setHasMBBS(boolean hasMBBS) {
        this.hasMBBS = hasMBBS;
    }
    
    /**
     *
     * @param name
     * Legal advisor inheriting the human
     */
    public LegalAdvisor (String name) {
        super(name);
    }

    /**
     * overriding role method
     */
    @Override
    public void role() {
        System.out.printf("LegalAdvisor  has to advice the crew and staff on their actions");
    }

    /**
     * overriding experience method
     */
    @Override
    public void experience() {
        System.out.printf("LegalAdvisor  has 21 years of experience");
    }

    /**
     * overriding salary method
     */
    @Override
    public void salary(){
        System.out.printf("LegalAdvisor  salary would be 100K dollars");
    }

    /**
     *
     */
    public void operation()
    {
                System.out.printf("Doctor opearate for cardiac problems");

    }

    
}
