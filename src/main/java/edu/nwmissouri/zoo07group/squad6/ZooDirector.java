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
        System.out.printf("Doctor has to perform opearations");
    }

    /**
     * overriding experience method
     */
    @Override
    public void experience() {
        System.out.printf("Doctor has 11 years of experience");
    }

    /**
     *overriding salary method
     */
    @Override
    public void salary(){
        System.out.printf("Doctor salary would be 120K dollars");
    }
    /**
     * creating newPolicies method
     */
     public void newPolicies(){
        System.out.printf("To impliment new polivies and hiring");
    }
    
}

