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
 * @author S545155
 */
public class VeterinarianTest {
    
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    
    public VeterinarianTest() {
    }
    
    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    /**
     * Test of getSalary method, of class Veterinarian.
     */
    @Test
    public void testGetSalary() {
    }

    /**
     * Test of setSalary method, of class Veterinarian.
     */
    @Test
    public void testSetSalary() {
    }

    /**
     * Test of getLocation method, of class Veterinarian.
     */
    @Test
    public void testGetLocation() {
    }

    /**
     * Test of setLocation method, of class Veterinarian.
     */
    @Test
    public void testSetLocation() {
    }

    /**
     * Test of hasfulltime method, of class Veterinarian.
     */
    @Test
    public void testHasfulltime_0args() {
    }

    /**
     * Test of hasfulltime method, of class Veterinarian.
     */
    @Test
    public void testHasfulltime_boolean() {
    }

    /**
     * Test of role method, of class Veterinarian.
     */
    @Test
    public void testRole() {
        String expected ="Examine animals to assess their health and diagnose problems";
        var Veterinarian = new Veterinarian("voluntary");
        Veterinarian.role();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of experience method, of class Veterinarian.
     */
    @Test
    public void testExperience() {
        String expected ="veternian have 20years of experience";
        var Veterinarian = new Veterinarian("voluntary");
        Veterinarian.experience();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of salary method, of class Veterinarian.
     */
    @Test
    public void testSalary() {
        String expected ="veternarian avg salary is 80k dollars";
        var Veterinarian = new Veterinarian("voluntary");
        Veterinarian.salary();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of vaccinate method, of class Veterinarian.
     */
    @Test
    public void testVaccinate() {
        String expected ="Systemvaccinate animals against diseases";
        var Veterinarian = new Veterinarian("voluntary");
        Veterinarian.vaccinate();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of advise method, of class Veterinarian.
     */
    @Test
    public void testAdvise() {
        String expected ="Advise pet owners on nutrition, preventive healthcare and general care";
        var Veterinarian = new Veterinarian("voluntary");
        Veterinarian.advise();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }
    
}
