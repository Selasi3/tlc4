package com.company;

public class TradeAbstract {
    private String ID;
    private String Symbol;
    private float quantity;
    private float price;
    //Constructor
    TradeAbstract(){}

    TradeAbstract(String ID, String symbol, float quantity, float price) {
        this.ID = ID;
        Symbol = symbol;
        this.quantity = quantity;
        this.price = price;
    }
    //Constructor without price

     TradeAbstract(String ID, String symbol, float quantity) {
        this.ID = ID;
        Symbol = symbol;
        this.quantity = quantity;
    }

    //Getters and Setters
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getSymbol() {
        return Symbol;
    }

    public void setSymbol(String symbol) {
        Symbol = symbol;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        if(price>0){
            this.price = price;
        }
        else{
            System.out.println("Price is less than 0");
        }

    }
    //toString method
    @Override
    public String toString() {
        return "Trade{" +
                "ID='" + ID + '\'' +
                ", Symbol='" + Symbol + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
       public void calcDividend(float  dividend){
        
    }
}
