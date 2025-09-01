public class RubberDuck extends Duck {
    public RubberDuck() {
        
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("Soy un pato de goma.");
    }
    
}
