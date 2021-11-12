/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo07group.squad6;
        import java.util.ArrayList;

/**
 *
 * @author S545261
 */
public class ZoocoordinatorGroup {
    

     private static ArrayList<Zoocoordinator> zooco;
     public static int create() {
        zooco = new ArrayList<>();
        
        Zoocoordinator z = new Zoocoordinator("general");
               zooco.add(z);
        zooco.add(new Zoocoordinator("general"));
        zooco.add(new Zoocoordinator("general"));

        return zooco.size();
    }
     public static void run() {
        System.out.println("####################");
        System.out.println("Hey - look at the Profession!");
        zooco.forEach( Zoocoordinator-> {
            Zoocoordinator.experience();
            Zoocoordinator.role();
            Zoocoordinator.salary();
        });
        System.out.println("My Zoocoordinator Attributes");
        System.out.println("#################");
    }

    
}
    

