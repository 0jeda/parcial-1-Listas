package uaslp.objetos.list;


import uaslp.objetos.list.exceptions.BadIndexException;
import uaslp.objetos.list.exceptions.NotNullAllowedException;

public interface List <T>{
    void addAtTail(T data) throws NotNullAllowedException;

    void addAtFront(T data) throws  NotNullAllowedException;

    void remove(int index)throws BadIndexException;

    int getSize();


    void showMeNames();
    void removeAll();

    void setAt(int index, T data)throws NotNullAllowedException, BadIndexException;


    T getAt(int index)throws BadIndexException;

    void removeAllWithValue(T data);

    Iterator<T> getIterator();
}
