/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.nwmissouri.zoo07group.squad6;

import org.junit.jupiter.api.BeforeEach;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author S545261
 */
public class SoftwaredevTest {
   private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    
    public SoftwaredevTest() {
         
    }
    
    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    /**
     * Test of getSalary method, of class software developer.
     */
    @Test
    public void testGetSalary() {
    }

    /**
     * Test of setSalary method, of class Software developer.
     */
    @Test
    public void testSetSalary() {
    }

    /**
     * Test of getLocation method, of class Softwaredev.
     */
    @Test
    public void testGetLocation() {
    }

    /**
     * Test of setLocation method, of class Softwaredev.
     */
    @Test
    public void testSetLocation() {
    }

    /**
     * Test of hasfulltime method, of class Softwaredev.
     */
    @Test
    public void testHasfulltime_0args() {
    }

    /**
     * Test of hasfulltime method, of class Softwaredev.
     */
    @Test
    public void testHasfulltime_boolean() {
    }

    /**
     * Test of experience method, of class Softwaredev.
     */
    @Test
    public void testExperience() {
          String expected ="in sofware i have 5 years of experience ";
        var Softwaredev = new Softwaredev("general");
        Softwaredev.experience();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of salary method, of class Softwaredev.
     */
    @Test
    public void testSalary() {
         String expected ="i have 6000$ salary.";
        var softwaredev = new Softwaredev("general");
        softwaredev.salary();
         String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of role method, of class Softwaredev.
     */
    @Test
    public void testRole() {
         String expected ="my role is  developing zoo website";
        var softwaredev = new Softwaredev("general");
        softwaredev.role();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected,actual);
    }

    /**
     * Test of age method, of class Softwaredev test.java
     */
    @Test
    public void testAge() {
        String expected ="my age is 22";
        var Softwaredev = new Softwaredev("general");
        Softwaredev.age();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }
    
}
