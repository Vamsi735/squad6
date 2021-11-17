package edu.nwmissouri.zoo07group.squad6;



import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Vamsi krishna Areti (S5449902)
 */
public class ZoologistGroup {
    private static ArrayList<Zoologist> Zoo;

    public static int create() {
        Zoo = new ArrayList<>();

        Zoologist d = new Zoologist("general");
        Zoo.add(d);
        Zoo.add(new Zoologist("general"));
        Zoo.add(new Zoologist("general"));

        return Zoo.size();
    }

    public static void run() {
        System.out.println("####################");
        System.out.println("Hey - look at the Profession!");
        Zoo.forEach(Zoologist -> {
            
            Zoologist.workKnowledge();
            Zoologist.experience();
            Zoologist.role();
            Zoologist.salary();
        });
        System.out.println("My Zoologist Attributes");
        System.out.println("#################");
    }
    
}