/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Scott Schimpf
 */

//This program will use the gson library to parse the json file. I will make use of the
// gson library's ability to be written into a class Product

//updated psuedocode
//function inputLoop will handle input and return a valid string name

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution44 {

    private List<Product> productList = new ArrayList<>();
    private Scanner scan = new Scanner(System.in);

    void printProduct(Product p){
        System.out.println("Name: " + p.getName());
        System.out.println("Price: " + p.getPrice());
        System.out.println("Quantity: " + p.getQuantity());
    }

    //returns 0 when found
    //returns -1 for not found
    int findProduct(String name) {
        for(Product p : this.productList) {
            if( p.getName().equalsIgnoreCase(name)){
                printProduct(p);
                return 0;
            }
        }
        return -1;
    }

    void inputLoop(){
        int wordFound;

        do {
            System.out.print("Please enter a Product: ");
            wordFound = findProduct(this.scan.nextLine());

            if (wordFound == 0) {
                return;
            }
            else {
                System.out.println("Sorry that Product was not found");
            }

        }while(true);
    }

    void readJson(String filename) {
        try{
            Gson gson = new Gson();

            Reader reader = Files.newBufferedReader(Paths.get(filename));
            JsonObject e = (JsonObject) JsonParser.parseReader(reader);
            JsonArray list = e.getAsJsonArray("products");


            productList = new Gson().fromJson(list, new TypeToken<List<Product>>() {}.getType());
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        Solution44 obj = new Solution44();
        obj.readJson("exercise44_input.json");
        obj.inputLoop();





    }
}
