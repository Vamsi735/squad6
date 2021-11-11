/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo07group.squad6;

import java.util.ArrayList;

/**
 *
 * @author S545155
 */
public class RegistrarGroup {
    private static ArrayList<Registrar> Reg;
     public static int create() {
        Reg = new ArrayList<>();
        
        Registrar d = new Registrar("sub");
        Reg.add(d);
        Reg.add(new Registrar("sub"));
        Reg.add(new Registrar("sub"));

        return Reg.size();
    }
     public static void run() {
        System.out.println("####################");
        System.out.println("Hey - look at the Profession!");
        Reg.forEach(Registrar -> {
            Registrar.organize();
            Registrar.languages();
            Registrar.dataentry();
            Registrar.experience();
            Registrar.role();
            Registrar.salary();
        });
        System.out.println("My Registrar Attributes");
        System.out.println("#################");
    }
    
}
