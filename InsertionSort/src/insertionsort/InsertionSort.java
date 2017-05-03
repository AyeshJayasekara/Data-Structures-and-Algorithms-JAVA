/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertionsort;

/**
 *
 * @author ejkpa
 */
public class InsertionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ISort obj = new ISort(10);
        obj.printArray();
        obj.insertionSort();
        System.out.println("");
        obj.printArray();
    }
    
}
