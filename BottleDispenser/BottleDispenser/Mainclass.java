package BottleDispenser;

// Joona Manninen 29.1.2022 Lecture 3
import java.util.Scanner;

public class Mainclass {

    public static void main(String[] args) {
        BottleDispenser bd = new BottleDispenser();
        loop: while (true) {
            System.out.println("");
            System.out.println("*** BOTTLE DISPENSER ***");
            System.out.println("1) Add money to the machine");
            System.out.println("2) Buy a bottle");
            System.out.println("3) Take money out");
            System.out.println("4) List bottles in the dispenser");
            System.out.println("0) End");
            // Taking user input
            Scanner in = new Scanner(System.in);
            System.out.print("Your choice: ");
            // Making it integer
            String jiis = in.nextLine();
            int val = Integer.valueOf(jiis);
            // Menu structure
            switch (val) {
                case 1:
                    bd.addMoney();
                    break;
                case 2:
                    bd.bottlesIn();
                    Scanner sca = new Scanner(System.in);
                    System.out.print("Your choice: ");
                    String jj = sca.nextLine();
                    int val1 = Integer.valueOf(jj);
                    bd.buyBottle(val1);
                    bd.remover(val1);
                    break;
                case 3:
                    bd.returnMoney();
                    break;
                case 4:
                    bd.bottlesIn();
                    break;
                case 0:
                    break loop;
                default:
                    System.out.println("Unknown choice.");
                    break;
            }
        }
    }

}
// eof