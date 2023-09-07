public class Electronics extends Product {
    private String brand;
    private int warrantyPeriod;
    private boolean hasBattery;

    protected Electronics(String code, String name, double price, int quantity, String brand, int warrantyPeriod, boolean hasBattery) {
        super(code, name, price, quantity);
        this.brand = brand;
        this.warrantyPeriod = warrantyPeriod;
        this.hasBattery = hasBattery;
    }

    public String getBrand() {
        return brand;
    }
    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }
    public boolean getHasBattery() {
        return hasBattery;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }
    public void setHasBattery(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }

    @Override
    public double calcTotalPrice() {
        double total = price * quantity;
        total += warrantyPeriod * 250;
        if (hasBattery) {
            total += 50;
        }
        return total;
    }
}
