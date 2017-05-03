/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lenearqueue;

/**
 *
 * @author ejkpa
 */
public class LenearQueue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LQueue obj = new LQueue(10);
        obj.enQueue(6);
        obj.enQueue(7);
        obj.enQueue(8);
        obj.enQueue(9);
        System.out.println(""+obj.deQueue());
        
    }
    
}
