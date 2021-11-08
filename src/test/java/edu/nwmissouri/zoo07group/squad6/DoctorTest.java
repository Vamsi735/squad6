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
 * @author S545400
 */
public class DoctorTest {
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    
    public DoctorTest() {
    }
    
    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));

    }

    /**
     * Test of getSalary method, of class Doctor.
     */
    @Test
    public void testGetSalary() {
    }

    /**
     * Test of setSalary method, of class Doctor.
     */
    @Test
    public void testSetSalary() {
    }

    /**
     * Test of getLocation method, of class Doctor.
     */
    @Test
    public void testGetLocation() {
    }

    /**
     * Test of setLocation method, of class Doctor.
     */
    @Test
    public void testSetLocation() {
    }

    /**
     * Test of isHasMBBS method, of class Doctor.
     */
    @Test
    public void testIsHasMBBS() {
    }

    /**
     * Test of setHasMBBS method, of class Doctor.
     */
    @Test
    public void testSetHasMBBS() {
    }

    /**
     * Test of role method, of class Doctor.
     */
    @Test
    public void testRole() {
        String expected ="Doctor has to perform opearations";
        var Doctor = new Doctor("general");
        Doctor.role();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of experience method, of class Doctor.
     */
    @Test
    public void testExperience() {
        String expected ="Doctor has 11 years of experience";
        var Doctor = new Doctor("general");
        Doctor.experience();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of salary method, of class Doctor.
     */
    @Test
    public void testSalary() {
        String expected ="Doctor salary would be 120K dollars";
        var Doctor = new Doctor("general");
        Doctor.salary();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of duties method, of class Doctor.
     */
    @Test
    public void testDuties() {
        String expected ="he advices duties on their and experince";
        var Doctor = new Doctor("general");
        Doctor.duties();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of main method, of class Doctor.
     */
    @Test
    public void testMain() {
    }
    
}
