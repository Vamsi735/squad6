/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo07group.squad6;
import java.util.ArrayList;

/**
 *
 * @author ruthvik
 */
public class SoftwaredevGroup {
    
     private static ArrayList<Softwaredev> Sof;
     public static int create() {
        Sof = new ArrayList<>();
        
        Softwaredev s = new Softwaredev("general");
        Sof.add(s);
        Sof.add(new Softwaredev("general"));
        Sof.add(new Softwaredev("general"));

        return Sof.size();
    }
     public static void run() {
        System.out.println("####################");
        System.out.println("Hey - look at the Profession!");
        Sof.forEach(Softwaredev -> {
            Softwaredev.age();
            Softwaredev.experience();
            Softwaredev.role();
           Softwaredev.salary();
        });
        System.out.println("My Softwaredev attributes");
        System.out.println("#################");
    }

    
}
    
    
    

