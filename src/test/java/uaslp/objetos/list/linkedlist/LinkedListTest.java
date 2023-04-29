package uaslp.objetos.list.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import uaslp.objetos.list.exceptions.BadIndexException;
import uaslp.objetos.list.exceptions.NotNullAllowedException;

public class LinkedListTest {
    @Test
    public void whenListIsCreated_thenIsEmpty(){

        LinkedList<String> List= new LinkedList<>();

        int Size= List.getSize();

        Assertions.assertEquals(Size,0);
    }

    @Test
    public void givenAnEmptyList_whenAddAtTail_ThenElementIsInserted(){
        LinkedList<String> list= new LinkedList<>();

        list.addAtTail("1");

        Assertions.assertEquals("1",list.getAt(1));
        Assertions.assertEquals(1,list.getSize());
    }

    @Test
    public void givenAnNonEmptyList_whenAddAtTail_ThenElementIsInserted(){
        LinkedList<String> list= new LinkedList<>();
        list.addAtTail("1");

        list.addAtTail("2");

        Assertions.assertEquals("1",list.getAt(1));
        Assertions.assertEquals("2",list.getAt(2));
        Assertions.assertEquals(2,list.getSize());
    }
    @Test
    public void givenAList_whenAddAtTailANullValue_ThenExceptionIsThrows(){
        LinkedList<String> list= new LinkedList<>();

        Assertions.assertThrows(NotNullAllowedException.class ,() -> list.addAtTail(null));

        Assertions.assertEquals(0,list.getSize());
    }

    @Test
    public void givenAnEmptyList_whenAddAtFront_ThenElementIsInserted(){
        LinkedList<String> list= new LinkedList<>();

        list.addAtFront("1");

        Assertions.assertEquals("1",list.getAt(1));
        Assertions.assertEquals(1,list.getSize());
    }

    @Test
    public void givenAnNonEmptyList_whenAddAtFront_ThenElementIsInserted(){
        LinkedList<String> list= new LinkedList<>();
        list.addAtFront("1");

        list.addAtFront("2");

        Assertions.assertEquals("1",list.getAt(2));
        Assertions.assertEquals("2",list.getAt(1));
        Assertions.assertEquals(2,list.getSize());
    }

    @Test
    public void givenAList_whenAddAtFrontANullValue_ThenExceptionIsThrows(){
        LinkedList<String> list= new LinkedList<>();

        Assertions.assertThrows(NotNullAllowedException.class ,() -> list.addAtFront(null));

        Assertions.assertEquals(0,list.getSize());
    }

    @Test
    public void givenAListWith1Element_whenRemoveAtFront_ThenValueIsRemove(){
        LinkedList<String> list= new LinkedList<>();
        list.addAtFront("1");

        list.remove(1);

        Assertions.assertEquals(0,list.getSize());
    }

    @Test
    public void givenAListWith3Elements_whenRemoveAWrongIndex_ThenExceptionIsThrows(){
        LinkedList<String> list= new LinkedList<>();

        list.addAtTail("3");
        list.addAtTail("2");
        list.addAtTail("1");

        Assertions.assertThrows(BadIndexException.class ,() -> list.remove(5));

        Assertions.assertEquals(3,list.getSize());
        Assertions.assertEquals("3",list.getAt(1));
        Assertions.assertEquals("3",list.getAt(2));
        Assertions.assertEquals("1",list.getAt(3));

    }

    @Test
    public void givenAListWith3Elements_whenRemoveAFrontValue_ThenValueIsRemove(){
        LinkedList<String> list= new LinkedList<>();

        list.addAtFront("1");
        list.addAtTail("2");
        list.addAtTail("3");

        list.remove(1);

        Assertions.assertEquals(2,list.getSize());
        Assertions.assertEquals("2",list.getAt(1));
        Assertions.assertEquals("3",list.getAt(2));

    }

    @Test
    public void givenAListWith3Elements_whenRemoveAMiddleValue_ThenValueIsRemove(){
        LinkedList<String> list= new LinkedList<>();

        list.addAtFront("1");
        list.addAtTail("2");
        list.addAtTail("3");

        list.remove(2);

        Assertions.assertEquals(2,list.getSize());
        Assertions.assertEquals("1",list.getAt(1));
        Assertions.assertEquals("3",list.getAt(2));

    }

    @Test
    public void givenAListWith3Elements_whenRemoveATailValue_ThenValueIsRemove(){
        LinkedList<String> list= new LinkedList<>();

        list.addAtFront("1");
        list.addAtTail("2");
        list.addAtTail("3");

        list.remove(3);

        Assertions.assertEquals(2,list.getSize());
        Assertions.assertEquals("1",list.getAt(1));
        Assertions.assertEquals("2",list.getAt(2));

    }

