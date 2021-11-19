/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo07group.squad6;
/**
@author  ruthvikbhairav
**/
/**
 * 
* software developer extending human 1
 */

public class Softwaredev extends Human {
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
    public Softwaredev(String name) {
        super(name);
    }

    /**
     * overrides experience
     */
    @Override
    public void experience() {
        System.out.println(" in sofware i have 5 years of experience ."); 
    }
    /**
    *  over riding experience
   **/

    @Override
    public void salary() {
        System.out.println("i have 6000$ salary."); 
    }
     /**
over riding salary
**/

    @Override
    public void role() {
       System.out.println("my role is  developing zoo website."); 
    }
     /**
over riding age
**/
    
     public void age() {
      System.out.println("my age is 22."); 
    }
     public static void main(String[] args) {
         
        
         double p=1.3;
         int g=(int) p;
         System.out.println("casted double"+g);

         int c = 1;
        int f= 0;
         System.out.println("Exceptions were added");
 
        try
        {
            int i = c/f;
            System.out.println("division"+i);
          
        }
          
        // matching ArithmeticException
        catch(ArithmeticException e)
        {
            // getMessage will print description of exception(here / by zero)
            System.out.println("Exception"+e);
        }
     }
    
    
}

    
    

