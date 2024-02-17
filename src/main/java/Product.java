import java.math.BigDecimal;
import java.util.List;

public class Product {

    private String name;
    private String model;
    private String code;
    private String description;
    private Company manufacturer;
    private List<Part> parts;
    private BigDecimal tax;
    private BigDecimal grossWeight;
    private BigDecimal netWeight;
    private BigDecimal length;
    private BigDecimal width;
    private BigDecimal depth;
}
