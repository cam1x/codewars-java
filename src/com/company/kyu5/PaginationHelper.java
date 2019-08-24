package com.company.kyu5;

import java.util.*;

/*
    Condition: https://www.codewars.com/kata/515bb423de843ea99400000a
 */

public class PaginationHelper<I> {

    private Map<Integer,List<I>> catalog=new HashMap<Integer, List<I>>();
    private int itemsPerPage;

    /**
     * The constructor takes in an array of items and a integer indicating how many
     * items fit within a single page
     */
    public PaginationHelper(List<I> collection, int itemsPerPage) {
        int page=0;
        for (int i=0;i<collection.size();i++){
            if (!catalog.containsKey(page)) {
                catalog.put(page, new ArrayList<I>());
                catalog.get(page).add(collection.get(i));
            } else {
                if (catalog.get(page).size() > itemsPerPage-1) {
                    page++;
                    catalog.put(page, new ArrayList<I>());
                }
                catalog.get(page).add(collection.get(i));
            }
        }
        this.itemsPerPage=itemsPerPage;
    }

    /**
     * returns the number of items within the entire collection
     */
    public int itemCount() {
        int count=0;
        for (int i=0;i<pageCount();i++){
            count+=catalog.get(i).size();
        }
        return count;
    }

    /**
     * returns the number of pages
     */
    public int pageCount() {
        return catalog.keySet().size();
    }

    /**
     * returns the number of items on the current page. page_index is zero based.
     * this method should return -1 for pageIndex values that are out of range
     */
    public int pageItemCount(int pageIndex) {
        if (pageIndex>=0 && pageIndex<pageCount()){
            return catalog.get(pageIndex).size();
        }else{
            return -1;
        }
    }

    /**
     * determines what page an item is on. Zero based indexes
     * this method should return -1 for itemIndex values that are out of range
     */
    public int pageIndex(int itemIndex) {
        return (itemIndex>=0 && itemIndex<itemCount())? itemIndex/itemsPerPage : -1;
    }
}
