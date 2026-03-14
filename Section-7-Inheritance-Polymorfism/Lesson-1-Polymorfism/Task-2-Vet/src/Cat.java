public class Cat extends Animal implements Pet {
    private String name;

    public Cat(String n) {
        super(4);
        this.name = n;
    }

    public Cat() {
        this("");
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
        System.out.println("Cat.play");
    }

    @Override
    public void eat() {
        System.out.println("Cat.eat");
    }

    @Override
    public void walk() {
        System.out.println("Cat.walk");
    }
}