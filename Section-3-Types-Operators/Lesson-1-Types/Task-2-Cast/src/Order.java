public class Order {
    private final int itemQuantity;
    private final int itemPrice;

    public Order(int itemQuantity, int itemPrice) {
        this.itemQuantity = itemQuantity;
        this.itemPrice = itemPrice;
    }

    public возвращаемый_тип getValue(){
        return itemQuantity * itemPrice;
    };
}
