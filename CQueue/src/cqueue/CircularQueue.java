/* 
 * Copyright (C) 2017 Ayesh Jayasekara
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package cqueue;

/**
 *
 * @author AyeshJayasekara
 */
public class CircularQueue {
    private int SIZE,DATA[],HEAD,TAIL;
    
    public int dequeue(){
        if(this.isEmpty()){
            System.out.println("Queue is Empty!");
            return -99999;
        }
        else
            return DATA[HEAD = this.increment(HEAD)];
    }
    
    public boolean enque(int i){
        if(this.isFull()){
            System.out.println("Queue is FULL!");
            return false;
        }  
        else{
            DATA[TAIL = this.increment(TAIL)]=i;
            return true;
        }        
    }
    private boolean isFull(){
        return this.increment(TAIL)==HEAD;
    }
    private boolean isEmpty(){
        return HEAD==TAIL;
    }
    private int increment(int val){
        if(++val==SIZE)
            return 0;
        else 
            return val;
    }
    public CircularQueue(int SIZE) {
        this.SIZE = SIZE;
        this.HEAD=this.TAIL=-1;
        this.DATA = new int[this.SIZE];
    }
}
