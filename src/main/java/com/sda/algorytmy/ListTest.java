package com.sda.algorytmy;

import java.util.LinkedList;

public class ListTest {
    public static void main(String[] args) {

        MyList<Integer> list = new ListImpl<>();
        list.add(5);
        list.add(10);
        list.add(12);
        list.add(124);
        list.add(212);
        list.add(142);
        list.add(0);
        list.add(5);
        list.remove(3);

        MyList<Integer> list1 = new LinkedListImpl<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        System.out.println(list1);
        list1.printList();

    }
}
