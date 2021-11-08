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
public class RegistrarTest {
    
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    
    public RegistrarTest() {
    }
    
    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    /**
     * Test of getSalary method, of class Registrar.
     */
    @Test
    public void testGetSalary() {
        
    }

    /**
     * Test of setSalary method, of class Registrar.
     */
    @Test
    public void testSetSalary() {
    }

    /**
     * Test of getLocation method, of class Registrar.
     */
    @Test
    public void testGetLocation() {
    }

    /**
     * Test of setLocation method, of class Registrar.
     */
    @Test
    public void testSetLocation() {
    }

    /**
     * Test of hasfulltime method, of class Registrar.
     */
    @Test
    public void testHasfulltime_0args() {
    }

    /**
     * Test of hasfulltime method, of class Registrar.
     */
    @Test
    public void testHasfulltime_boolean() {
    }

    /**
     * Test of role method, of class Registrar.
     */
    @Test
    public void testRole() {
        String expected ="maintain wide variety of records relating to animals";
        var Registrar = new Registrar("sub");
        Registrar.role();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of experience method, of class Registrar.
     */
    @Test
    public void testExperience() {
        String expected ="Registrar has 15 years of experience";
        var Registrar = new Registrar("sub");
        Registrar.experience();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of salary method, of class Registrar.
     */
    @Test
    public void testSalary() {
        String expected ="Registrar salary would be 60k dollars";
        var Registrar = new Registrar("sub");
        Registrar.salary();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of dataentry method, of class Registrar.
     */
    @Test
    public void testDataentry() {
        String expected ="Follow procedures and apply data program techniques.";
        var Registrar = new Registrar("sub");
        Registrar.dataentry();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
        
    }

    /**
     * Test of languages method, of class Registrar.
     */
    @Test
    public void testLanguages() {
        String expected ="Speak different languages";
        var Registrar = new Registrar("sub");
        Registrar.languages();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);

        
    }

    /**
     * Test of organize method, of class Registrar.
     */
    @Test
    public void testOrganize() {
        String expected ="Organise and classify records of prepared reports";
        var Registrar = new Registrar("sub");
        Registrar.organize();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }
    
}
