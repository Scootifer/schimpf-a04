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
    void wordFound() {
        Solution44 obj = new Solution44();
        obj.readJson("exercise44_input.json");
        Assertions.assertEquals(0, obj.findProduct("widget"));
    }

    @Test
    void wordNotFound() {
        Solution44 obj = new Solution44();
        obj.readJson("exercise44_input.json");
        Assertions.assertEquals(-1, obj.findProduct("widdy"));
    }

}
