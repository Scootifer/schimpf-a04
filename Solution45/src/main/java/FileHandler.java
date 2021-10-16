/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Scott Schimpf
 */

//This class will read in the file using a scanner
// The program will use the split function to split the input into a list of string lists
//each list will be the corresponding line in the file


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileHandler {

    List<String[]> lineList = new ArrayList<>();

    int readFile(String filename) {
        int row = 0;
        String input;
        Scanner scan;

        try{
            File file = new File(filename);
            scan = new Scanner(file);


        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }

        while(scan.hasNext()) {
            input = scan.nextLine();
            this.lineList.add(input.split(" "));
        }
        return 0;
    }

    void findAndReplaceUtilize() {
        for(String[] line: this.lineList) {
            for(int i =0; i<line.length; i++) {

                if(line[i].equals("utilize")) {
                    line[i] = "use";
                }
                else if (line[i].equals("Utilize")) {
                    line[i] = "Use";
                }

                else if(line[i].contains("Utilize")) {
                    String newString = "";
                    int rangeMax;
                    int rangeMin;
                    int wordLen = line[i].length();
                    rangeMin = line[i].indexOf("Utilize");
                    rangeMax = rangeMin + 7;

                    for(int z = 0; z<wordLen; z++) {
                        if(z<rangeMin) {
                            newString += line[i].charAt(z);
                        }
                        if(z==rangeMin) {
                            newString += "Use";
                        }
                        if(z>=rangeMax) {
                            newString += line[i].charAt(z);
                        }
                    }
                    line[i] = newString;
                }
                else if(line[i].contains("utilize")) {
                    String newString = "";
                    int rangeMax;
                    int rangeMin;
                    int wordLen = line[i].length();
                    rangeMin = line[i].indexOf("utilize");
                    rangeMax = rangeMin + 7;

                    for(int z = 0; z<wordLen; z++) {
                        if(z<rangeMin) {
                            newString += line[i].charAt(z);
                        }
                        if(z==rangeMin) {
                            newString += "use";
                        }
                        if(z>=rangeMax) {
                            newString += line[i].charAt(z);
                        }
                    }
                    line[i] = newString;
                }


                else if (line[i].equals("utilizes")) {
                    line[i] = "uses";
                }
                else if (line[i].equals("Utilizes")) {
                    line[i] = "Uses";
                }

                else if(line[i].contains("utilizes")) {
                    String newString = "";
                    int rangeMax;
                    int rangeMin;
                    int wordLen = line[i].length();
                    rangeMin = line[i].indexOf("utilizes");
                    rangeMax = rangeMin + 7;

                    for(int z = 0; z<wordLen; z++) {
                        if(z<rangeMin) {
                            newString += line[i].charAt(z);
                        }
                        if(z==rangeMin) {
                            newString += "uses";
                        }
                        if(z>=rangeMax) {
                            newString += line[i].charAt(z);
                        }
                    }
                    line[i] = newString;
                }
                else if(line[i].contains("Utilizes")) {
                    String newString = "";
                    int rangeMax;
                    int rangeMin;
                    int wordLen = line[i].length();
                    rangeMin = line[i].indexOf("Utilizes");
                    rangeMax = rangeMin + 7;

                    for(int z = 0; z<wordLen; z++) {
                        if(z<rangeMin) {
                            newString += line[i].charAt(z);
                        }
                        if(z==rangeMin) {
                            newString += "Uses";
                        }
                        if(z>=rangeMax) {
                            newString += line[i].charAt(z);
                        }
                    }
                    line[i] = newString;
                }
            }//for i

        }//for line
    }//find and replace

    int writeToFile(String name){
        try{
            File outfile = new File(name);
           boolean o = outfile.createNewFile();


            FileWriter writer = new FileWriter(outfile);

            for(String[] line: this.lineList) {
                for(int i =0; i<line.length; i++) {
                    writer.append(line[i]);
                    if(i != line.length-1) {
                        writer.append(" ");
                    }
                }//for i
                writer.append("\n");

            }//for line

            writer.close();

        } catch(Exception e) {
            e.printStackTrace();
            return -1;
        }
        return 0;
    }

}

