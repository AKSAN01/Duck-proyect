public class DuckSimulator {
    public static void main(String[] args) {
        
        Duck mallard = new MallardDuck();
        Duck rubber = new RubberDuck();
        Duck decoy = new DecoyDuck();

        // MallardDuck
        System.out.println("\n--- MallardDuck ---");
        mallard.display();
        mallard.performQuack();  
        mallard.performFly();    

        // RubberDuck
        System.out.println("\n--- RubberDuck ---");
        rubber.display();
        rubber.performQuack();   
        rubber.performFly();     

        // DecoyDuck
        System.out.println("\n--- DecoyDuck ---");
        decoy.display();
        decoy.performQuack();   
        decoy.performFly();      

        // Cambiar comportamiento en tiempo de ejecución 🚀
        System.out.println("\n--- Cambiando comportamiento de DecoyDuck ---");
        decoy.setFlyBehavior(new FlyRocketPowered()); 
        decoy.performFly(); 
    }
}
