package model;

public abstract class Food implements Discountable  {
    protected int amount;
    protected float price;

    public abstract float getPrice() ;

    public abstract float getAmount();

    public abstract boolean getVegetarian();
}
