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
abstract class Animal
{
    /*
            The modifier PROTECTED get access to the same package and outside but 
        through inheritance only;
            The modifier PRIVATE get access only within class;
            The modifier DEFAULT (without modifier) get access only within
        package;
            The modifier PUBLIC get access averywhere
    */
    protected double mass, size;
    protected String color;
    
    /**
     * This class don't is abstract because this class will be accessed but it
     * will not be changed
     */
    protected void eat()
    {
        System.out.println("I eat meat.");
    }
    /**
     * 
     */
    protected void drink()
    {
        System.out.println("I drin water.");
    }
    /**
     * These classes will be changed by the sub-classes
     */
    abstract void move();
    abstract void scream();
    
    public String toString()
    {
        String str = "I am an object from " + this.getClass() + " , I am " + 
                this.color + " , my mass is " + this.mass + " my size is " +
                this.size;
        return str;
    }
}
