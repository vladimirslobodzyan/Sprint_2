package model;

import model.service.ShoppingCart;

import static model.constants.Color.COLOR_GREEN;
import static model.constants.Color.COLOR_RED;

public class Main extends ShoppingCart {
    public Main(Food[] food) {
        super(food);
   }

    public static void main(String[] args) {
        Food meat = new Meat(5, 100, false);
        Food redApple = new Apple(10, 50, true, COLOR_RED);
        Food greenApple = new Apple(8, 60, true, COLOR_GREEN);

        Food[] food = {meat, redApple, greenApple};

        ShoppingCart shoppingCart = new ShoppingCart(food);

        System.out.println(ShoppingCart.sumWithoutDiscount());
        System.out.println(ShoppingCart.sumWithDiscount());
        System.out.println(ShoppingCart.sumVeganWithoutDiscount());
    }
}

