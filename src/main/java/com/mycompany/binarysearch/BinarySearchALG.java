/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.binarysearch;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Nick
 * @param <T>
 */
public class BinarySearchALG<T extends Comparable<T>> {

    private T searchForMe;
    private List<T> items;

    public BinarySearchALG() {
        this.searchForMe = (T) "";
        items = new LinkedList();
    }

    public BinarySearchALG(T searchForMe) {
        this.searchForMe = searchForMe;
        items = new LinkedList();
    }
    
    public BinarySearchALG(List<T> items){
        this.items = items;
    }
    
    public void addData(T addMe){
        
    }

    public void setSearchValue(T searchForMe) {
        this.searchForMe = searchForMe;
    }

}
