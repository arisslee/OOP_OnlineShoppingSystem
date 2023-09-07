public class Clothing extends Product {
    private String size;
    private String colour;
    private String fabricType;

    protected Clothing(String code, String name, double price, int quantity, String size, String colour, String fabricType) {
        super(code, name, price, quantity);
        this.size = size;
        this.colour = colour;
        this.fabricType = fabricType;
    }

    public String getSize() {
        return size;
    }
    public String getColour() {
        return colour;
    }
    public String getFabricType() {
        return fabricType;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    public void setFabricType(String fabricType) {
        this.fabricType = fabricType;
    }

    @Override
    public double calcTotalPrice() {
        double total = price * quantity;
        if ("custom".equals(size)) {
            total += 50;
        }
        if ("silk".equals(fabricType)) {
            total += 100;
        } else if ("lace".equals(fabricType)) {
            total += 150;
        }
        return total;
    }
}
