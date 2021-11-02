/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo07group.squad6;

/**
 *
 * @author Vijay Kumar Chunchu(545712)
 */
public abstract class Security extends Human{
     
    public Security(String name) {
        super(name);
    }
    

    /**
     *  This method provides what is the role of Security
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
