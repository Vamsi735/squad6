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
/**
 * 
 * Doctor group for Squad6 App
 */
public class DoctorGroup {
     private static ArrayList<Doctor> Doc;
     public static int create() {
        Doc = new ArrayList<>();
        
        Doctor d = new Doctor("general");
        Doc.add(d);
        Doc.add(new Doctor("general"));
        Doc.add(new Doctor("general"));

        return Doc.size();
    }
     public static void run() {
        System.out.println("####################");
        System.out.println("Hey - look at the Profession!");
        Doc.forEach(doctor -> {
            doctor.duties();
            doctor.experience();
            doctor.role();
            doctor.salary();
        });
        System.out.println("My doctor Attributes");
        System.out.println("#################");
    }

    
}
