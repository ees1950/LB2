public class Product {
    private int productId;

    public Product(int productId) {
        this.productId = productId;
    }

    @Override
    public String toString() {
        return "Продукт: №" + productId;
    }
}