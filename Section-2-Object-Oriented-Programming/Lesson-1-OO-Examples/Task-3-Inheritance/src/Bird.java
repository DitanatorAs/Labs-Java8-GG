public class Bird implements Flyer {

    @Override
    public void fly() {
        System.out.println("bird flies");
    }

    @Override
    public void land() {
        System.out.println("bird lands");
    }

    @Override
    public void takeOff() {
        System.out.println("bird takes off");
    }

    public void eat() {
        System.out.println("bird eats");
    }

    public String getName(){
        return "just bird";
    };

}
