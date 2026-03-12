public class Order {
    private final int itemQuantity;
    private final int itemPrice;

    public Order(int itemQuantity, int itemPrice) {
        this.itemQuantity = itemQuantity;
        this.itemPrice = itemPrice;
    }

    public long getValue(){
        return (long)itemQuantity * (long)itemPrice;
    };
}
