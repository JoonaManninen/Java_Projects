package BankSystem;

// Joona Manninen 6.7.2022 Lecture 6
// Account class which stores information of different accounts like credit account and regular account
public abstract class Account {

    protected String account;
    protected int amount;
    protected int credit;

    public Account() {
    }

    public Account(String ac, int am, int cr) {

        this.account = ac;
        this.amount = am;
        this.credit = cr;
    }

    public Account(String ac, int am) {

        this.account = ac;
        this.amount = am;
    }

    public String getAccount() {
        return account;
    }

    public int getAmount() {
        return amount;
    }

    public int getCredit() {
        return credit;
    }

}

class Accounts extends Account {

    public Accounts(String ac, int am) {
        super(ac, am);
    }

    public Accounts() {
    }

}

class CreditAcc extends Account {

    public CreditAcc(String ac, int am, int cr) {
        super(ac, am, cr);
    }

    public CreditAcc() {
    }
}