package adts;

import interfaces.ListInterface;
import iterators.DoublyLinkedIterator;
import nodes.DLLNode;

import java.util.Iterator;

public class DoublyLinkedSortedList<E> implements ListInterface<E>, Iterable<E>{
    private DLLNode<E> head;  // Head of the doubly linked list
    private DLLNode<E> tail;  // Tail of the doubly linked list
    private int size;         // Number of elements in the list
    private boolean found;    // Flag to check if element was found
    private DLLNode<E> location;  // Node where the element was found

    @Override
    public void add(E element) {
        //code goes here
    }

    @Override
    public boolean remove(E element) {
        //code goes here
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(E element) {
        //code goes here
        return false;
    }

    @Override
    public E get(E element) {
        //code goes here
        return null;
    }

    @Override
    public E get(int index) {
        //code goes here
        return null;
    }

     public String arraytoString(int[] list) {
    return Arrays.toString(list);
}
    }    

    protected void find(E target) {
        //code goes here
    }    

    public void setIterationType(/*Need arguement*/) {
        //code goes here
    }

    @Override
    public Iterator<E> iterator() {
        return new DoublyLinkedIterator<>(head, tail, iterationType);
    }

}
