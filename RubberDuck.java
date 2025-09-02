public class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehavior = new FlyNoWay();   // minúscula
        quackBehavior = new Squeak();  // minúscula
    }

    @Override
    public void display() {
        System.out.println("Soy un pato de goma.");
    }
}

