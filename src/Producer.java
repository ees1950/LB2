public class Producer {
    private int i = 0;

    public void produce(Storage storage) throws InterruptedException {
        while (true) {
            synchronized (storage.getLocked()) {
                while (storage.getWarehouseGoods().size() == storage.getLimitOfProducts()) {
                    storage.getLocked().wait();
                }
                Product product = new Product(i);
                storage.getWarehouseGoods().offer(product);
                System.out.println("Произведен: " + product);
                i++;
                storage.getLocked().notify();
            }

        }
    }
}