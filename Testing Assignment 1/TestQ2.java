package Testing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import org.junit.Test;
import static org.junit.Assert.*;


public class TestQ2 {

    @Test
    public void test1() {
        Scanner ScIn = null;
        try {
            ScIn = new Scanner(new File("Testinput1.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int [][] arr = new int [100][3];

        int n = ScIn.nextInt();

        int i = 0;

        while(ScIn.hasNextInt())
        {
            arr[i][0] = ScIn.nextInt();
            arr[i][1] = ScIn.nextInt();
            arr[i][2] = ScIn.nextInt();
            i++;
        }
        assertTrue(Q2.Forces(n, arr).equals("NO"));
    }

    @Test
    public void test2() {
        Scanner ScIn = null;
        try {
            ScIn = new Scanner(new File("Testinput2.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        int [][] arr = new int [100][3];

        int n = ScIn.nextInt();

        int i = 0;

        while(ScIn.hasNextInt())
        {
            arr[i][0] = ScIn.nextInt();
            arr[i][1] = ScIn.nextInt();
            arr[i][2] = ScIn.nextInt();
            i++;
        }
        assertTrue (Q2.Forces(n, arr).equals("YES"));
    }
}
