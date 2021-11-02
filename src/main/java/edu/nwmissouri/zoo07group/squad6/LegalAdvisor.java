/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo07group.squad6;

/**
 *
 * @author Manoj Kota
 */

public class LegalAdvisor extends Human{

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
    public void operation()
    {
                System.out.printf("Doctor opearate for cardiac problems");

    }

    
}
