package Project_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GeeksCode {

    public static void main(String[] argv)
            throws Exception
    {

        String s = "Gfg true 9 + 6 = 12.0 false";

        // create a new scanner
        // with the specified String Object
        InputStreamReader ir = new InputStreamReader(System. in );
        BufferedReader br = new BufferedReader(ir);
        System.out.println("Enter your name:");
        String name = br.readLine();
        System.out.println("You entered: " + name);
        String sentence;
        System.out.println("Enter a sentence:");
        sentence = br.readLine();
        System.out.println("You entered: " + sentence);
    }
}