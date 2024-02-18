public class Main {
    public static void main(String[] args) {
        Order o = new Order();
        o.day = 31;
        o.month = 12;
        o.year = 2024;
        o.category = 'P';
        o.productCode = 1234567890;
        o.active = true;
        o.unitValue = 199.99f;
        o.quantity = 10;
        o.totalValue = o.unitValue * o.quantity;

        System.out.println("----------------------");
        System.out.println("Order date: " + o.day + "/" + o.month + "/" + o.year);
        System.out.println("Order category: " + o.category);
        System.out.println("Product code: " + o.productCode);
        System.out.println("Product status:" + o.active);
        System.out.println("Product value: " + o.unitValue);
        System.out.println("Quantity: " + o.quantity);
        System.out.println("Total: " + o.totalValue);
        System.out.println("----------------------");
    }
}
