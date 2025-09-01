public class FlyNoWay implements Duck.FlyBehavior {
    @Override
    public void fly() {
        System.out.println("No puedo volar.");
    }
}
