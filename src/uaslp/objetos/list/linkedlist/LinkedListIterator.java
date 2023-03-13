package uaslp.objetos.list.linkedlist;

import uaslp.objetos.list.Iterator;

public class LinkedListIterator <T> implements Iterator<T> {

    private Node<T> currentNode;

    LinkedListIterator(Node head){
        currentNode=head;
    }

    public boolean hasNext() {
        return currentNode!=null;
    }

    public T next(){
        T selected= currentNode.data;
        currentNode=currentNode.next;
        return selected;
    }
}
