public class Pizza {
    private int price;
    private Boolean veg;

    private int extraChieesePrice=100;
    private int extraToppingsPrice=150;
    private int backPackPrice=20;

    private int basePizzaPrice;

    private boolean isExtraCheeseAdded=false;
    private boolean isExtraToppingsAdded=false;
    private boolean isOptedForTakeAway=false;



    // constructor
    public Pizza(Boolean veg){
        this.veg=veg;
        if(this.veg){
            this.price=300;
        }
        else{
            this.price=400;
        }
        basePizzaPrice=this.price;
    }


    public void addExtraCheese(){
        isExtraCheeseAdded=true;
        System.out.println("Extra cheese added");
        this.price+=extraChieesePrice;

    }

     public void addExtraToppings(){
        isExtraToppingsAdded=true;
        System.out.println("Extra toppings added");
        this.price+=extraToppingsPrice;



    }

     public void takeAway(){
        isOptedForTakeAway=true;
        System.out.println("Take away opted");
        this.price+=backPackPrice;


    }

     public void getBill(){
        String bill="";
        System.out.println("Pizza: "+basePizzaPrice);
        if(isExtraCheeseAdded){
            bill+= "Extra Cheese Added: "+ extraChieesePrice+"\n";
        }
        if(isExtraToppingsAdded){
            bill+= "Extra Toppings Added: "+ extraToppingsPrice+"\n";
        }
        if(isOptedForTakeAway){
            bill+= "Extra Take Away Added: "+backPackPrice +"\n";
        }
        bill+="Bill: "+this.price+ "\n";
        System.out.println(bill);

    }

}

     