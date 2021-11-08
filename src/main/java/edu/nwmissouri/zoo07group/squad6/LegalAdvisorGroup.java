/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo07group.squad6;

import java.util.ArrayList;

/**
 *
 * @author Manoj Kota
 */
public class LegalAdvisorGroup {
    private static ArrayList<LegalAdvisor> Le;
     public static int create() {
        Le = new ArrayList<>();
        
        LegalAdvisor d = new LegalAdvisor("Law");
        Le.add(d);
        Le.add(new LegalAdvisor("Lawer"));
        Le.add(new LegalAdvisor("Advocate"));

        return Le.size();
    }
     public static void run() {
        System.out.println("####################");
        System.out.println("Hey - look at the Profession!");
        Le.forEach(advisor -> {
            advisor.Legalproblems();
            advisor.experience();
            advisor.role();
            advisor.salary();
        });
        System.out.println("My LegalAdvisor Attributes");
        System.out.println("#################");
    }

    
}
