/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesort;

/**
 *
 * @author ejkpa
 */
public class BubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr={0,7,4,3,8,9,1,5,2,6};
        BSort obj =new BSort(arr);
        arr=obj.BubbleSort();
        obj.printArr();
    }
    
}
