/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Scott Schimpf
 */


//THis program will use a FileParser class that will handle reading, storing, and outputting data

public class Solution42 {

    public static void main(String[] args) {
        FileParser fp = new FileParser();

        fp.readCSV("data.csv");

        fp.printTable();
        //System.out.println(fp.getFirstName(0) + " " + fp.getLastName(0) + " " + fp.getSalary(0));
    }

}
