package uaslp.objetos.list.arraylist;

public class ArrayListIterator {
    private String []currentlist;
    private int iterator;
    ArrayListIterator(String []head){
        currentlist=head;
    }

    public boolean hasNext() {
        return currentlist[iterator+1]!=null;
    }

    public String next(){
        String selected= currentlist[iterator];
        iterator++;
        return selected;
    }
}
