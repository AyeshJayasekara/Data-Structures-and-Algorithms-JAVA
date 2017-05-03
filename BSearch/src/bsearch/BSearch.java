/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bsearch;

/**
 *
 * @author ejkpa
 */
public class BSearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BinarySearch obj = new BinarySearch(10);
        obj.InsertData();
        System.out.println("Found at "+obj.SearchFor(8));
    }
    
}
