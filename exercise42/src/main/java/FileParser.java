/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Scott Schimpf
 */

//This class will use the readCSV function to read the CSV file
// The data will be stored in its respective arraylist
// The class will use a printTable function to print the data
// For junit testing a getter method will be made for each arrayList

// the readCSV function will split the data using the split function, and from there parse the data
// the typeIterator will be used to determine where data will be stored


import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class FileParser {

    private ArrayList<String> lastNames = new ArrayList<>();
    private ArrayList<String> firstNames = new ArrayList<>();
    private ArrayList<Double> salaries = new ArrayList<>();

    int typeIterator = 0;
    String line[] = new String[3];

    public void readCSV(String fileName) {
        try {
            Scanner infile = new Scanner(new File(fileName));

            while(infile.hasNext()) {

                line = infile.nextLine().split(",");
                for(String s : line) {

                    if(typeIterator == 0) {
                        this.lastNames.add(s);
                        typeIterator++;
                    }
                    else if(typeIterator == 1) {
                        this.firstNames.add(s);
                        typeIterator++;
                    }
                    else if(typeIterator == 2) {
                        this.salaries.add(Double.parseDouble(s));
                        typeIterator = 0;
                    }
                }


            }//while infile
            infile.close();
        }
        catch(Exception e) {
            System.out.println(e);
            return;
        }

    } //readCSV

    public void printTable() {
        System.out.printf("%-12s%-12s%-10.2d", "Last", "First", "Salary");
        System.out.println("------------------------------------------------------------");
        for(int i = 0; i< this.lastNames.size(); i++) {
            System.out.printf("%-12s%-12s%-10.2d", this.lastNames.get(i), this.firstNames.get(i), this.salaries.get(i));
        }

    }

    public String getLastName(int location) {
        return this.lastNames.get(location);
    }
    public String getFirstName(int location) {
        return this.firstNames.get(location);
    }
    public double getSalary(int location) {
        return this.salaries.get(location);
    }


}
