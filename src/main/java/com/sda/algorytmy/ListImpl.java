package com.sda.algorytmy;

import java.util.Arrays;

public class ListImpl<E> implements MyList<E> {


    private int size = 0;
    private int DEFAULT_CAPACITY = 3;
    private Object elementData[];

    public ListImpl() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public void ensureCapacity() {
        DEFAULT_CAPACITY = DEFAULT_CAPACITY * 2;
        elementData = Arrays.copyOf(elementData, DEFAULT_CAPACITY);
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean add(E e) {

        if (size == DEFAULT_CAPACITY) {
            ensureCapacity();
        }
        elementData[size++] = e;
        return true;
    }

    @Override
    public boolean remove(int index) {

        for (int i = index; i < elementData.length - 1; i++) { //wersja bez przesuwania, zastepujemy index ktory chcemy
            elementData[i] = elementData[i + 1];                   //usunac nastepnym w kolejnosci, a na koncu wstawiamuy null.
        }
        elementData[elementData.length - 1] = null;
        return true;
    }

    @Override
    public void printList() {

    }


}
