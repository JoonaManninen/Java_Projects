package BottleDispenser;

// Joona Manninen 29.1.2022 Lecture 3
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class BottleDispenser {
    private String[] names = { "Pepsi Max", "Pepsi Max", "Coca-Cola Zero", "Coca-Cola Zero", "Fanta Zero" };
    private double[] totE = { 0.5, 1.5, 0.5, 1.5, 0.5, };
    private String[] manufs = { "Pepsi", "Pepsi", "Coca-Cola", "Coca-Cola", "Coca-Cola" };
    private int bottles;
    private double money;
    private double[] prices = { 1.8, 2.2, 2.0, 2.5, 1.95 };
    ArrayList<Bottle> bot = new ArrayList<>();
    Bottle obj = new Bottle();

    public BottleDispenser() {
        bottles = 5;
        money = 0;
        // Adding bottles to bottledispenser.
        for (int i = 0; i < bottles; i++) {
            Bottle bb = new Bottle(names[i], manufs[i], totE[i], prices[i]);
            bot.add(bb);
        }
    }

    // Different functions of BottleDispenser
    public void addMoney() {
        money += 1;
        System.out.println("Klink! Added more money!");
    }

    public void buyBottle(int val1) {
        if (money < 1.8) {
            System.out.println("Add money first!");
            return;
        }
        if (bottles < 1) {
            System.out.println("No bottles left ;(");
            return;
        }
        // Removing object
        obj = bot.get(val1 - 1);
        double moneys = obj.getPrice();
        bottles -= 1;
        money -= moneys;
        String bottlename = obj.getName();
        System.out.println("KACHUNK! " + bottlename + " came out of the dispenser!");
    }

    // Returning money
    public void returnMoney() {
        BigDecimal bd = new BigDecimal(money).setScale(2, RoundingMode.HALF_UP);
        double newMoney = bd.doubleValue();
        System.out.printf("Klink klink. Money came out! You got %.2f€ back\n", newMoney);
        money = 0;
    }

    // Removing bottle object from the list
    public void remover(int val1) {
        int index = val1 - 1;
        bot.remove(index);
    }

    // Listing all bottles in the machine
    public void bottlesIn() {
        for (int h = 0; h < bot.size(); h++) {
            obj = bot.get(h);
            String nam = obj.getName();
            double ene = obj.getEnergy();
            double man = obj.getPrice();
            System.out.println((h + 1) + ". Name: " + nam);
            System.out.println("	Size: " + ene + "	Price: " + man);
        }
    }
}
// eof