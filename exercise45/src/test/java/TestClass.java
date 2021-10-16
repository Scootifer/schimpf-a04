/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Scott Schimpf
 */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestClass {

    @Test
    void compareOutput() throws FileNotFoundException {

        FileHandler fh = new FileHandler();

        Assertions.assertEquals(0, fh.readFile("exercise45_input.txt"));

        fh.findAndReplaceUtilize();

        Assertions.assertEquals(0, fh.writeToFile("src/test/resources/Test_Output.txt"));

        Scanner user = new Scanner(new File("src/test/resources/Test_Output.txt"));
        Scanner ACTUAL = new Scanner(new File("src/test/resources/EXPECTED_OUTPUT.txt"));
        while(ACTUAL.hasNext()) {
            Assertions.assertTrue(ACTUAL.nextLine().equals(user.nextLine()));
        }
    }
}