package uaslp.objetos.list.arraylist;

import uaslp.objetos.list.Iterator;

public class ArrayListIterator <T> implements Iterator<T> {
    private T []currentlist;
    private int iterator;
    ArrayListIterator(T []head){
        currentlist=head;
    }

    public boolean hasNext() {
        return currentlist[iterator+1]!=null;
    }

    public T next(){
        T selected= currentlist[iterator];
        iterator++;
        return selected;
    }
}
