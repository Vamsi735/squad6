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
public class ZoologistTest {
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    public ZoologistTest() {
    }
    
    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    /**
     * Test of getSalary method, of class Zoologist.
     */
    @Test
    public void testGetSalary() {
    }

    /**
     * Test of setSalary method, of class Zoologist.
     */
    @Test
    public void testSetSalary() {
    }

    /**
     * Test of getLocation method, of class Zoologist.
     */
    @Test
    public void testGetLocation() {
    }

    /**
     * Test of setLocation method, of class Zoologist.
     */
    @Test
    public void testSetLocation() {
    }

    /**
     * Test of hasfulltime method, of class Zoologist.
     */
    @Test
    public void testHasfulltime_0args() {
    }

    /**
     * Test of hasfulltime method, of class Zoologist.
     */
    @Test
    public void testHasfulltime_boolean() {
    }

    /**
     * Test of role method, of class Zoologist.
     */
    @Test
    public void testRole() {
        String expected ="Promoting the conservation of zoolife.";
        var Zoologist = new Zoologist("general");
        Zoologist.role();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of experience method, of class Zoologist.
     */
    @Test
    public void testExperience() {
        String expected ="Zoologist should have enough expereince to deal with zoo life.";
        var Zoologist = new Zoologist("general");
        Zoologist.experience();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of salary method, of class Zoologist.
     */
    @Test
    public void testSalary() {
        String expected ="Zoologist has salary around 120k dollars";
        var Zoologist = new Zoologist("general");
        Zoologist.salary();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of workKnowledge method, of class Zoologist.
     */
    @Test
    public void testWorkKnowledge() {
        String expected ="I have more knowledge on animals.";
        var Zoologist = new Zoologist("general");
        Zoologist.workKnowledge();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }
    
}
