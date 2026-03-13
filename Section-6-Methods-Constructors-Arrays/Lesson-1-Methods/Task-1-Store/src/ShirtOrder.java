public class ShirtOrder {
    private int shirtQuantity;
    public ShirtOrder(int shirtQuantity) {
        this.shirtQuantity = shirtQuantity;
    }

    public int getShirtQuantity() {
        return shirtQuantity;
    }

    public Shirt getShirt(float price) {
        if(shirtQuantity !=0){
            shirtQuantity--;
            return new Shirt(price);
        }
        else {return null;}
    }
}
