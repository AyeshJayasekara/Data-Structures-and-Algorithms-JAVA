/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectionsort;

/**
 *
 * @author ejkpa
 */
public class SelectionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] a ={8,6,5,4,3,2,1,0,7,9};
        SSort obj = new SSort(a);
        obj.SelectionSort();
        obj.printArr();
    }
    
}
