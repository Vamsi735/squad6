/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo07group.squad6;

/**
 *
 * @author Vamsi Areti
 */
public class Zoologist extends Human {

    /**
     *
     * @param name
     * defines name
     */
    public Zoologist(String name) {
        super(name);
    }

    /**
     *overriding role method
     */
    @Override
    public void role() {
        System.out.printf("Promoting the conservation of wildlife");
    }

    /**
     * overriding experience method
     */
    @Override
    public void experience() {
        System.out.printf("Zoologist has 13 years of experience");
    }

    /**
     *overriding salary method
     */
    @Override
    public void salary(){
        System.out.printf("Zoologist has salary around 120k dollars");
    }
    /**
     * created method WorkKnowledge
     */
     public void workKnowledge(){
        System.out.printf("I have more knowledge on Lion");
    }
    
}
