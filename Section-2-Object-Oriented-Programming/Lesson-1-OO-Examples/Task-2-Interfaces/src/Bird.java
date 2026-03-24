public class Bird implements Flyer {

    @Override
    public void fly(){
       System.out.println("methodFly");
    }
    @Override
    public void land(){
        System.out.println("methodLand");
    }
    @Override
    public void takeOff(){
        System.out.println("methodTakeOff");
    }

    public void eat() {
        System.out.println("bird eats");
    }

    public String getName(){
        return "just bird";
    };

}
