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
    private Record<E> first;

    /**
     * reference to the last element.
     */
    private Record<E> last;

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
     * class to create instances in which are stored the values of the list and links to the previous and next value.
     * @param <E>
     */
    private class Record<E> {

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
            Record<E> tmp = first;
            return tmp.next != null;
        }

        @Override
        public E next() {
            this.index++;
            E value = this.tmp.item;
            this.tmp = this.tmp.next;
            return value;
        }

        @Override
        public void remove() {
        }

    }

}

