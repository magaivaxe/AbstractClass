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
public class Cat extends Felin
{
    public Cat()
    {
    }
    Cat(String color, double mass, double size)
    {
        this.color = color;
        this.mass = mass;
        this.size = size;
    }

    @Override
    void scream()
    {
        System.out.println("I mew on the roof");
    }
    
}
