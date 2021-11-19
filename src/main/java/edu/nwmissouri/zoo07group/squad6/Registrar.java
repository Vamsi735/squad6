/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo07group.squad6;

/**
 *
 * @author Akshay krishna kintali
 * added Registrar and their role is to maintain wide variety of records regarding animals
 */
/**
 * 
* register extending human
 */


public class Registrar extends Human{
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
     *  constructor for register
     */
    public Registrar(String name) {
        super(name);
    }
   
    /**
     *overrides role
     */
    @Override
    public void role(){
        System.out.printf("maintain wide variety of records relating to animals ");
        
    }

    /**
     *overrides experience
     */
    @Override
    
    public void experience() {
        System.out.printf("Registrar has 15 years of experience");
    }
    
    /**
     * overrides salary
     */
    @Override
   public void salary(){
        System.out.printf("Registrar salary would be 60k dollars");
    }
    
    /**
     *data entry method
     */
    public void dataentry(){
        System.out.printf(" Follow procedures and apply data program techniques.");
        
       }
   
    /**
     * language method
     */
    public void languages(){
        System.out.printf("Speak different languages");
        
    }
    
    /**
     * organize method
     */
    public void organize(){
         System.out.printf("Organise and classify records of prepared reports");
        
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
