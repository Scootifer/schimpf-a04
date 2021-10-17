
//
// This site will create a website directory, then create an index.html file,
// and finally a jss and css directories if needed

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;


class SiteCreator {

    private String name;
    private String author;
    private String siteDirectory = "";

    public void setName(String n) {
        this.name = n;
    }

    public void setAuthor(String a) {
        this.author = a;
    }

    public void createIndex() {

        try {
            File outfile = new File(this.siteDirectory + "index.html");
            outfile.createNewFile();

            FileWriter writer = new FileWriter(outfile);

            writer.write("<HTML>\n");
            writer.write("<title>"+ this.name + "</title>\n");
            writer.write("<meta>"+ this.author + "</meta>\n");
            writer.write("</HTML>");

            writer.close();
        }
        catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public void createWebsiteDir() {
        File dir = new File(this.name);
        dir.mkdir();
        this.siteDirectory += "" + this.name + "/";

    }

    public void createCSSDir() {
        File dir = new File(this.siteDirectory + "css");
        dir.mkdir();

    }

    public void createJSDir() {
        File dir = new File(this.siteDirectory + "js");
        dir.mkdir();

    }

    //11
    //25
    //24
    //17
    //49

    //Steven Skiena
}