import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
//import static.org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.util.Scanner;

public class Dragon_Cave {

    private int cave1 = 1;
    private int cave2 = 2;
    private static String caveF = "Rewarded with Treasures";
    private static String caveH = "Player gets eaten on sight";

    public static void main(String[] args) {
        System.out.println("The land is full of Dragons that live in caves" + '\n');
        System.out.println("select between 0 - 2. If you are lucky a " +
                "Friendly Dragon will share treasures with you" + '\n');

        int cave = 1 + (int) (2
                * Math.random());

        //This will allow us pass an int input to simulate the various scenarios
        Scanner sc = new Scanner(System.in);
        cave = sc.nextInt();
        try {
            //Loop statement to check the various possibilities or outcomes for the players
            if (cave == 1) {
                System.out.println("Player is in friendlyDragon Cave: " + caveF);
            }
            if (cave >= 2) {
                System.out.println("Player in hungrayDragon Cave: " + caveH);
            } else {
                //Print out the result of the loop based on players input
                System.out.println("Player did not attempt to enter Cave: ");
            }

            sc.reset();
        } catch (SecurityException s) {
            System.out.println(s);
        }
    }
}



