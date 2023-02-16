package com.samsung;

import java.util.Iterator;

public class MyLinkedList<T> implements Iterable{
    private int size;
    private Node first;
    private Node last;
    public MyLinkedList(){
        size = 0;
        first = null;
        last = null;
    }
    public T get(int index){
        if(index >=0 && index < size){
            Node curNode = first;
            for(int i = 0; i < index; i++)
                curNode = curNode.next;
            return curNode.val;
        }
        else
            throw new NullPointerException("Wrong index");
    }
    public void addFirst(T o){
        if(!isEmpty()){
            Node next = first;
            first = new Node(o);
            first.next = next;
            next.prev = first;
        }
        else{
            Node newNode = new Node(o);
            first = newNode;
            last = newNode;
        }
        size++;
    }
    public void addLast(T o){
        if(!isEmpty()){
            Node prev = last;
            last = new Node(o);
            last.prev = prev;
            prev.next = last;
        }
        else{
            Node newNode = new Node(o);
            first = newNode;
            last = newNode;
        }
        size++;
    }
    public void add(T o, int pos){
        if(pos <size && pos > 0){
            Node newNode = new Node(o);
            Node curNode = first;
            for(int i = 0;i < pos - 1;i++)
                curNode = curNode.next;
            newNode.next = curNode;
            newNode.prev = curNode.prev;
            curNode.prev.next = newNode;
            curNode.prev =newNode;
            size++;
        }
        else
            throw new NullPointerException("Wrong index");
    }
    public void deleteFirst(){
        if(size == 1){
            first = null;
            last = null;
            size--;
        }
        else if(!isEmpty()){
            first = first.next;
            first.prev = null;
            size--;
        }
        else throw new NullPointerException("Empty array");

    }
    public void deleteLast(){
        if(size == 1){
            first = null;
            last = null;
            size--;
        }
        else if(!isEmpty()){
            last = last.prev;
            last.next = null;
            size--;
        }
        else throw new NullPointerException("Empty array");
    }
    public void delete(int index){
        if(size == 1){
            first = null;
            last = null;
            size--;
        }
        else if(index >= 0 && index < size){
            Node curNode = first;
            for(int i = 0; i < index; i++)
                curNode = curNode.next;
            curNode.prev.next = curNode.next;
            curNode.next.prev = curNode.prev;
        }
        else throw new NullPointerException("Wrong index");
    }
    public Boolean isEmpty(){
        return size == 0;
    }

    @Override
    public Iterator iterator() {
        return new Iter();
    }

    private class Node{
        private Node next;
        private Node prev;
        private T val;
        private Node(T val){
            this.val = val;
            next = null;
            prev = null;
        }

    }
private class Iter implements Iterator<T>{
        private Node cursor = first;
    @Override
    public boolean hasNext() {
        return cursor != null;
    }

    @Override
    public T next() {
        T value = cursor.val;
        cursor = cursor.next;
        return value;
    }
}


}
