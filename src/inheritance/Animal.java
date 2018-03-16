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
            The modifier
    */
    protected double mass, size;
    protected String color;
}
