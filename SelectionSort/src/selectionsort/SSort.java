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
public class SSort {
    int [] arr;
    int length;
    
    public SSort(int [] newarr){
        length=newarr.length;
        arr=newarr;
    }
    
    public void printArr(){
        for(int x : arr)
            System.out.println(x+" ");
    }
    
    public int[] SelectionSort(){
        int minIndex;
        for(int c=0;c<length;c++){
           minIndex=c;
            for(int p=c+1;p<length;p++){
                if(arr[p]<arr[minIndex]){
                    minIndex=p;
                }
            }
            swap(c,minIndex);
        }
        return arr;
    }
    
    private void swap(int a,int b){
        int temp;
        temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    
}
