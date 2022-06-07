public class Consumer {
    public void consume(Storage storage) throws InterruptedException {
        while (true) {
            synchronized (storage.getLocked()) {
                while (storage.getWarehouseGoods().size() == 0) {
                    storage.getLocked().wait();
                }
                Product product = storage.getWarehouseGoods().poll();
                System.out.println(product + " потреблен");
                System.out.println("Количество товаров на складе: " + storage.getWarehouseGoods().size());
                storage.getLocked().notify();
            }
            Thread.sleep(1000);
        }
    }
}