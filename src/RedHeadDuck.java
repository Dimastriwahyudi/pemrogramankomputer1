/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PF429
 */
public class RedHeadDuck extends Duck {
    
    public RedHeadDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
        
    }

    @Override
    void display() {
        System.out.println("i'm real red headed duck");
    }
    
}
