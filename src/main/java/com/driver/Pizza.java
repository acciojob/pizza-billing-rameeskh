package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int extraCheesePrice;
    private boolean isCheeseAdded;
    private int extraToppingsPrice;
    private boolean isExtraToppingAdded;

    private int takeAwayPrice;
    private boolean isTakeAwayAdded;

    private  boolean isBillGenerated;



    public Pizza(Boolean isVeg){

        this.isVeg = isVeg;

        isCheeseAdded=false;
        this.extraCheesePrice=80;
        this.takeAwayPrice=20;
        isExtraToppingAdded=false;


        this.isTakeAwayAdded=false;
        this.takeAwayPrice=20;

        if(isVeg==true){
            this.price=300;
            this.extraToppingsPrice=70;

        }
        else {
            this.price=400;
            this.extraToppingsPrice=120;
        }

        this.bill="Base Price Of the Pizza : "+this.price+"\n";

    }

    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here

        if(isCheeseAdded==false){
            this.price=this.price+this.extraCheesePrice;
            isCheeseAdded=true;

        }

    }

    public void addExtraToppings(){
        // your code goes here
        if(isExtraToppingAdded==false){
            this.price=this.price+this.extraToppingsPrice;
            isExtraToppingAdded=true;

        }
    }

    public void addTakeaway(){
        // your code goes here
        if(isTakeAwayAdded==false){

            this.price=this.price+this.takeAwayPrice;
            this.isTakeAwayAdded=true;

        }
    }

    public String getBill(){
        // your code goes here

        if(isBillGenerated==false){
            isBillGenerated=true;

            if (isCheeseAdded == true) {
                this.bill = this.bill + "Extra Cheese Added: " + this.extraCheesePrice + "\n";
            }
            if (isExtraToppingAdded == true) {
                this.bill = this.bill + "Extra Toppings Added: " + this.extraToppingsPrice + "\n";
            }
            if (isTakeAwayAdded == true) {
                this.bill = this.bill + "Paperbag Added: " + this.takeAwayPrice + "\n";
            }
            this.bill = this.bill + "Total Price: "+this.price + "\n";
        }

        return this.bill;
    }
}
