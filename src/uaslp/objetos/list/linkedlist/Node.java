package uaslp.objetos.list.linkedlist;

 class Node <T> {
    T data;
    Node<T> next;

    Node<T> previous;

    public Node(){
        next = null;
        previous = null;
    }

}
