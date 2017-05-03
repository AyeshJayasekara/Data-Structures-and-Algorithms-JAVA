/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bsearch;

import java.util.Scanner;

/**
 *
 * @author ejkpa
 */
public class BinarySearch {
    int arr[],length;
    
    public BinarySearch(int size){
        arr= new int[size];
        length =size;
    }
    
    public void InsertData(){
        Scanner Read = new Scanner(System.in);
        for(int c=0;c<length;c++){
            System.out.println("Insert value for index "+c);
            arr[c]= Read.nextInt();
        }
    }
    
    public int SearchFor(int key){
        int l=0,r,mid,index=-1;
        r=length-1;
        
        while(l<=r){
            mid=(l+r)/2;
            if(arr[mid]==key){
                index=mid;
                break;
            }else if(arr[mid]<key){
                l=mid+1;
            }else{
                r=mid-1;
            }     
        }
        return index;
    }
    

    
}
