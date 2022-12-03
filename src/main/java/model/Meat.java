package model;

import static model.constants.Discount.DIS;

public class Meat extends Food {
    private boolean isVegetarian;

    public Meat(int amount, float price, boolean isVegetarian) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = false;
    }

    public float getDiscount() {
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
