package by.kursy.vikvik.javalessons.lesson18.ooptask.model.entity;

public class Flower {
    private String name;
    private String color;
    private double price;
    private double weight;
    private int length;

    // default constructor
    public Flower() {
        name = "no name";
        color = "no color";
        price = 0;
        weight = 0;
        length = 0;
    }

    // constructor with params #1
    public Flower(String name, String color, double price, double weight, int length) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.weight = weight;
        this.length = length;
    }

    // constructor with params #2
    public Flower(String name) {
        this(); // call default constructor
        this.name = name;
    }

    // copy-constructor
    public Flower(Flower flower) {
        this(flower.name, flower.color, flower.price, flower.weight, flower.length);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight > 0) {
            this.weight = weight;
        }
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length > 0) {
            this.length = length;
        }
    }

    public String toString() {
        return name + ": color = " + color + ", price = " + price
                + ", weight = " + weight + ", length = " + length;
    }
}