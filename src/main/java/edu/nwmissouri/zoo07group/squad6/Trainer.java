
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo07group.squad6;

/**
 *
 * @author S545411
 */
public class Trainer extends Human{
    
     public Trainer (String name) {
        super(name);
    }
    @Override
    public void role() {
        System.out.printf("Trainer has to train the animals to do some comedy actions infront of the audience");
    }
    @Override
    public void experience() {
        System.out.printf("Trainer  has 17 years of experience");
    }
    @Override
    public void salary(){
        System.out.printf("Trainer salary would be around 110K dollars");
    }
}