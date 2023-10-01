/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PF429
 */
public class MallardDuck extends Duck {
    
    public MallardDuck(){
        
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
        
    }

    @Override
    void display() {
      System.out.print("i'm a real mallar duck");
    
    }
    
    
}
