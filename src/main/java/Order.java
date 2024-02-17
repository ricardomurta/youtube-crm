public class Order {
    byte day, month; // -128 - 127 | 8-bit
    short year; // -32,768 - 32,767 | 16-bit
    int quantity; // -2ˆ31 - (2ˆ31)-1 | 32-bit
    long productCode; // -2ˆ63 - (2ˆ63)-1 | 64-bit
    float unitValue; // 754 floating point | 32-bit
    double totalValue; // 754 floating point | 64-bit
    boolean active; // true and false | 1-bit
    char category; // Unicode's character | 16-bit
    String productName;

    void transformProductNameToUppercase() {
        System.out.println(productName.toUpperCase());
    }

    void transformProductNameToLowercase() {
        System.out.println(productName.toLowerCase());
    }

    void isProductNameBlank() {
        System.out.println(productName.isBlank());
    }

    void isProductNameEmpty() {
        System.out.println(productName.isEmpty());
    }
}
