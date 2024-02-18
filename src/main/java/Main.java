
public class Main {
    public static void main(String[] args) {

        Order o = new Order();
        o.date[0] = 31;
        o.date[1] = 12;
        o.date[2] = 2024;
        o.category = Category.PRODUCT;
        o.productCode = 1234567890;
        o.active = true;
        o.unitValue = 199.99f;
        o.quantity = 10;
        o.totalValue = o.unitValue * o.quantity;
        o.productName = "Iphone";

        System.out.println("----------------------");
        System.out.println("Order date: " + o.date[2] + "/" + o.date[1] + "/" + o.date[0]);
        System.out.println("Order category: " + o.category);
        System.out.println("Product name: " + o.productName);
        System.out.println("Product code: " + o.productCode);
        System.out.println("Product status:" + o.active);
        System.out.println("Product value: " + o.unitValue);
        System.out.println("Quantity: " + o.quantity);
        System.out.println("Total: " + o.totalValue);
        System.out.println("----------------------");
        System.out.println("String length: " + o.productName.length());
        System.out.println("String uppercase: " + o.productName.toUpperCase());
        System.out.println("String lowercase: " + o.productName.toLowerCase());
        System.out.println("String charAt: " + o.productName.charAt(0));
        System.out.println("String charAt: " + o.productName.charAt(1));
        System.out.println("String charAt: " + o.productName.charAt(2));
        System.out.println("String contains: " + o.productName.contains("pho"));
        System.out.println("----------------------");

    }
}
