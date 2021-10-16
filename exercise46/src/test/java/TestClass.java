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
    void compareOutput(){

        Solution46 sol = new Solution46();

        sol.readAndCount("exercise46_input.txt");
        Assertions.assertEquals(7, sol.map.get("badger"));
    }
}