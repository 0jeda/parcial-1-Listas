package uaslp.objetos.list.linkedlist;

import uaslp.objetos.list.List;
import uaslp.objetos.list.exceptions.BadIndexException;
import uaslp.objetos.list.exceptions.NotNullAllowedException;

import java.util.*;

public class LinkedList <T> implements List<T> {
    private Node<T> head;
    private Node<T> tail;
    public int size;


    public void addAtTail(T data)throws NotNullAllowedException {
        if(data==null){
            throw new NotNullAllowedException();
        }
        Node<T> newNodo= new Node<>();
        newNodo.data=data;
        if(tail==null){
            head=newNodo;
        }else{
            newNodo.previous=tail;
            tail.next=newNodo;
        }
        tail=newNodo;
        size++;

    }

    public void addAtFront(T data)throws NotNullAllowedException{
        if(data==null){
            throw new NotNullAllowedException();
        }
        Node<T> newNodo= new Node<>();
        newNodo.data=data;
        if(head==null){
            tail=newNodo;
        }else{
            newNodo.next=head;
            head.previous=newNodo;
        }
        head=newNodo;
        size++;
    }

    public void remove(int index)throws BadIndexException {
        if(index<=size){
            if(index==1){
                head=head.next;
                if(head != null){
                    head.previous=null;
                }
                size--;
            }else if(index==size){
                tail=tail.previous;
                tail.next=null;
                size--;
            }else if(size>2){
                Node<T> iterator=head.next;
                int numberIterator=2;
                do {
                    if(numberIterator==index){
                        iterator.next.previous=iterator.previous;
                        iterator.previous.next=iterator.next;
                        size--;
                    }
                    numberIterator++;
                    iterator=iterator.next;
                }while (iterator.next!=null);
                }
            }else {
               throw new BadIndexException();

        }
    }

    public void removeAll(){
        while (head!=null){
            head=head.next;
        }
        while (tail!=null){
            tail=tail.previous;
        }
        size=0;
    }

    public void showMeNames(){
        System.out.println(" ");
        if (head!=null) {
            LinkedListIterator<T> iterator=getIterator();
            while (iterator.hasNext()){
                Object data=iterator.next();
                System.out.println(data);
            }
        }else {
            System.out.println("Lo sentimos la lista esta vacia");
        }
    }

    public void setAt(int index, T data)throws NotNullAllowedException, BadIndexException{
        if(data==null){
            throw new NotNullAllowedException();
        }

        if(index==1){
            head.data=data;
        } else if (index==size) {
            tail.data=data;
        }else if(size>2) {
            int numberIterator=2;
            Node<T> iterator=head.next;
            while(iterator!=null){
                if(numberIterator==index){
                    iterator.data=data;
                }
                numberIterator++;
                iterator=iterator.next;
            }
        }else{
            throw new BadIndexException();
        }
    }

    public T getAt(int index){
        System.out.println(" ");
        if(index==1){
            return head.data;
        } else if (index==size) {
            return tail.data;
        }else if (size>2){
            int numberIterator=2;
            LinkedListIterator<T> iterator=getIterator();
            while (iterator.hasNext()){
                T data=iterator.next();
                if(numberIterator==index){
                    return data;
                }
                numberIterator++;
            }
        }
        return (T) "Lo sentimos";
    }

    public void removeAllWithValue(T data){
        if(Objects.equals(head.data, data)){
            head=head.next;
            head.previous=null;
            size--;
        } else if (Objects.equals(tail.data, data)) {
            tail=tail.previous;
            tail.next=null;
            size--;
        }else if(size>2) {
            Node<T> iterator=head.next;
            while (iterator!=tail){
                if(Objects.equals(iterator.data, data)){
                    iterator.previous.next=iterator.next;
                    iterator.next.previous=iterator.previous;
                    size--;
                }
                iterator=iterator.next;
            }
        }
    }

    public int getSize() {
        return size;
    }

    public LinkedListIterator<T> getIterator(){
        return new LinkedListIterator<>(head);
    }


}
