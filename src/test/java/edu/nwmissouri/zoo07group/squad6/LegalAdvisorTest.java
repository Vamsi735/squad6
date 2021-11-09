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
 * @author Manoj Kota
 */
public class LegalAdvisorTest {
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    
    public LegalAdvisorTest() {
    }
    
    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));

    }

    /**
     * Test of getSalary method, of class LegalAdvisor.
     */
    @Test
    public void testGetSalary() {
       
    }

    /**
     * Test of setSalary method, of class LegalAdvisor.
     */
    @Test
    public void testSetSalary() {
        
    }

    /**
     * Test of getLocation method, of class LegalAdvisor.
     */
    @Test
    public void testGetLocation() {
    }

    /**
     * Test of setLocation method, of class LegalAdvisor.
     */
    @Test
    public void testSetLocation() {
    }

    /**
     * Test of isHasMBBS method, of class LegalAdvisor.
     */
    @Test
    public void testIsHasMBBS() {
    }

    /**
     * Test of setHasMBBS method, of class LegalAdvisor.
     */
    @Test
    public void testSetHasMBBS() {
    }

    /**
     * Test of role method, of class LegalAdvisor.
     */
    @Test
    public void testRole() {
         String expected ="LegalAdvisor  has to advice the crew and staff on their actions";
        var LegalAdvisor = new LegalAdvisor("Law");
        LegalAdvisor.role();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of experience method, of class LegalAdvisor.
     */
    @Test
    public void testExperience() {
        String expected ="LegalAdvisor  has 21 years of experience";
        var LegalAdvisor = new LegalAdvisor("Law");
        LegalAdvisor.experience();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);

    }

    /**
     * Test of salary method, of class LegalAdvisor.
     */
    @Test
    public void testSalary() {
        String expected ="LegalAdvisor  salary would be 100K dollars";
        var LegalAdvisor = new LegalAdvisor("Law");
        LegalAdvisor.salary();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);

    }

    /**
     * Test of operation method, of class LegalAdvisor.
     */
    
    /**
     * Test of Legalproblems method, of class LegalAdvisor.
     */
    @Test
    public void testLegalproblems() {
         String expected ="He takes the control of legal problems";
        var LegalAdvisor = new LegalAdvisor("Law");
        LegalAdvisor.Legalproblems();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }
    
}
