public abstract class Animal {
    protected int legs;

    public Animal(int legs) {
        this.legs = legs;
    }

    public abstract void walk();
    public abstract void eat();
}
