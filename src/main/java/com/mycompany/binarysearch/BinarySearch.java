package com.mycompany.binarysearch;

/**
 *
 * @author Nick
 */
public class BinarySearch {

    public static void main(String[] args) {
     
        BinarySearchALG<String> b = new BinarySearchALG<>();
        b.addData("Nick");
        b.addData("Mike");
        b.addData("Kris");
        b.addData("Anna");
        b.addData("Rylee");
        b.addData("Adam");
        
        b.sort();
        
        b.setSearchValue("Nick");
        System.out.println(b.RecursiveBinarySearch(0, 5));
        
        
        
    }
}
