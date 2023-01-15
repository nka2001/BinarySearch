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

    public BinarySearchALG(List<T> items) {
        this.items = items;
    }

    public void addData(T addMe) {
        items.add(addMe);
    }

    public void sort() {
        int n = items.size();//n is the total number of elements 

        for (int i = 0; i < n - 1; i++) {//start at the list and move through the list

            int minIndex = i;//set the minimum index (smallest in the list) to whatever i is 

            for (int j = i + 1; j < n; j++) {//now loop through again, to find the absolute smallest in the list
                if (items.get(j).compareTo(items.get(minIndex)) < 0) {//if the data at index j is smaller than the minIndex then set j to the minIndex
                    minIndex = j;
                }
            }

            //now swap 
            T temp = items.get(minIndex);//set a temp
            items.set(minIndex, items.get(i));//swap minIndex with i
            items.set(i, temp);//then set i with temp
        }
    }

    public void setSearchValue(T searchForMe) {
        this.searchForMe = searchForMe;
    }

    public int RecursiveBinarySearch(int low, int high) {

        if (high >= low) {
            int mid = low + (high - low) / 2;

            if (items.get(mid).compareTo(searchForMe) == 0) {
                return mid;
            }

            if (items.get(mid).compareTo(searchForMe) > 0) {
                return RecursiveBinarySearch(low, mid - 1);
            }

            return RecursiveBinarySearch(mid + 1, high);

        }
        return -1;
    }

}


