package com.sda.algorytmy;

public class LinkedListImpl<E> implements MyList<E> {

    private Node head;
    private int size = 0;

    public LinkedListImpl() {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean add(E e) {
        if (size == 0) {
            head = new Node(e);
            size++;
        } else {
            Node tmp = head;
            head = new Node(e);
            head.next = tmp;
            size++;
        }
        return true;
    }

    public void printList() {
        Node tmp = head;
        while (tmp != null){
            System.out.println(tmp.date);
            tmp = tmp.next;
        }
    }

    @Override
    public String toString() {
        return "LinkedListImpl{" +
                "head=" + head +
                ", size=" + size +
                '}';
    }

    @Override
    public boolean remove(int index) {
        return false;
    }

    class Node {

        private Node next;
        private Object date;

        public Node(Object date) {
            this.date = date;
        }

        public Object getDate() {
            return date;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "next=" + next +
                    ", date=" + date +
                    '}';
        }
    }
}