import java.util.Scanner;

public class Dragon_Cave_reworked {

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
        Scanner sc = new Scanner(System.in);
        cave = sc.nextInt();

        if (cave == 1) {
            System.out.println("Player is in friendlyDragon Cave: " + caveF);
        }
        if (cave >= 2) {
            System.out.println("Player in hungrayDragon Cave: " + caveH);
        } else {
            System.out.println("Player did not attempt to enter Cave: ");
            }

            sc.reset();
        }
    }