    @Test
    public void givenAnEmptyList_whenRemoveAllOfTheValues_AllRemoved(){
        LinkedList<String> list=new LinkedList<>();

        list.removeAll();

        Assertions.assertEquals(0,list.getSize());
    }

    @Test
    public void givenAList_whenRemoveAllOfTheValues_AllRemoved(){
        LinkedList<String> list=new LinkedList<>();
        list.addAtTail("1");
        list.addAtTail("2");
        list.addAtTail("3");

        list.removeAll();

        Assertions.assertEquals(0,list.getSize());
    }

    @Test
    public void givenAList_whenShowAllOfTheValues_AllShowed(){
        LinkedList<String> list=new LinkedList<>();
        list.addAtTail("1");
        list.addAtTail("2");
        list.addAtTail("3");

        list.showMeNames();

        Assertions.assertEquals(3,list.getSize());
    }

    @Test
    public void givenAnEmptyList_whenShowAllOfTheValues_NoValues(){
        LinkedList<String> list=new LinkedList<>();

        list.showMeNames();

        Assertions.assertEquals(0,list.getSize());
    }

    @Test
    public void givenAList_whenAddAtWrongIndex_ThenExceptionIsThrows(){
        LinkedList<String> list= new LinkedList<>();
        list.addAtFront("1");
        Assertions.assertThrows(BadIndexException.class ,() -> list.setAt(3,"1"));

        Assertions.assertEquals(1,list.getSize());
        Assertions.assertEquals("1",list.getAt(1));
    }

    @Test
    public void givenAList_whenAddAtWrongValue_ThenExceptionIsThrows(){
        LinkedList<String> list= new LinkedList<>();
        list.addAtFront("1");

        Assertions.assertThrows(NotNullAllowedException.class ,() -> list.setAt(1,null));

        Assertions.assertEquals(1,list.getSize());
        Assertions.assertEquals("1",list.getAt(1));
    }

    @Test
    public void givenAList_whenSetAtFront_theValueIsChange(){
        LinkedList<String> list= new LinkedList<>();
        list.addAtFront("3");
        list.addAtFront("2");
        list.addAtFront("1");

        list.setAt(1,"11");

        Assertions.assertEquals(3,list.getSize());
        Assertions.assertEquals("11",list.getAt(1));
    }

    @Test
    public void givenAList_whenSetAtMiddle_theValueIsChange(){
        LinkedList<String> list= new LinkedList<>();
        list.addAtFront("3");
        list.addAtFront("2");
        list.addAtFront("1");

        list.setAt(2,"11");

        Assertions.assertEquals(3,list.getSize());
        Assertions.assertEquals("1",list.getAt(2));
    }

    @Test
    public void givenAList_whenSetAtTail_theValueIsChange(){
        LinkedList<String> list= new LinkedList<>();
        list.addAtFront("4");
        list.addAtFront("3");
        list.addAtFront("2");
        list.addAtFront("1");

        list.setAt(4,"11");

        Assertions.assertEquals(4,list.getSize());
        Assertions.assertEquals("11",list.getAt(4));
    }

    @Test
    public void givenAList_whenGetAtWrongIndex_ThenExceptionIsThrows() {
        LinkedList<String> list = new LinkedList<>();
        list.addAtFront("4");
        list.addAtFront("3");
        list.addAtFront("2");
        list.addAtFront("1");

        String n=list.getAt(7);

        Assertions.assertEquals( "Lo sentimos",n);
    }

    @Test
    public void givenAListWith3Elements_whenRemoveAllWithValue_ThenValueIsRemove(){
        LinkedList<String> list= new LinkedList<>();

        list.addAtFront("1");
        list.addAtTail("2");
        list.addAtTail("3");

        list.removeAllWithValue("1");

        Assertions.assertEquals(2,list.getSize());
        Assertions.assertEquals("2",list.getAt(1));
        Assertions.assertEquals("3",list.getAt(2));

    }

    @Test
    public void givenAListWith3Elements_whenRemoveAllWithValueTail_ThenValueIsRemove(){
        LinkedList<String> list= new LinkedList<>();

        list.addAtFront("1");
        list.addAtTail("2");
        list.addAtTail("3");

        list.removeAllWithValue("3");

        Assertions.assertEquals(2,list.getSize());
        Assertions.assertEquals("1",list.getAt(1));
        Assertions.assertEquals("2",list.getAt(2));

    }

    @Test
    public void givenAListWith4Elements_whenRemoveAllWithValue_ThenValueIsRemove(){
        LinkedList<String> list= new LinkedList<>();

        list.addAtFront("1");
        list.addAtTail("2");
        list.addAtTail("3");
        list.addAtTail("4");

        list.removeAllWithValue("3");

        Assertions.assertEquals(3,list.getSize());
        Assertions.assertEquals("1",list.getAt(1));
        Assertions.assertEquals("1",list.getAt(2));
        Assertions.assertEquals("4",list.getAt(3));

    }

}
