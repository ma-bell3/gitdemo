package at.fhtw.slm.consoleapp;

public class Order {
    private int id;
    private String description;
    private int amount;
    private float price;

    public Order(int id, String description, int amount, float price) {
        this.id = id;
        this.description = description;
        this.amount = amount;
        this.price = price;
    }

    
}
