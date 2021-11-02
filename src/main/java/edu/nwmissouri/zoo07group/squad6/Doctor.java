/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo07group.squad6;

/**
 *
 * @author Manoj Kota
 */
public class Doctor extends Human {

    /**
     *
     * @param name
     * defines name
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
     * duties method
     */
     public void duties(){
        System.out.printf("he advices duties on their and experince");
    }
    
}
