/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo07group.squad6;

/**
 *
 * @author Vamsi BHogireddy
 */
public abstract class Human {

    /**
     * name with string
     */
    protected String name = "no name";

    /**
     * gender attribute
     */
    protected String gender = "male";

    /**
     *
     * @param name
     * Human constructor
     */
    public Human(String name) {
        this.name = name;
        }
      enum Generation{
        FIRST,
        SECOND,
        THIRD
    }

    /**
     * experience method
     */
    public abstract void experience();
      
    /**
     * salary method
     */
    public abstract void salary();

    /**
     * role method
     */
    public abstract void role();

    /**
     *
     * @return
     * returns string
     */
    public String getName() {
        return name;
    }
      

      



    
}
