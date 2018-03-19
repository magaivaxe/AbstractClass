/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 * On the abstracts classes differently from interfaces. It is possible create 
 * the abstract methods and not abstract methods. Instead Interface where all
 * methods must be abstracts to implementation
 * @author eleves
 */
public class Inheritance
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Wolf w = new Wolf("Brown", 20, 1.25);
        w.drink();
        w.eat();
        w.move();
        w.scream();
        System.out.println(w.toString());
    }
    
}
