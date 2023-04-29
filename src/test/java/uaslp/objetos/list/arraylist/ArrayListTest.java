package uaslp.objetos.list.arraylist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import uaslp.objetos.list.exceptions.BadIndexException;
import uaslp.objetos.list.exceptions.NotNullAllowedException;
import uaslp.objetos.list.linkedlist.LinkedList;

public class ArrayListTest {

    @Test
    public void whenListIsCreated_thenIsEmpty(){
        ArrayList<String> list = new ArrayList<>();

        Assertions.assertEquals(0,list.getSize());
    }

    @Test
    public void inAnEmptyList_addAtTail(){
        ArrayList<String> list = new ArrayList<>();

        list.addAtTail("Hola");

        Assertions.assertEquals(1,list.getSize());
        Assertions.assertEquals("Hola",list.getAt(1));

    }

    @Test
    public void inAFullList_addAtTail_incresedTheSize(){
        ArrayList<String> list = new ArrayList<>();
        list.addAtTail("Hola");
        list.addAtTail("adios");

        list.addAtTail("Star");

        Assertions.assertEquals(3,list.getSize());
        Assertions.assertEquals("Star",list.getAt(3));
    }

    @Test
    public void givenAList_whenAddAtTailANullValue_ThenExceptionIsThrows(){
        ArrayList<String> list= new ArrayList<>();

        Assertions.assertThrows(NotNullAllowedException.class ,() -> list.addAtTail(null));

        Assertions.assertEquals(0,list.getSize());
    }

    @Test
    public void inAnEmptyList_addAtFront(){
        ArrayList<String> list = new ArrayList<>();

        list.addAtFront("Hola");

        Assertions.assertEquals(1,list.getSize());
        Assertions.assertEquals("Hola",list.getAt(1));

    }

    @Test
    public void inAFullList_addAtFront_incresedTheSize(){
        ArrayList<String> list = new ArrayList<>();
        list.addAtTail("Hola");
        list.addAtTail("adios");

        list.addAtFront("Star");

        Assertions.assertEquals(3,list.getSize());
        Assertions.assertEquals("Star",list.getAt(1));
    }

    @Test
    public void givenAList_whenAddAtFrontANullValue_ThenExceptionIsThrows(){
        ArrayList<String> list= new ArrayList<>();

        Assertions.assertThrows(NotNullAllowedException.class ,() -> list.addAtFront(null));

        Assertions.assertEquals(0,list.getSize());
    }

    @Test
    public void givenAnEmptyList_tryToRemoveInexistentElement(){
        ArrayList<String> list= new ArrayList<>();

        Assertions.assertThrows(BadIndexException.class ,() -> list.remove(1));

        Assertions.assertEquals(0,list.getSize());
    }

    @Test
    public void givenAList_removeTheFirstElement(){
        ArrayList<String> list= new ArrayList<>();
        list.addAtTail("Hola");
        list.addAtTail("adios");
        list.addAtFront("Star");

        list.showMeNames();

        list.remove(1);

        list.showMeNames();

        Assertions.assertEquals(2,list.getSize());
        Assertions.assertEquals("adios",list.getAt(2));
    }

    @Test
    public void inAnEmptyList_tryToShowTheData() {
        ArrayList<String> list=new ArrayList<>();

        list.showMeNames();

        Assertions.assertEquals(0,list.getSize());
    }

    @Test
    public void givenAList_removeAllofHisData() {
        ArrayList<String> list=new ArrayList<>();
        list.addAtTail("Hola");
        list.addAtTail("adios");
        list.addAtFront("Star");
        Assertions.assertEquals(3,list.getSize());

        list.removeAll();

        Assertions.assertEquals(0,list.getSize());
    }

    @Test
    public void givenAList_setANewDataInAnExistentIndex(){
        ArrayList<String> list=new ArrayList<>();
        list.addAtTail("Hola");
        list.addAtTail("adios");
        list.addAtFront("Star");

        list.setAt(2,"Moon");

        Assertions.assertEquals(3,list.getSize());
        Assertions.assertEquals("Moon",list.getAt(2));
    }

    @Test
    public void givenAEmptyList_setANewDataInAnExistentIndex(){
        ArrayList<String> list=new ArrayList<>();

        list.setAt(1,"Moon");

        Assertions.assertEquals(1,list.getSize());
        Assertions.assertEquals("Moon",list.getAt(1));
    }
    @Test
    public void givenAList_setANullDataInAnExistentIndex_thanExceptionIsThrows(){
        ArrayList<String> list=new ArrayList<>();
        list.addAtTail("Hola");
        list.addAtTail("adios");
        list.addAtFront("Star");

        Assertions.assertThrows(NotNullAllowedException.class ,() -> list.setAt(2,null));

        Assertions.assertEquals(3,list.getSize());
    }

    @Test
    public void givenAList_setANewDataInAnInexistentIndex_thanExceptionIsThrows(){
        ArrayList<String> list=new ArrayList<>();
        list.addAtTail("Hola");
        list.addAtTail("adios");
        list.addAtFront("Star");

        Assertions.assertThrows(BadIndexException.class ,() -> list.setAt(5,"Moon"));

        Assertions.assertEquals(3,list.getSize());
    }

    @Test
    public void givenAnEmptyList_tryToGetAtData(){
        ArrayList<String> list=new ArrayList<>();

        Assertions.assertThrows(BadIndexException.class ,() -> list.getAt(1));

        Assertions.assertEquals(0,list.getSize());
    }

    @Test
    public void givenAList_removeAllWhithThisData() {
        ArrayList<String> list=new ArrayList<>();
        list.addAtTail("Hola");
        list.addAtTail("Hola");
        list.addAtTail("Adios");
        list.addAtFront("Star");
        Assertions.assertEquals(4,list.getSize());

        list.removeAllWithValue("Hola");

        Assertions.assertEquals(2,list.getSize());
    }

    @Test
    public void givenAList_createANewIterator() {
        ArrayList<String> list=new ArrayList<>();
        list.addAtFront("Hola");
        ArrayListIterator<String> iterator= list.getIterator();


        Assertions.assertEquals(1,list.getSize());
        Assertions.assertFalse(iterator.hasNext());
        Assertions.assertEquals("Hola",iterator.next());
    }
}
