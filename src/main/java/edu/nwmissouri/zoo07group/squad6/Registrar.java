/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo07group.squad6;

/**
 *
 * @author Akshay krishna kintali
 * added Registrar and their role is to maintain wide variety of records regarding animals
 */

public class Registrar extends Human{
    
    public Registrar(String name) {
        super(name);
    }
    
    @Override
    //Added role of registrar
    public void role(){
        System.out.printf("maintain wide variety of records relating to animals ");
        
    }
    @Override
    //Added experience of registrar
    public void experience() {
        System.out.printf("Registrar has 15 years of experience");
    }
    @Override
    
    //Added salary of registrar
    public void salary(){
        System.out.printf("Doctor salary would be 60k dollars");
    }
    
    //Added about dataentry of registrar
    public void dataentry(){
        System.out.printf(" Follow procedures and apply data program techniques.");
        
       }
    //Added languages of Registrar
    public void languages(){
        System.out.printf("Speak different languages");
        
    }
    //Added organize of Registrar
    public void organize(){
         System.out.printf("Organise and classify records of prepared reports");
        
    }
    
}
