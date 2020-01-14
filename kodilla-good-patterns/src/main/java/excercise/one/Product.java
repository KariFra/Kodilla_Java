package excercise.one;

public class Product {

    String typeOfProduct;
    int amount;

    public Product(String typeOfProduct, int amount) {
        this.typeOfProduct = typeOfProduct;
        this.amount = amount;
    }

    public String getTypeOfProduct() {
        return typeOfProduct;
    }

    public int getAmount() {
        return amount;
    }
}
