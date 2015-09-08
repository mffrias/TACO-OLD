package ar.edu.itba.alu.crpereyr.impl.avltree1;

import java.util.Collection;
import java.util.Iterator;

/**
 * Created by cris on 7/20/14.
 */
public class CustomList  {

    Object[] store;
    int size;
    int maxSize = 64;

    public CustomList() {
        store = new Object[maxSize];
        size = 0;
    }
    public void addFirst(Object e) {
        shiftAllValuesRight();
        store[0] = e;
        size++;
    }

    public void addLast(Object e) {
        store[size - 1] = e;
        size++;
    }
    public boolean offerFirst(Object e) {
        addFirst(e);
        return true;
    }


    public boolean offerLast(Object e) {
        addLast(e);
        return true;
    }


    public Object removeFirst() {
        Object obj = store[0];
        shiftAllValuesLeft();
        size--;
        return obj;
    }


    public Object removeLast() {
        Object obj = store[size - 1];
        size--;
        return obj;
    }


    public Object pollFirst() {
        return removeFirst();
    }


    public Object pollLast() {
        return removeLast();
    }


    public Object getFirst() {
        return store[0];
    }


    public Object getLast() {
        return store[size - 1];
    }


    public Object peekFirst() {
        return getFirst();
    }


    public Object peekLast() {
        return getLast();
    }


    public boolean removeFirstOccurrence(Object o) {
        return false;
    }


    public boolean removeLastOccurrence(Object o) {
        return false;
    }


    public boolean add(Object e) {
        return false;
    }


    public boolean offer(Object e) {
        return false;
    }


    public Object remove() {
        return null;
    }


    public Object poll() {
        return null;
    }


    public Object element() {
        return null;
    }


    public Object peek() {
        return getFirst();
    }


    public void push(Object e) {
        addLast(e);
    }


    public Object pop() {
        return removeFirst();
    }


    public boolean remove(Object o) {
        return false;
    }

    public boolean containsAll(Collection c) {
        return false;
    }


    public boolean addAll(Collection c) {
        return false;
    }

    public boolean retainAll(Collection c) {
        return false;
    }

    public boolean removeAll(Collection c) {
        return false;
    }

    public void clear() {

    }


    public boolean contains(Object o) {
        return false;
    }


    public int size() {
        return size;
    }


    public boolean isEmpty() {
        return size == 0;
    }


    public Iterator iterator() {
        return null;
    }


    public Object[] toArray() {
        return new Object[0];
    }


    public Object[] toArray(Object[] a) {
        return null;
    }


    public Iterator descendingIterator() {
        return null;
    }

    private void shiftAllValuesRight() {
        for(int i = 0; i < size - 1; i++) {
            store[i+1] = store[i];
        }
        return;
    }

    private void shiftAllValuesLeft() {
        for(int i = 0; i < size - 1; i++) {
            store[i] = store[i+1];
        }
        return;
    }
}
