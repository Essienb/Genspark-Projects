import java.util.Scanner;

public class Dragon_Cave {

    public static void main (String[] args) {



        //The caves are for dragons and contain treasures
        String hungryDragon;
        String cave1 = "Rewarded with Treasures";
        String cave2 = "Player gets eaten on sight";
        String friendlyDragon;
        String playerAction = "Ran away out of fear";
        int dragonCaves = 1;


        //This will allow us pass an int input to simulate the various scenarios
        Scanner sc = new Scanner(System.in);
        dragonCaves = sc.nextInt();

        //To be able to pass a String input as an integer
        friendlyDragon = Integer.toString(dragonCaves);
        hungryDragon = Integer.toString(dragonCaves);

        //Another way to write the code
        //String result = (dragonCaves > 1) ? cave2 : cave1;

        //System.out.println(result);

        //Loop statement to check the various possibilities or outcomes for the players
        if (dragonCaves > 1) {


            //Print out the result of the loop based on players input
            System.out.println("Player in hungrayDragon Cave: " + cave2);


        }
        else if (dragonCaves == 1) {

            System.out.println("Player is in friendlyDragon Cave: " + cave1);
        }


        //if all conditions fail, then the below statement is printed
        else {
            System.out.println("Player did not attempt to enter Cave: " + playerAction);
        }
    }
}


