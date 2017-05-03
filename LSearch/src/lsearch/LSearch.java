/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lsearch;

/**
 *
 * @author ejkpa
 */
public class LSearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        LenearSearch obj = new LenearSearch(10);
        obj.InsertData();
        int x= obj.SearchFor(3);
        if(x!=-1)
            System.out.println("Found at index "+x);
        else
            System.out.println("Item not found");
        
    }
    
}
