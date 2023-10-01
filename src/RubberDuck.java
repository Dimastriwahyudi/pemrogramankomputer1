/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PF429
 */
public class RubberDuck extends Duck {
    
    public RubberDuck(){
        flyBehavior = new FlyNoWays();
        //quackBehavior = new Squek();
        quackBehavior = () -> System.out.println("Squeak");
        
    }
    public RubberDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior){
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    @Override
    void display() {
        System.out.println("i'm a rubber duck");
    }
    
}
