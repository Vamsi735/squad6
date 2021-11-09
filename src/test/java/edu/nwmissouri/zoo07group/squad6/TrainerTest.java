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
public class TrainerTest {
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    
    public TrainerTest() {
    }
    
    @BeforeEach
    public void setUp() {
         System.setOut(new PrintStream(outputStreamCaptor));
    }

    /**
     * Test of getSalary method, of class Trainer.
     */
    @Test
    public void testGetSalary() {
    }

    /**
     * Test of setSalary method, of class Trainer.
     */
    @Test
    public void testSetSalary() {
    }

    /**
     * Test of getLocation method, of class Trainer.
     */
    @Test
    public void testGetLocation() {
    }

    /**
     * Test of setLocation method, of class Trainer.
     */
    @Test
    public void testSetLocation() {
    }

    /**
     * Test of hasFullTime method, of class Trainer.
     */
    @Test
    public void testHasfulltime_0args() {
    }

    /**
     * Test of hasFullTime method, of class Trainer.
     */
    @Test
    public void testHasfulltime_boolean() {
    }

    /**
     * Test of role method, of class Trainer.
     */
    @Test
    public void testRole() {
        String expected ="Trainer has to train the animals to do some comedy actions infront of the audience";
        var Trainer = new Trainer("Animal");
        Trainer.role();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of experience method, of class Trainer.
     */
    @Test
    public void testExperience() {
        String expected ="Trainer  has 17 years of experience";
        var Trainer = new Trainer("Animal");
        Trainer.experience();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of salary method, of class Trainer.
     */
    @Test
    public void testSalary() {
        String expected ="Trainer salary would be around 110K dollars";
        var Trainer = new Trainer("general");
        Trainer.salary();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of preference method, of class Trainer.
     */
    @Test
    public void testPreference() {
        String expected ="Trainer used to train elephant and tiger";
        var Trainer = new Trainer("general");
        Trainer.preference();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }
    
}
