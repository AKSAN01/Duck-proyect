public class DecoyDuck extends Duck {
    public DecoyDuck() {
        
        flyBehavior = new FlyNoWay();
        quackBehavior = new Mute();
    }

    @Override
    public void display() {
        System.out.println("Soy un pato de señuelo.");
    }
    
}
