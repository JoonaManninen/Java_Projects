package BankSystem;

// Joona Manninen 6.7.2022 Viikko 6 Tehtävä 4

import java.util.Scanner;

public class Mainclass {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner sc = new Scanner(System.in);
        loop: while (true) {
            System.out.println("");
            System.out.println("*** BANK SYSTEM ***");
            System.out.println("1) Add a regular account");
            System.out.println("2) Add a credit account");
            System.out.println("3) Deposit money");
            System.out.println("4) Withdraw money");
            System.out.println("5) Remove an account");
            System.out.println("6) Print account information");
            System.out.println("7) Print all accounts");
            System.out.println("0) Quit");
            Scanner in = new Scanner(System.in);
            System.out.print("Your choice: ");
            String jiis = in.nextLine();
            int val = Integer.valueOf(jiis);
            // Valikko rakenne
            switch (val) {
                case 1:
                    System.out.print("Give an account number: ");
                    String account = sc.nextLine();
                    System.out.print("Amount of money to deposit: ");
                    String kek = sc.nextLine();
                    int amount = Integer.valueOf(kek);
                    bank.AddAccount(account, amount);
                    break;
                case 2:
                    System.out.print("Give an account number: ");
                    String account1 = sc.nextLine();
                    System.out.print("Amount of money to deposit: ");
                    String kek1 = sc.nextLine();
                    int amount1 = Integer.valueOf(kek1);
                    System.out.print("Give a credit limit: ");
                    String cr = sc.nextLine();
                    int credit = Integer.valueOf(cr);
                    bank.AddCredit(account1, amount1, credit);
                    break;
                case 3:
                    System.out.print("Give an account number: ");
                    String account3 = sc.nextLine();
                    System.out.print("Amount of money to deposit: ");
                    String kek3 = sc.nextLine();
                    int amount3 = Integer.valueOf(kek3);
                    bank.AddMoney(account3, amount3);
                    break;
                case 4:
                    System.out.print("Give an account number: ");
                    String account4 = sc.nextLine();
                    System.out.print("Amount of money to withdraw: ");
                    String kek4 = sc.nextLine();
                    int withdraw = Integer.valueOf(kek4);
                    bank.Withdraw(account4, withdraw);
                    break;
                case 5:
                    System.out.print("Give the account number of the account to delete: ");
                    String account5 = sc.nextLine();
                    bank.Delete(account5);
                    break;
                case 6:
                    System.out.print("Give the account number of the account to print information from: ");
                    String account6 = sc.nextLine();
                    bank.printInformation(account6);
                    break;
                case 7:
                    bank.printAll();
                    break;
                case 0:
                    break loop;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
    }
}
