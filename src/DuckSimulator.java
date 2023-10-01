
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PF429
 */
public class DuckSimulator {
    
//    public static void main(String[] args) {
//    
//        MallardDuck mallard = new MallardDuck();
//        FlyBehavior cantFly = () -> System.out.println("I can't fly");
//        QuackBehavior squeak = () -> System.out.println("Squeack");
//        RubberDuck rubberDuckie = new RubberDuck(cantFly, squeak);
//        DecoyDuck decoy = new DecoyDuck();
//        
//        Duck model = new ModelDuck();
//        
//        mallard.performQuack();
//        rubberDuckie.performQuack();
//        decoy.performQuack();
//        
//        model.performFly();
//        model.setFlyBehavior(new FlyRockedPowered());
//        model.performFly();
//    } 
//    
//    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat Datang di Duck Simulator!");
        System.out.println("Choose a duck to learn about its behavior:");
        System.out.println("1. Mallard Duck");
        System.out.println("2. Rubber Duck");
        System.out.println("3. Decoy Duck");
        System.out.println("4. Model Duck");
        System.out.print("Masukan pilihan disini (1/2/3/4): ");

        int pilihan = scanner.nextInt();

        Duck hereDuck = null;

        switch (pilihan) {
            case 1:
                hereDuck = new MallardDuck();
                break;
            case 2:
                FlyBehavior cantFly = () -> System.out.println("I can't fly");
                QuackBehavior squeak = () -> System.out.println("Squeak");
                hereDuck = new RubberDuck(cantFly, squeak);
                break;
            case 3:
                hereDuck = new DecoyDuck();
                break;
            case 4:
                hereDuck = new ModelDuck();
                break;
            default:
                System.out.println("gagal memilih. Exiting.");
                System.exit(1);
        }

        System.out.println("You selected: " + hereDuck.getClass().getSimpleName());

        // Display the selected duck's behavior
        hereDuck.performQuack();
        hereDuck.performFly();

        scanner.close();
    }
}


