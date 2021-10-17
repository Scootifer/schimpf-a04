import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestClass {

    @Test
    void TestDirectoryCreation(){
        SiteCreator s = new SiteCreator();

        s.setName("SITE");

        s.setAuthor("AUTHOR");

        s.createWebsiteDir();
        s.createIndex();

        File f = new File("SITE/");

        Assertions.assertTrue(f.exists());

    }

    @Test
    void TestIndex() throws FileNotFoundException {
        SiteCreator s = new SiteCreator();

        s.setName("SITE");

        s.setAuthor("AUTHOR");

        s.createWebsiteDir();
        s.createIndex();

        File f = new File("SITE/index.html");

        Scanner index = new Scanner(f);
        Scanner ACTUAL = new Scanner(new File("src/test/resources/index.html"));

        while(ACTUAL.hasNext()) {
            Assertions.assertTrue(ACTUAL.nextLine().equals(index.nextLine()));
        }

    }
}
