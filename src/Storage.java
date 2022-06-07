import java.util.LinkedList;
import java.util.Queue;

public class Storage {
    private Queue<Product> warehouseGoods = new LinkedList();
    private int limitOfProducts;
    private final Object locked = new Object();

    public Storage(int limitOfProducts) {
        this.limitOfProducts = limitOfProducts;
    }

    public Queue<Product> getWarehouseGoods() {
        return warehouseGoods;
    }

    public int getLimitOfProducts() {
        return limitOfProducts;
    }

    public Object getLocked() {
        return locked;
    }
}