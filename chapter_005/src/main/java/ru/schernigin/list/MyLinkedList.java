package ru.schernigin.list;

import java.util.Iterator;


/**
 * class MyLinkedList.
 * @author schernigin.
 * @since 09.02.2017
 * @version 1.0
 */
public class MyLinkedList<E> implements SimpleContainer<E> {

    /**
     * reference to the first element.
     */
    protected Record<E> first;

    /**
     * reference to the last element.
     */
    protected Record<E> last;

    /**
     * the value of the length of the list.
     */
    private int size = 0;

    /**
     * adds value to the list.
     * @param value in list.
     */
    @Override
    public void add(E value) {
        if (isEmpty(this.first)) {
            this.first = new Record<E>(value, null, null);
        } else if (isEmpty(this.last)) {
            this.last = new Record<E>(value, this.first, null);
            this.first.next = this.last;
        } else {
            this.last.next = new Record<E>(value, this.last, null);
            this.last = this.last.next;
        }
        this.size++;
    }

    /**
     * returns a value from a list.
     * @param index value.
     * @return element list.
     */
    @Override
    public E get(int index) {
        Record<E> element = this.first;
        for (int i = 0; i != index; i++){
            element = element.next;
        }
        return element.item;
    }

    /**
     * delete element.
     * @param index list.
     */
    public void remove(int index) {
        Record<E> current = first;
        int counter = 0;
        while (!isEmpty(counter)) {
            if (counter == index) {
                Record<E> next = current.next;
                Record<E> prev = current.previous;
                if (next == null && prev == null) {
                    current.item = null;
                    next = null;
                    prev = null;
                } else if (next == null) {
                    last.item = null;
                    prev.next = null;
                    last = prev;
                } else if (prev == null) {
                    first.item = null;
                    next.previous = null;
                    first = next;
                } else {
                    current.item = null;
                    prev.next = next;
                    next.previous = prev;
                }
                break;
            }
            current = current.next;
            counter++;
        }
        this.size--;
    }

    /**
     * @param first reference to first value in list.
     * @return true if looped.
     */
    boolean hasCycle(Record<E> first) {
        boolean result = false;
        for (int i = 0; i <= this.size; i++) {
            if (first.next == first.next.next){
                result = true;
                break;
            }
        }
        return result;
    }


    /**
     * @return iterator;
     */
    @Override
    public Iterator<E> iterator() {
        return new MyIterator();
    }

    /**
     * @return true if first no null.
     */
    public boolean isEmpty(Object o) {
        return o == null;
    }

    /**
     * @return size;
     */
    public int getSize() {
        return this.size;
    }

    /**
     * class to create instances in which are stored the values of the list and links to the previous and next value.
     * @param <E>
     */
    protected class Record<E> {

        /**
         * value to element.
         */
        private E item;
        /**
         * reference for next element.
         */
        private Record<E> next;
        /**
         * reference for previous element.
         */
        private Record<E> previous;

        /**
         * constructor.
         * @param element list.
         * @param next for next.
         * @param previous for previous.
         */
        public Record(E element, Record<E> previous, Record<E> next ) {

            this.item = element;
            this.previous = previous;
            this.next = next;
        }
    }

    private class MyIterator implements Iterator<E> {

        private int index;

        private Record<E> tmp = first;

        @Override
        public boolean hasNext() {
            return this.tmp != null;
        }

        @Override
        public E next() {
            E value = this.tmp.item;
            this.tmp = this.tmp.next;
            this.index++;
            return value;
        }

        @Override
        public void remove() {



        }

    }

}

