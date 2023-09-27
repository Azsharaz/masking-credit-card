package pratik.ProjectWarehouse;

public class Fields {


    private String productName;

    private String brand;

    private int stockAmount;

    private String shelf;

    private String unit; // sack, can, box, bottle etc


    public Fields(String productName, String brand, int stockAmount, String shelf, String unit) {
        this.productName = productName;
        this.brand = brand;
        this.stockAmount = stockAmount;
        this.shelf = shelf;
        this.unit = unit;
    }


    public Fields() {
    }


    public String getProductName() {
        return productName.toLowerCase();
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getBrand() {
        return brand.toLowerCase();
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getShelf() {
        return shelf;
    }

    public void setShelf(String shelf) {
        this.shelf = shelf;
    }

    public String getUnit() {
        return unit.toLowerCase();
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }


    @Override
    public String toString() {
        return "Fields{" +
                ", productName='" + productName + '\'' +
                ", brand='" + brand + '\'' +
                ", stockAmount=" + stockAmount +
                ", shelf='" + shelf + '\'' +
                ", unit='" + unit + '\'' +
                '}';
    }
}

