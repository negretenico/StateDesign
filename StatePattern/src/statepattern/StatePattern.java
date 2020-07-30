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
public class StatePattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Transaction tran = new Transaction();
        OnState on = new OnState();
        on.doStuff(tran);
        System.out.println(tran.getState().toString());
        System.out.println();
        OffState off = new OffState();
        off.doStuff(tran);
        System.out.println(tran.getState().toString());
        
    }
    
}
