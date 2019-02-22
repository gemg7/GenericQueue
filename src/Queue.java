// Eric Anthon
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Queue<E> {

    private int size;
    private E[] elements;

    public Queue() {
        elements = (E[])new Object[10];
        size = 0;
    }

    void add(E value) {
        if(size > elements.length) {
            expandSize();
        }
        elements[size] = value;
        size++;
    }

    E remove() {
        if(size == 0) {
            return null;
        }
        E temp = elements[size - 1];
        elements[size - 1] = null;
        size--;
        return temp;
    }

    E peek() {
        return elements[size - 1];
    }

    boolean isEmpty() {
        if(size == 0) {
            return true;
        }
        return false;
    }

     private void expandSize() {
        int increasedSize = elements.length * 2;
        elements = Arrays.copyOf(elements, increasedSize);
    }

    void remove(int index) {
        for(int i = index; i < size; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
    }

    void print() {
        for(int i = 0; i < size; i++) {
            System.out.print(elements[i] + " ");
        }
        System.out.println("");
    }

    void removeAll(E value) {
        for(int i = size - 1; i >= 0; i--) {
            if(elements[i] == value) {
                remove(i);
            }
        }
    }

    void removeDuplicates() {
        Set<E> s = new HashSet<>();
        for (int i = 0; i < size - 1; i++) {
            if (!s.contains(elements[i])) {
                s.add(elements[i]);
            } else {
                remove(i);
                i--;
            }
        }
    }

    public boolean equals(Queue<E> obj) {
        if(obj instanceof java.util.Queue) {
            if(obj.size != 0) {
                return true;
            }
        }
        return false;
    }
}

