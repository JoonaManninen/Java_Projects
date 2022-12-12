package BankSystem;

// Joona Manninen 6.7.2022 Lecture 6
// Bank class which has methods to alter account information.
import java.util.ArrayList;

public class Bank {

    // Normal account objects
    ArrayList<Account> acc = new ArrayList<>();
    Account acs = new Accounts();
    // Credit account objects
    ArrayList<Account> acccred = new ArrayList<>();
    Account cred = new CreditAcc();

    public Bank() {
    }

    // Adding new regular account to the system
    public void AddAccount(String account, int amount) {
        Accounts obj = new Accounts(account, amount);
        acc.add(obj);
        System.out.printf("Account created.\n");
    }

    // Adding credit account to the system
    public void AddCredit(String account, int amount, int credit) {
        CreditAcc obj2 = new CreditAcc(account, amount, credit);
        acccred.add(obj2);
        System.out.printf("Account created.\n");
    }

    // Adding money to account already in the system
    public void AddMoney(String account, int depo) {
        for (int i = 0; i < acc.size(); i++) {
            acs = acc.get(i);
            String number = acs.getAccount();
            int amount = acs.getAmount();
            if (account.equals(number) == true) {
                int num = amount + depo;
                Accounts obj = new Accounts(account, num);
                acc.set(i, obj);
                break;
            } else {
                continue;
            }
        }
        for (int i = 0; i < acccred.size(); i++) {
            cred = acccred.get(i);
            String number1 = cred.getAccount();
            int amount1 = cred.getAmount();
            int credit = cred.getCredit();
            if (account.equals(number1) == true) {
                int num = amount1 + depo;
                CreditAcc obj2 = new CreditAcc(account, num, credit);
                acccred.set(i, obj2);
                break;
            } else {
                continue;
            }
        }
    }

    // Withdrawing from accounts
    public void Withdraw(String account, int withdraw) {
        for (int i = 0; i < acc.size(); i++) {
            acs = acc.get(i);
            String number = acs.getAccount();
            int amount = acs.getAmount();
            if (account.equals(number) == true) {
                int num = amount - withdraw;
                Accounts obj = new Accounts(account, num);
                acc.set(i, obj);
                break;
            } else {
                continue;
            }
        }
        for (int i = 0; i < acccred.size(); i++) {
            cred = acccred.get(i);
            String number1 = cred.getAccount();
            int amount1 = cred.getAmount();
            int credit = cred.getCredit();
            if (account.equals(number1) == true) {
                int num = amount1 - withdraw;
                CreditAcc obj2 = new CreditAcc(account, num, credit);
                acccred.set(i, obj2);
                break;
            } else {
                continue;
            }
        }
    }

    // Deleting account information from the system
    public void Delete(String account) {
        for (int i = 0; i < acc.size(); i++) {
            acs = acc.get(i);
            String number = acs.getAccount();
            if (account.equals(number) == true) {
                acc.remove(i);
                System.out.printf("Account removed.\n");
                break;
            } else {
                continue;
            }
        }
    }

    // Printing account information
    public void printInformation(String account) {
        for (int i = 0; i < acc.size(); i++) {
            acs = acc.get(i);
            String number = acs.getAccount();
            int amount = acs.getAmount();
            if (account.equals(number) == true) {
                System.out.println("Account number: " + account + " Amount of money " + amount + "");
                break;
            } else {
                continue;
            }
        }
        for (int i = 0; i < acccred.size(); i++) {
            cred = acccred.get(i);
            String number1 = cred.getAccount();
            int amount2 = cred.getAmount();
            if (account.equals(number1) == true) {
                System.out.println("Account number: " + account + " Amount of money " + amount2 + "");
                break;
            } else {
                continue;
            }
        }
    }

    // Printing all the accounts in the system.
    public void printAll() {
        System.out.println("All accounts:");
        // Regular accounts
        for (int i = 0; i < acc.size(); i++) {
            acs = acc.get(i);
            String number = acs.getAccount();
            int amount = acs.getAmount();
            System.out.println("Account number: " + number + " Amount of money: " + amount + "");
        }
        // Credit accounts
        for (int i = 0; i < acccred.size(); i++) {
            cred = acccred.get(i);
            String number = cred.getAccount();
            int amount = cred.getAmount();
            int credit = cred.getCredit();
            System.out.println(
                    "Account number: " + number + " Amount of money: " + amount + " Credit limit: " + credit + "");
        }
    }
}