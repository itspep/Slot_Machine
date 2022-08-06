import java.util.Scanner;
import java.util.Random;

public class Slot_Machine{
    public static void main() {
        double money;
        int rand1, rand2, rand3;
        char again;
        do {
            System.out.println("Enter the amount of money you wish to play with,");
            System.out.print("the lever will be automatically pulled");
            Scanner input = new Scanner(System.in);
            money = input.nextDouble();
            Random randNum = new Random();
            rand1 = randNum.nextInt(6);
            rand2 = randNum.nextInt(6);
            rand3 = randNum.nextInt(6);
            switch (rand1) {
                case 0:
                    System.out.println("Cherries");
                    break;
                case 1:
                    System.out.println("Oranges");
                    break;
                case 2:
                    System.out.println("Plums");
                    break;
                case 3:
                    System.out.println("Bells");
                    break;
                case 4:
                    System.out.println("Melons");
                    break;
                case 5:
                    System.out.println("Bars");
                    break;
            }
            switch (rand2) {
                case 0:
                    System.out.println("Cherries");
                    break;
                case 1:
                    System.out.println("Oranges");
                    break;
                case 2:
                    System.out.println("Plums");
                    break;
                case 3:
                    System.out.println("Bells");
                    break;
                case 4:
                    System.out.println("Melons");
                    break;
                case 5:
                    System.out.println("Bars");
                    break;
            }
            switch (rand3) {
                case 0:
                    System.out.println("Cherries");
                    break;
                case 1:
                    System.out.println("Oranges");
                    break;
                case 2:
                    System.out.println("Plums");
                    break;
                case 3:
                    System.out.println("Bells");
                    break;
                case 4:
                    System.out.println("Melons");
                    break;
                case 5:
                    System.out.println("Bars");
                    break;
            }
            if (rand1 == rand2) {
                System.out.println("Congratulations! you won double your money");
            } else if (rand1 == rand3) {
                System.out.println("Congratulations! you won double your money");
            } else if (rand2 == rand3) {
                System.out.println("Congratulations! you won double your money");
            } else if (rand1 == rand2 && rand2 == rand3) {
                System.out.println("Congratulations! you won thrice your money");
            } else System.out.println("You lost!, try again");
            again = input.nextChar();
        }
        while(again=='y');


    }
}