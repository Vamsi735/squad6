/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo07group.squad6;

/**
 *
 * @author Vamsi Areti
 */
public class ZooDirector extends Human {

    /**
     *
     * @param name
     * defines name
     */
    public ZooDirector(String name) {
        super(name);
    }

    /**
     *overriding role method
     */
    @Override
    public void role() {
        System.out.printf("Directs how the zoo organises the events and all.");
    }

    /**
     * overriding experience method
     */
    @Override
    public void experience() {
        System.out.printf("Zoo Director should have lot of experience.");
    }

    /**
     *overriding salary method
     */
    @Override
    public void salary(){
        System.out.printf("Zoo Director salary would be 120K dollars");
    }
    /**
     * creating newPolicies method
     */
     public void newEvents(){
        System.out.printf("Zoo Director should do direction for new events and all.");
    }
    
}

