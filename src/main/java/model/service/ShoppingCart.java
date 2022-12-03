package model.service;

import model.Food;

import static model.constants.Discount.RED_APPLE_DIS;
import static model.constants.Discount.DIS;

public class ShoppingCart {
    private static Food[] food;

    public ShoppingCart(Food[] food) {
        this.food = new Food[food.length];
        for (int i = 0; i < food.length; i++) {
            this.food[i] = food[i];
        }
    }

    public static float sumWithoutDiscount() {
        float sumWithoutDiscount = 0.0F;
        for (int i = 0; i < food.length; i++) {
            sumWithoutDiscount += food[i].getPrice() * food[i].getAmount();
        }
        return sumWithoutDiscount;
    }

    public static float sumWithDiscount() {
        float sumWithDiscount = 0.0F;
        for (int i = 0; i < food.length; i++) {
            if (food[i].getDiscount() == RED_APPLE_DIS) {
                sumWithDiscount += ((food[i].getPrice() - (food[i].getPrice() * RED_APPLE_DIS / 100)) * food[i].getAmount());
            } else {
                sumWithDiscount += ((food[i].getPrice() - (food[i].getPrice() * DIS / 100)) * food[i].getAmount());
            }
        }
        return sumWithDiscount;
    }

    public static float sumVeganWithoutDiscount() {
        float sumVeganWithoutDiscount = 0.0F;
        for (int i = 0; i < food.length; i++) {
            if (food[i].getVegetarian() == true) {
                sumVeganWithoutDiscount += (food[i].getPrice()  * food[i].getAmount());
            }
        }
            return sumVeganWithoutDiscount;
    }
}

