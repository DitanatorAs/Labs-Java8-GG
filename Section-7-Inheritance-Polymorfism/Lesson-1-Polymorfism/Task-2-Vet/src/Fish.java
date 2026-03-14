public class Fish extends Animal implements Pet {
    private String name;

    public Fish() {
        super(0);
        this.name = "";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String n) {
        this.name = n;
    }

    @Override
    public void play() {
        System.out.println("Fish.play");
    }

    @Override
    public void eat() {
        System.out.println("Fish.eat");
    }

    @Override
    public void walk() {
        System.out.println("Fish.walk");
    }
}