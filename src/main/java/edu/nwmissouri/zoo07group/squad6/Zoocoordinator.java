/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo07group.squad6;

/**
 *
 * @author  ruthvikbhairav 
 */

public class Zoocoordinator extends Human {

    public Zoocoordinator(String name) {
        super(name);
    }
    @Override
    public void role() {
        System.out.printf("my role is regarding helping tourists");
    }
  /**
** over ride role
 */
    @Override
    public void experience() {
        System.out.printf("as a coordinator has 11 years of experience");
    }
  /**
** over ride experience
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
     /**
 *
** over ride performance
 */
}
