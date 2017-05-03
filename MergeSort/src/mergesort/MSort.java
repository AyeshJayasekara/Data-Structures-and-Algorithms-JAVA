/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergesort;

/**
 *
 * @author ejkpa
 */
public class MSort {
    
    public static void main(String[] args) {
        MergeSort obj = new MergeSort(10);
        obj.printArray();
        obj.sort();
        System.out.println("");
        obj.printArray();
    }
    
}
