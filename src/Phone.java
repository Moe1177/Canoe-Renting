import java.util.Objects;

public class Phone {

    public String companyName = "Google Pixle";
    public String model = "Google Pixel 6";
    public double price = 1500;
    public double priceWithTax; //Gov. tax (15%), Apple tax (20$), Samsung tax (15$) & screenSize / 2.5
    public double screenSize = 5; //Size in inches

    public Phone(String companyName, String model, double price, double screenSize) {
        this.companyName = companyName;
        this.model = model;
        this.price = price;
        this.screenSize = screenSize;

        phoneTax();

    }
    public static void sayHello() {
        System.out.println("Hello");
    }
    public void phoneTax()
    {
        priceWithTax += price;
        if (Objects.equals(companyName, "Apple"))
        {
            priceWithTax += 20;
        } else if (Objects.equals(companyName, "Samsung")) {
            priceWithTax += 15;
        } else {
            priceWithTax += 10;
        }
        priceWithTax += screenSize / 2.5;
        priceWithTax *= ((100.0 + 15) / 100);

        System.out.println("The price of the with tax is " + priceWithTax + "$");
    }
}
