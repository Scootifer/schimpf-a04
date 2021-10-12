import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestClass {

    @Test
    void showSimpleAssertion() throws FileNotFoundException {
        Scanner scan = new Scanner(new File("exercise41_output.txt"));
        Solution41 sol = new Solution41();
        String[] correct = {"Frank", "Lisa", "Tom"};
        for(String i : correct) {
            Assertions.assertTrue(i.equals(scan.nextLine()));
        }
    }
}
