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
public class ISort {

    int []a; 
     
    public void printArray() {        
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
 
    public void insertionSort() {
        int n = a.length;
        for (int j = 1; j < n; j++) {
            int key = a[j];
            int i = j-1;
            while ( (i > -1) && ( a [i] > key ) ) {
                a [i+1] = a [i];
                i--;
            }
            a[i+1] = key;
        }
    }

    public ISort(int size) {
        a = new int[size];
        int item = 0;
		for(int i=0;i<size;i++){
			item = (int)(Math.random()*100); 
			a[i] = item;
		}
    }
    
}

    

