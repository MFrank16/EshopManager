public class Product {
    private String name;
    private double price;
    private boolean avalibility;

    public Product(String name, double price, boolean avalibility){
        this.name = name;
        this.price = price;
        this.avalibility = avalibility;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public boolean isAvalible(){
        return avalibility;                 //Iba ci je vobec availible, teda flag
    }
}

class Iphone extends Product{
    int ramSize;            //V MB

    public Iphone(String name, double price, boolean availibility, int ramSize){
        super(name, price, availibility);
        this.ramSize = ramSize;
    }

    public int getRamSize(){
        return ramSize;
    }
}

class Ipad extends Product{
    boolean simCard;

    public Ipad(String name, double price, boolean availibility, boolean simCard){
        super(name, price, availibility);
        this.simCard = simCard;
    }

    public boolean hasOptionForSimcard(){
        return simCard;                         //Ak som nespravne pochopil co sa tym mysli tak sa ospravedlnujem
    }
}

class AppleWatch extends Product{
    double displaySize;

    public AppleWatch(String name, double price, boolean availibility, double displaySize){
        super(name, price, availibility);
        this.displaySize = displaySize;
    }

    public double getDisplaySize(){
        return displaySize;
    }
}