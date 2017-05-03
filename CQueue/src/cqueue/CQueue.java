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
public class CQueue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CircularQueue obj = new CircularQueue(5); //Pass the size of the queue as parameter
        obj.enque(1);
        obj.enque(2);
        obj.enque(3);
        obj.enque(4);
        obj.enque(5);
        System.out.println(""+obj.dequeue());
        System.out.println(""+obj.dequeue());
        System.out.println(""+obj.dequeue());
        System.out.println(""+obj.dequeue());
        System.out.println(""+obj.dequeue());
        obj.enque(6);
        obj.enque(7);
        obj.enque(8);
        System.out.println(""+obj.dequeue());
        System.out.println(""+obj.dequeue());
        System.out.println(""+obj.dequeue());
    }
    
}
