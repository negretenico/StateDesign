/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statepattern;

/**
 *
 * @author Nico
 */
public class OnState  implements State {

    @Override
    public void doStuff(Transaction t) {
      t.setState(this);
      System.out.println("WE ARE ON");
    }
    
    public String toString()
    {
        return "On State";
    }
    
}
