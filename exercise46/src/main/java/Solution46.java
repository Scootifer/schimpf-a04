/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Scott Schimpf
 */

//Similarly to the last solution, this solution will store a list containing each of the lines in the file
// The solution will then loop through each line word by word, comparing it to values in a treemap
// if any keys match, the value will be incremented, if the value is not found it will be added
// Making use of a tree map comes with automatic sorting

//updated pseudocode:
// The program can easily be implemented to have the count be done when data is read from the file
// this negates the need for a separate function

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Solution46 {

    List<String[]> lineList = new ArrayList<>();
    TreeMap<String, Integer> map = new TreeMap<>();

    public void readAndCount(String filename)  {
        String input;
        Scanner scan;

        try {
            File file = new File(filename);
            scan = new Scanner(file);

            int count;
            String[] split;

            while(scan.hasNext()) {
                input = scan.nextLine();
                split = input.split(" ");
                for(String s : split) {
                    count = this.map.getOrDefault(s, 0);
                    this.map.put(s, count + 1);
                }
            }

        } catch(Exception e) {
            e.printStackTrace();
        }




    }

    void printOutput(){
        int iterations;
        for(Map.Entry<String, Integer> e : this.map.entrySet()) {
            iterations = e.getValue();
            System.out.print(e.getKey() + ": ");
            for(int i =0; i<iterations; i++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }



    public static void main(String[] args) {
        Solution46 sol = new Solution46();

        sol.readAndCount("exercise46_input.txt");
        sol.printOutput();

    }

}
