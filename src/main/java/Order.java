public class Order {
    short[] date = new short[3];
    int quantity; // -2ˆ31 - (2ˆ31)-1 | 32-bit
    long productCode; // -2ˆ63 - (2ˆ63)-1 | 64-bit
    float unitValue; // 754 floating point | 32-bit
    double totalValue; // 754 floating point | 64-bit
    boolean active; // true and false | 1-bit
    char category; // Unicode's character | 16-bit

}
