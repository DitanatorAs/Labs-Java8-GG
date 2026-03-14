public class Spider extends Animal {
    private String name;

    public Spider() {
        super(8);
    }

    @Override
    public void eat() {
        System.out.println("Spider.eat");
    }

    @Override
    public void walk() {
        System.out.println("Spider.walk");
    }
}