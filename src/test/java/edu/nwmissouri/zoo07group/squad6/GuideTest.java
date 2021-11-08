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
 * @author Vamsi Bhogireddy
 */
public class GuideTest {
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    
    public GuideTest() {
        
    }
    
    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    /**
     * Test of getSalary method, of class Guide.
     */
    @Test
    public void testGetSalary() {
    }

    /**
     * Test of setSalary method, of class Guide.
     */
    @Test
    public void testSetSalary() {
    }

    /**
     * Test of getLocation method, of class Guide.
     */
    @Test
    public void testGetLocation() {
    }

    /**
     * Test of setLocation method, of class Guide.
     */
    @Test
    public void testSetLocation() {
    }

    /**
     * Test of hasfulltime method, of class Guide.
     */
    @Test
    public void testHasfulltime_0args() {
    }

    /**
     * Test of hasfulltime method, of class Guide.
     */
    @Test
    public void testHasfulltime_boolean() {
    }

    /**
     * Test of experience method, of class Guide.
     */
    @Test
    public void testExperience() {
        String expected ="Guide has 10 years of experience";
        var Guide = new Guide("Animal");
        Guide.experience();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of salary method, of class Guide.
     */
    @Test
    public void testSalary() {
        String expected ="guide has salary around 90k dollars";
        var Guide = new Guide("Animal");
        Guide.salary();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of role method, of class Guide.
     */
    @Test
    public void testRole() {
        String expected ="Role of the guide is to guide audience";
        var Guide = new Guide("Animal");
        Guide.role();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of workableDays method, of class Guide.
     */
    @Test
    public void testWorkableDays() {
    }
    
}