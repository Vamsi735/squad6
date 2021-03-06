/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edu.nwmissouri.zoo07group.squad6;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 *
 * @author Manoj Kota
 */
public class Squad6CheckFiles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        listUnexpectedFilesInRoot();
        listUnexpectedFilesInSrc();
        listUnexpectedFilesInSrcMainJava();
    }
    private static void listUnexpectedFilesInRoot() {
        // find the allowable root files
        ArrayList<String> acceptableList = getExpectedRootFiles();
        // process all found files, outputing ones that don't belong
        File fileFolder = new File(getProjectPathString());
        String filesArray[] = fileFolder.list();
        System.out.println("===============================");
        System.out.println("Unexpected Files in Root Folder");
        System.out.println("===============================");
        for (String file : filesArray) {
            if (!acceptableList.contains(file)) {
                System.out.println(file);
            }
        }
        System.out.println("===============================\n");
    }

    private static void listUnexpectedFilesInSrc() {
        // find the allowable src files/folders
        ArrayList<String> acceptableList = getExpectedSrcFiles();
        // process all found files, outputing ones that don't belong
        File fileFolder = new File(getProjectPathString() + "/src");
        String filesArray[] = fileFolder.list();
        System.out.println("===============================");
        System.out.println("Unexpected Files in src Folder");
        System.out.println("===============================");
        for (String file : filesArray) {
            if (!acceptableList.contains(file)) {
                System.out.println(file);
            }
        }
        System.out.println("===============================\n");
    }

    private static void listUnexpectedFilesInSrcMainJava() {
        // find the allowable src main java files/folders
        ArrayList<String> acceptableList = getExpectedSrcMainJavaFiles();
        // process all found files, outputing ones that don't belong
        File fileFolder = new File(getProjectPathString() + "/src/main/java");
        String filesArray[] = fileFolder.list();
        System.out.println("========================================");
        System.out.println("Unexpected Files in src/main/java Folder");
        System.out.println("========================================");
        for (String file : filesArray) {
            if (!acceptableList.contains(file)) {
                System.out.println(file);
            }
        }
        System.out.println("========================================\n");
    }

    /**
     * Get a list of expected files in the root project directory.
     *
     * @return String[] of expected file names
     */
    private static ArrayList<String> getExpectedRootFiles() {
        return getFileLines("ROOT_FILES.txt");
    }

    /**
     * Get our project root directory as a String.
     *
     * @return project path string
     */
    private static String getProjectPathString() {
        Path projectPath = Paths.get("").toAbsolutePath();
        String projectPathString = projectPath.normalize().toString();
        return projectPathString;
    }

    /**
     * Read a file and return contents as an ArrayList of Strings
     *
     * @param fileName - the String path and file name of the file to read
     * @return ArrayList of Strings with each line in the file as an entry
     */
    public static ArrayList<String> getFileLines(String fileName) {
        var lines = new ArrayList<String>();
        try {
            lines = (ArrayList<String>) Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
        } catch (IOException e) {
            System.out.println("Error reading " + fileName);
        }
        return lines;
    }

    private static ArrayList<String> getExpectedSrcMainJavaFiles() {
        var list = new ArrayList<String>();
        list.add("edu");
        return list;
    }

    private static ArrayList<String> getExpectedSrcFiles() {
        var list = new ArrayList<String>();
        list.add("main");
        list.add("test");
        return list;
    }
    
}
