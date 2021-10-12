/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Scott Schimpf
 */

import java.util.Collections;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.ArrayList;

//This program will use the sortNames(String fileName) function to read the file to a list and then use the collections package sort feature.
// Since all names have a comma in them it is fair to count it in the calculation as the collections package does.

class Solution41 {

    public void sortNames(String folderSet) {

        ArrayList<String> list = new ArrayList<>();

        try {
            File outFile = new File(folderSet+"exercise41_output.txt");
            outFile.createNewFile();
            FileWriter writer = new FileWriter(outFile);

            File inFile = new File(folderSet+"exercise41_input.txt");
            Scanner scan = new Scanner(inFile);

            while(scan.hasNext()) {
                list.add(scan.nextLine());
            }

            Collections.sort(list, String.CASE_INSENSITIVE_ORDER);

            writer.write("There are " + list.size() + " names:\n");
            writer.write("--------------------\n");
            for(String s : list) {
                writer.write(s + "\n");

            }
            writer.close();
        }
        catch(Exception e){
            System.out.println("Error " + e);
        }


    }

    public static void main(String[] args) {
        final Solution41 obj = new Solution41();


        obj.sortNames("src/main/resources/");


    }


}