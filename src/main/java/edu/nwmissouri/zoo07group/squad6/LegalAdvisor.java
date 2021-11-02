/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo07group.squad6;

/**
 *
 * @author S545411
 */
public class LegalAdvisor extends Human{
    public LegalAdvisor (String name) {
        super(name);
    }
    @Override
    public void role() {
        System.out.printf("LegalAdvisor  has to advice the crew and staff on their actions");
    }
    @Override
    public void experience() {
        System.out.printf("LegalAdvisor  has 20 years of experience");
    }
    @Override
    public void salary(){
        System.out.printf("LegalAdvisor  salary would be 100K dollars");
    }

    
}
