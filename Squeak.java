public class Squeak implements Duck.QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}