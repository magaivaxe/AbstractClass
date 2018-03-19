/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author eleves
 */
public class Dog extends Canin
{
    /**
     * Constructor with modifier default. It accessed by the same package
     * This is the first constructor
     */
    Dog()
    {
        
    }
    /**
     * Second constructor
     */
    Dog(String color, double mass, double size)
    {
        this.color = color;
        this.mass = mass;
        this.size = size;
    }
    
    /**
     * 
     */
    @Override
    void scream()
    {
        System.out.println("I bark without reason!");
    }
    
}
