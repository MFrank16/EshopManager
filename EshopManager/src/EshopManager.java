import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class EshopManager {
    private List<Product> products;

    public EshopManager() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    public void AddIphone(String name, double price, boolean avalibility, int ramSize)
    {
        Product Iphone = new Iphone(name, price, avalibility, ramSize);
        addProduct(Iphone);
    }
    public void AddIpad(String name, double price, boolean avalibility, boolean simCard)
    {
        Product Ipad = new Ipad(name, price, avalibility, simCard);
        addProduct(Ipad);
    }
    public void AddAppleWatch(String name, double price, boolean avalibility, double displaySize)
    {
        Product AppleWatch = new AppleWatch(name, price, avalibility, displaySize);
        addProduct(AppleWatch);
    }
    public void PrintPriceAndAvailabilityOfTheCheapestItem()
    {
        if(products.isEmpty()){
            System.out.println("Žiadne produkty");
            return;
        }
        Product cheapestProduct = products.get(0);
        for(int i = 0; i < products.size(); i++){
            if(products.get(i).getPrice() < cheapestProduct.getPrice()){
                cheapestProduct = products.get(i);
            }
        }
        String dostupnost = "nedostupný";
        if(cheapestProduct.isAvalible()){
            dostupnost = "dostupný";
        }
        Locale locale = Locale.GERMANY;
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
        String s = numberFormat.format(cheapestProduct.getPrice());
        System.out.println(cheapestProduct.getName() + " Cena: " + s + " Dostupnosť: " + dostupnost);
    }

    public static void main(String[] args) {
        EshopManager Eshop = new EshopManager();

        Eshop.AddIphone("Iphone 3G", 8000, false, 128);
        Eshop.AddIphone("Iphone 4S",110, true,512);
        Eshop.AddIphone("Iphone XR", 240, true, 3072);
        Eshop.AddIphone("Iphone 12 Pro Max", 620, true, 6144);

        Eshop.AddIpad("iPad mini 3", 70, true,true);
        Eshop.AddIpad("iPad (9th gen)",400, true,true);
        Eshop.AddIpad("iPad Air 2", 200, false, true);
        Eshop.AddIpad("iPad Pro (1st)", 240, true, false);

        Eshop.AddAppleWatch("Apple Watch Series 1", 7000, false, 1.65);
        Eshop.AddAppleWatch("Apple Watch Series 2",110, true,1.65);
        Eshop.AddAppleWatch("Apple Watch Series 3", 240, false, 1.65);
        Eshop.AddAppleWatch("Apple Watch Series 4", 620, true, 1.78);

        Eshop.PrintPriceAndAvailabilityOfTheCheapestItem();
    }
}
