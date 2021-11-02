
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo07group.squad6;

/**
 *
 * @author Vamsi Bhogireddy
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
    public void preference(){
      System.out.println("Trainer used to train elephant and tiger");
    }
}