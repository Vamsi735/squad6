/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo07group.squad6;

/**
 *
 * @author S545411
 */
public abstract class Human {
     protected String name = "no name";
      protected String gender = "male";
      public Human(String name) {
        this.name = name;
        }
      public abstract void experience();
      
       public abstract void salary();
        public abstract void role();
        public String getName() {
        return name;
    }
      

      



    
}
