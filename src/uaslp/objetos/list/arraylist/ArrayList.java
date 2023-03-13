package uaslp.objetos.list.arraylist;



import uaslp.objetos.list.List;


import java.util.Objects;

public class ArrayList <T> implements List<T>{

    public static final int INITIAL_SIZE=2;
    private T [] array;
    private int size;


    public ArrayList() {
        array = (T[])(new Object[INITIAL_SIZE]);
    }

    public void addAtTail(T data){
        if(size == array.length){
            increaseSize();
        }

        array[size]=data;
        size++;
    }

    public void addAtFront(T data){
        if(size == array.length){
            increaseSize();
        }
        for(int i=size;i>0;i--){
            if(array[i-1]!=null) {
                array[i] = array[i - 1];
            }
        }
        array[0]=data;
        size++;
    }

    public void remove(int index){
        if(index>0 && index<=size){
            if(index==size) {
                for (int i = index - 1; i < size - 1; i++) {
                    array[i] = array[i + 1];
                }
            }
            array[size-1]=null;
            size--;
        }else {
            System.out.println(" Lo siento, el indice no existe");
        }

    }

    public int getSize() {
        return size;
    }

    private void increaseSize(){
        T []newArray= (T[])(new Object[array.length * 2]);
        for(int i=0; i<array.length; i++){
            newArray[i]=array[i];
        }
        array=newArray;

    }

    public void showMeNames(){
        System.out.println(" ");
        if (size!=0) {
           for (int i=1; i<= array.length;i++){
               if(array[i-1]!=null) {
                   System.out.println("Dato " + i + ":" + array[i - 1]);
               }
           }
        }else {
            System.out.println(" Lo sentimos la lista esta vacia");
        }
    }
    public void removeAll(){
        T []newArray= (T[]) (new Object[array.length]);
        array=newArray;
        size=0;
    }

    public void setAt(int index, T data){
        if(index>0 && index<=array.length){
            if(size==0 || array[index-1]==null){
                size++;
            }
            array[index-1]=data;
        }else {
            System.out.println(" Lo siento, el indice no existe");
        }
    }

    public T getAt(int index){
        if(index>0 && index<=size){
            return array[index-1];
        }else {
            System.out.println(" Lo siento, el indice no existe");
        }
        return null;
    }

    public void removeAllWithValue(T data){
        for(int i=0;i<size;i++){
            if (Objects.equals(array[i],data)){
                for(int j=i;j<size;j++){
                    if(j+1<size) {
                        array[j] = array[j + 1];
                    }else{
                        array[j]=null;
                    }
                }
                size--;
                i--;
            }
        }
    }

    public ArrayListIterator<T> getIterator(){
        return new ArrayListIterator<>( array);
    }
}
