
//This Solution will use a SiteCreator class to handle file and directory creation
//

import java.util.Scanner;

class Solution43 {



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        SiteCreator s = new SiteCreator();

        System.out.print("Please enter a site name: ");
        s.setName(scan.nextLine());

        System.out.print("Please enter a site Author: ");
        s.setAuthor(scan.nextLine());

        s.createWebsiteDir();
        s.createIndex();

        System.out.print("Would you like a js directory (y/n): ");
        if(scan.next().equals("y")) {
            s.createJSDir();
        }
        System.out.print("\n");

        System.out.print("Would you like a css directory (y/n): ");
        if(scan.next().equals("y")) {
            s.createCSSDir();
        }
        System.out.print("\n");


    }
}