/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Scott Schimpf
 */

// the solution class will only handle input of the output file name

import java.util.Scanner;

public class Solution45 {

    public static void main(String[] args) {
        FileHandler fh = new FileHandler();
        Scanner scan = new Scanner(System.in);


        fh.readFile("exercise45_input.txt");
        fh.findAndReplaceUtilize();
        System.out.print("Please enter an output file name: ");
        fh.writeToFile(scan.nextLine());


    }
}
