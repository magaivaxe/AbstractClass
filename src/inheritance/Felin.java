/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 * If the subclass is abstract. All abstract methods will not applied.
 * In this case just move is applied inherite from Animal
 * @author eleves
 */
public abstract class Felin extends Animal
{
    /**
     * 
     */
    @Override
    void move()
    {
        System.out.println("I move alone!");
    }

}
