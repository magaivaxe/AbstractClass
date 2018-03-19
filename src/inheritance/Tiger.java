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
public class Tiger extends Felin
{
    public Tiger()
    {
    }
    Tiger(String color, double mass, double size)
    {
        this.color = color;
        this.mass = mass;
        this.size = size;
    }
    
    
    @Override
    void scream()
    {
        System.out.println("I grunt hardly!");
    }
    
}
