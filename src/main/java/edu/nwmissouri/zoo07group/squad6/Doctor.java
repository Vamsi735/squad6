/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo07group.squad6;

/**
 *
 * @author S545411
 */
public class Doctor extends Human {

    public Doctor(String name) {
        super(name);
    }
    @Override
    public void role() {
        System.out.printf("Doctor has to perform opearations");
    }
    @Override
    public void experience() {
        System.out.printf("Doctor has 10 years of experience");
    }
    @Override
    public void salary(){
        System.out.printf("Doctor salary would be 120K dollars");
    }
}
