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
    void showSimpleAssertion() throws FileNotFoundException {

        Solution41 sol = new Solution41();
        sol.sortNames("src/test/resources/");
        Scanner user = new Scanner(new File("src/test/resources/exercise41_output.txt"));
        Scanner ACTUAL = new Scanner(new File("src/test/resources/EXPECTED_OUTPUT.txt"));
        while(ACTUAL.hasNext()) {
            Assertions.assertTrue(ACTUAL.nextLine().equals(user.nextLine()));
        }
    }
}
