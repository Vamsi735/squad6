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
 * @author Vamsi krishna Areti (S544902)
 */
public class ZooDirectorTest {
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    public ZooDirectorTest() {
    }
    
    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    /**
     * Test of getSalary method, of class ZooDirector.
     */
    @Test
    public void testGetSalary() {
    }

    /**
     * Test of setSalary method, of class ZooDirector.
     */
    @Test
    public void testSetSalary() {
    }

    /**
     * Test of getLocation method, of class ZooDirector.
     */
    @Test
    public void testGetLocation() {
    }

    /**
     * Test of setLocation method, of class ZooDirector.
     */
    @Test
    public void testSetLocation() {
    }

    /**
     * Test of hasfulltime method, of class ZooDirector.
     */
    @Test
    public void testHasfulltime_0args() {
    }

    /**
     * Test of hasfulltime method, of class ZooDirector.
     */
    @Test
    public void testHasfulltime_boolean() {
    }

    /**
     * Test of role method, of class ZooDirector.
     */
    @Test
    public void testRole() {
        String expected ="Directs how the zoo organises the events and all.";
        var ZooDirector = new ZooDirector("curator");
        ZooDirector.role();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of experience method, of class ZooDirector.
     */
    @Test
    public void testExperience() {
        String expected ="Zoo Director should have lot of experience.";
        var ZooDirector = new ZooDirector("curator");
        ZooDirector.experience();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of salary method, of class ZooDirector.
     */
    @Test
    public void testSalary() {
        String expected ="Zoo Director salary would be 120K dollars";
        var ZooDirector = new ZooDirector("curator");
        ZooDirector.salary();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of newEvents method, of class ZooDirector.
     */
    @Test
    public void testNewEvents() {
        String expected ="Zoo Director should do direction for new events and all.";
        var ZooDirector = new ZooDirector("curator");
        ZooDirector.newEvents();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }
    
    
}
