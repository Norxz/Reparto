package methods;

import java.util.*;

public class List<Item> implements Iterable<Item> {

    private Node first;
    private Node last;
    private int count;

    private class Node {

        Item item;
        Node next;
        Node prev;
    }

    public List() {
        first = null;
        last = null;
        count = 0;
    }

    public void add(Item item) {
        Node newNode = new Node();
        newNode.item = item;
        if (isEmpty()) {
            newNode.next = newNode;
            newNode.prev = newNode;
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            newNode.prev = last;
            newNode.next = first;
            first.prev = newNode;
            last = newNode;
        }
        count++;
    }

    public Item remove(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        Node current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        Item item = current.item;
        if (current == first) {
            first = current.next;
        } else if (current == last) {
            last = current.prev;
        }
        current.prev.next = current.next;
        current.next.prev = current.prev;
        count--;
        return item;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return count;
    }

    @Override
    public Iterator<Item> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<Item> {

        private Node current = first;
        private int index = 0;

        public boolean hasNext() {
            return index < count;
        }

        public Item next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Item item = current.item;
            current = current.next;
            index++;
            return item;
        }
    }
}
