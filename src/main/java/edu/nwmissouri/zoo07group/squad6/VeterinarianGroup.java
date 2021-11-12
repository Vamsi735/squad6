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
public class VeterinarianGroup {

    private static ArrayList<Veterinarian> Vet;

    public static int create() {
        Vet = new ArrayList<>();

        Veterinarian d = new Veterinarian("voluntary");
        Vet.add(d);
        Vet.add(new Veterinarian("voluntary"));
        Vet.add(new Veterinarian("voluntary"));

        return Vet.size();
    }

    public static void run() {
        System.out.println("####################");
        System.out.println("Hey - look at the Profession!");
        Vet.forEach(Veterinarian -> {

            Veterinarian.advise();
            Veterinarian.vaccinate();
            Veterinarian.experience();
            Veterinarian.role();
            Veterinarian.salary();
        });
        System.out.println("My Veterinarian Attributes");
        System.out.println("#################");
    }

}
