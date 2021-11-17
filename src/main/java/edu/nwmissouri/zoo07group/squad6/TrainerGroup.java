
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo07group.squad6;

import java.util.ArrayList;

/**
 *
 * @author Vamsi Bhogireddy
 */
/**
 * 
 * Doctor group for Squad6 App
 */
public class TrainerGroup {
     private static ArrayList<Trainer> Train;
     public static int create() {
        Train = new ArrayList<>();
        
        Trainer d = new Trainer("Animal");
        Train.add(d);
        Train.add(new Trainer("Animal"));
        Train.add(new Trainer("Animal"));

        return Train.size();
    }
     public static void run() {
        System.out.println("####################");
        System.out.println("Hey - look at the Profession!");
        Train.forEach(Trainer -> {
            Trainer.preference();
            Trainer.experience();
            Trainer.role();
            Trainer.salary();
        });
        System.out.println("My Trainer Attributes");
        System.out.println("#################");
    }

    
}

