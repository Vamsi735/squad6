/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.nwmissouri.zoo07group.squad6;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


/**
 *
 * @author S545712
 */
public class VisitorServiceManagerTest {
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    
    public VisitorServiceManagerTest() {
    }
    
    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }
    
    /**
     * Test of getSalary method, of class VisitorServiceManager.
     */
    @Test
    public void testGetSalary() {
 
    }

    /**
     * Test of setSalary method, of class VisitorServiceManager.
     */
    @Test
    public void testSetSalary() {
      
    }

    /**
     * Test of getLocation method, of class VisitorServiceManager.
     */
    @Test
    public void testGetLocation() {
       
    }

    /**
     * Test of setLocation method, of class VisitorServiceManager.
     */
    @Test
    public void testSetLocation() {
        
    }

    /**
     * Test of hasfulltime method, of class VisitorServiceManager.
     */
    @Test
    public void testHasfulltime_0args() {
       
    }

    /**
     * Test of hasfulltime method, of class VisitorServiceManager.
     */
    @Test
    public void testHasfulltime_boolean() {
        
    }

    /**
     * Test of role method, of class VisitorServiceManager.
     */
    @Test
    public void testRole() {
        String expected ="Provide guests with information on all aspects of the Zoo experience such as exhibits, shuttles, train, and membership information;";
        var VisitorServiceManager = new VisitorServiceManager ("MightyLion");
        VisitorServiceManager.role();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
      
    }

    /**
     * Test of experience method, of class VisitorServiceManager.
     */
    @Test
    public void testExperience() {
        String expected ="Visitor Service manager has 10 years of experience";
        var VisitorServiceManager = new VisitorServiceManager ("MightyLion");
        VisitorServiceManager.experience();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
      
       
    }

    /**
     * Test of salary method, of class VisitorServiceManager.
     */
    @Test
    public void testSalary() {
        String expected ="Visitor Service manager has salary of $4000 per month";
        var VisitorServiceManager = new VisitorServiceManager ("MightyLion");
        VisitorServiceManager.salary();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
      
        
    }

    /**
     * Test of safety method, of class VisitorServiceManager.
     */
    @Test
    public void testSafety() {
     String expected ="Assist with transporting guests safely to and from designated locations throughout assigned shift";
        var VisitorServiceManager = new VisitorServiceManager ("MightyLion");
        VisitorServiceManager.safety();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
       
    }
    
}
