/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lsearch;

import java.util.Scanner;

/**
 *
 * @author ejkpa
 */
public class LenearSearch {
    int [] arr;
    int length;
    
    public LenearSearch(int size){
        arr= new int[size];
        length=size;
    }
    
    public void InsertData(){
        Scanner Read = new Scanner(System.in);
        System.out.println("Add values to array!");
        for(int c=0;c<length;c++)
            arr[c]=Read.nextInt();
    }
    
    public int SearchFor(int key){
        for(int c=0;c<length;c++)
            if(arr[c]==key)
                return c;
            
    return -1;
    }
    
}
