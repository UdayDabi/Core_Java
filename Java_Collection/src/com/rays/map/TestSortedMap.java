package com.rays.map;

import java.util.SortedMap;
import java.util.TreeMap;
// SortedMap maintain order
//
public class TestSortedMap {

    public static void main(String[] args) {

        SortedMap m = new TreeMap();

        m.put(103, "Aman");
        m.put(101, "Uday");
        m.put(105, "Karan");
        m.put(102, null);
        m.put(107, null);


        System.out.println("Map : " + m);

       System.out.println("First Key : " + m.firstKey());
//
        System.out.println("Last Key : " + m.lastKey());
//
        System.out.println("Head Map : " + m.headMap(103));
//
       System.out.println("Tail Map : " + m.tailMap(102));
//
        System.out.println("Sub Map : " + m.subMap(102, 107));
//    }

}}