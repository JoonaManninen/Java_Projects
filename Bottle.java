package BottleDispenser;

// Joona Manninen 29.1.2022 Lecture 3

// Bottle class where information about bottles are stored.
public class Bottle {
    private String name;
    private String manufacturer;
    private double total_energy;
    private double price;

    public Bottle(String name1, String manuf, double totE, double price1) {
        this.name = name1;
        this.manufacturer = manuf;
        this.total_energy = totE;
        this.price = price1;
    }

    public Bottle() {
    }

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getEnergy() {
        return total_energy;
    }

    public double getPrice() {
        return price;
    }
}
// eof