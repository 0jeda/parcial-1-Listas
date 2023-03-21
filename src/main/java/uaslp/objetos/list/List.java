package uaslp.objetos.list;

import uaslp.objetos.list.linkedlist.LinkedListIterator;

import java.util.Objects;

public interface List <T>{
    void addAtTail(T data);

    void addAtFront(T data);

    void remove(int index);

    int getSize();


    void showMeNames();
    void removeAll();

    void setAt(int index, T data);


    T getAt(int index);

    void removeAllWithValue(T data);

    Iterator<T> getIterator();
}
