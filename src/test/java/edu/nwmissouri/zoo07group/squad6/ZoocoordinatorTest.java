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
 * @author S545261
 */
public class ZoocoordinatorTest {
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    
   
    
    public ZoocoordinatorTest() {
    }
    
    @BeforeEach
    public void setUp() {
         System.setOut(new PrintStream(outputStreamCaptor));
        
    }

    /**
     * Test of getSalary method, of class Zoocoordinator.
     */
    @Test
    public void testGetSalary() {
    }

    /**
     * Test of setSalary method, of class Zoocoordinator.
     */
    @Test
    public void testSetSalary() {
    }

    /**
     * Test of getLocation method, of class Zoocoordinator.
     */
    @Test
    public void testGetLocation() {
    }

    /**
     * Test of setLocation method, of class Zoocoordinator.
     */
    @Test
    public void testSetLocation() {
    }

    /**
     * Test of hasfulltime method, of class Zoocoordinator.
     */
    @Test
    public void testHasfulltime_0args() {
    }

    /**
     * Test of hasfulltime method, of class Zoocoordinator.
     */
    @Test
    public void testHasfulltime_boolean() {
    }

    /**
     * Test of role method, of class Zoocoordinator.
     */
    @Test
    public void testRole() {
    }

    /**
     * Test of experience method, of class Zoocoordinator.
     */
    @Test
    public void testExperience() {
         String expected ="in sofware i have 5 years of experience";
        var Registrar = new Registrar("sub");
        Registrar.experience();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }
     
    /**
     * Test of salary method, of class Zoocoordinator.
     */
    @Test
    public void testSalary() {
        String expected ="i have 6000$ salary";
        var Trainer = new Trainer("general");
        Trainer.salary();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of perfomannce method, of class Zoocoordinator.
     */
    @Test
    public void testPerfomance() {
        String expected ="developer sees the performance in it";
        var Trainer = new Trainer("general");
        Trainer.preference();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
        
    }
    
}
