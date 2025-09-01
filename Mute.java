public class Mute implements Duck.QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
    
}
