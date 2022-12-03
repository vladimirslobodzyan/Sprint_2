package model;

import static model.constants.Color.COLOR_RED;
import static model.constants.Discount.DIS;
import static model.constants.Discount.RED_APPLE_DIS;

public class Apple extends Food {
    private String colour;
    private boolean isVegetarian;

    public Apple(int amount, float price, boolean isVegetarian, String color) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = true;
        this.colour = color;
    }

    public float getDiscount() {
        if (this.colour == COLOR_RED) {
            return RED_APPLE_DIS;
        }
        return DIS;
    }

    public float getPrice() {
        return price;
    }

    public float getAmount() {
        return amount;
    }

    public boolean getVegetarian () {
        return isVegetarian;
    }
}


