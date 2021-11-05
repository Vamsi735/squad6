/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo07group.squad6;
/**
@author  ruthvikbhairav
**/
public class Softwaredev extends Human {
       public Softwaredev(String name) {
        super(name);
    }

    @Override
    public void experience() {
        System.out.println(" in sofware i have 5 years of experience ."); 
    }
    /**
over riding experience
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
    
    
}

    
    

