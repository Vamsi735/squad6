/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo07group.squad6;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


/**
 *
 * @author Vijay Kumar Chunchu S545712
 */
public class SecurityTest {
   private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();


    public SecurityTest() {

    }

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    /**
     * Test of getSalary method, of class Security.
     */
    @Test
    public void testGetSalary() {
    }

    /**
     * Test of setSalary method, of class Security.
     */
    @Test
    public void testSetSalary() {
    }

    /**
     * Test of getLocation method, of class Security.
     */
    @Test
    public void testGetLocation() {
    }

    /**
     * Test of setLocation method, of class Security.
     */
    @Test
    public void testSetLocation() {
    }

    /**
     * Test of hasfulltime method, of class Security.
     */
    @Test
    public void testHasfulltime_0args() {
    }

    /**
     * Test of hasfulltime method, of class Security.
     */
    @Test
    public void testHasfulltime_boolean() {
    }

    /**
     * This is Test of Experience Method , of class Security.
     */
    @Test
    public void testExperience() {
          String expected ="Zoo security has 5 years of experience";
        var Security = new Security("MightyLion") {};
        Security.experience();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * This is salary test method .
     */
    @Test
    public void testSalary() {
         String expected ="Security has salary of $3000 per month";
        var Security = new Security("MightyLion") {};
        Security.salary();
        
         String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of role method, of class Security.
     */
    @Test
    public void testRole() {
         String expected ="Ensures Public safety and provides emergency assistance to staff";
        var Security = new Security("MightyLion") {};
         Security.role();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected,actual);
    }

    /**
     * Test of age method, of class Security test.java
     */
    @Test
    public void testReports() {
        String expected ="Initiates and writes Accident/Incident/Hazard Reports and various other documentation required";
        var Security = new Security("MightyLion") {};
        Security.reports();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

   
/**
     * Test of main method, of class Security.
     */
    @Test
    public void testMain() {
    }
    
}