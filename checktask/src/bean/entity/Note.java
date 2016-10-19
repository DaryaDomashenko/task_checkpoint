package bean.entity;

/**
 * Created by Dasha on 19.10.2016.
 */
public class Note {
    private int id;
    private String name_product;
    private String category;
    private int amount;
    private double price;
    private String note;

    public Note(){}

    public int getID() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return name_product;
    }

    public void setNameProduct(String name_product) {
        this.name_product = name_product;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getNote() {
        return note;
    }
}
