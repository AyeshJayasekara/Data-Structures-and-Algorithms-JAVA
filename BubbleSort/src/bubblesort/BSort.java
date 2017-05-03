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
public class BSort {
    int [] arr;
    int length;
    
    public BSort(int [] newarr){
        length=newarr.length;
        arr= newarr;
    }
    
    public int [] BubbleSort(){
        boolean flag;
        for(int x=0;x<length;x++){
            flag=false;
            for(int y=0;y<length-1;y++){
                if(arr[y]>arr[y+1]){
                    swap(y,y+1);
                    flag=true;
                }      
            }
            if(!flag)
               break;
        }
        return arr;
    }
    
    private void swap(int x,int y){
        int temp;
        temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    
    public void printArr(){
        for(int y=0;y<length-1;y++){
            System.out.println(arr[y]+" ");    
    }
    }
    
    
}
