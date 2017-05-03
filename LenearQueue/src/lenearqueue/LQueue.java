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
public class LQueue {
    int [] arr;
    int front=0,rear=0,count=0,limit;
    
    public LQueue(int x){
     arr= new int[x];
    }
    
    public boolean isEmpty(){
        if(count==0)
            return true;
        
        return false;
    }
    public void enQueue(int val){
        limit=arr.length;
        if(rear<limit){
            count++;
            arr[rear]=val;
            rear++;
        }else
            System.out.println("Queue is Full");
    }
    
    public int deQueue(){
        if(count>0){
            front++;
            count--;
            return arr[front-1];
        }else
            System.out.println("Queue is Empty");
        return -1;
    }
}
    
    

