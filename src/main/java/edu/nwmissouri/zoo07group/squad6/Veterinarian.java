/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo07group.squad6;

/**
 *
 * @author Akshay krishna kintali
 * Added Veterinarian  and their role is to assess the animals
 */
public class Veterinarian extends Human{
   
    public Veterinarian(String name) {
        super(name);
        }
    
    /**
     *overriding role method
     */
    @Override
    
    public void role() {
        System.out.printf("Examine animals to assess their health and diagnose problems");
    }
    /**
     * overriding experience method
     */
    @Override
    
    public void experience() {
        System.out.printf("veternian have 20years of experience");
    }
    /**
     *overriding salary method
     */
    @Override
    
    public void salary(){
        System.out.printf("veternarian avg salary is 80k dollars");
    }
    /**
     * Added vaccinate method  of veternarian
     */
    public void vaccinate(){
        System.out.println("Systemvaccinate animals against diseases");
    }
    /**
     * Added advise method  of veternarian
     */
    public void advise(){
        System.out.println("Advise pet owners on nutrition, preventive healthcare and general care");
        
    }
    
   
    
    
}
