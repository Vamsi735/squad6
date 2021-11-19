/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo07group.squad6;

import java.util.ArrayList;

/**
 *
 * @author Vamsi krishna Areti (S5449902)
 */
public class ZooDirectorGroup {
     private static ArrayList<ZooDirector> Zood;

    public static int create() {
        Zood = new ArrayList<>();

        ZooDirector d = new ZooDirector("curator");
        Zood.add(d);
        Zood.add(new ZooDirector("curator"));
        Zood.add(new ZooDirector("curator"));

        return Zood.size();
    }

    public static void run() {
        System.out.println("####################");
        System.out.println("Hey - look at the Profession!");
        Zood.forEach(ZooDirector -> {
            
            ZooDirector.newEvents();
            ZooDirector.experience();
            ZooDirector.role();
            ZooDirector.salary();
        });
        System.out.println("My ZooDirector Attributes");
        System.out.println("#################");
    }
    
    
}
