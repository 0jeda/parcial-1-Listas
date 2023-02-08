import uaslp.objetos.list.linkedlist.LinkedList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList lista=new LinkedList();

        String nombre;

        System.out.println("inserta un nombre:");
        Scanner teclado= new Scanner(System.in);
        nombre=teclado.nextLine();
        lista.addAtFront(nombre);

        System.out.println("inserta un nombre:");
        nombre=teclado.nextLine();
        lista.addAtFront(nombre);

        System.out.println("inserta un nombre:");
        nombre=teclado.nextLine();
        lista.addAtFront(nombre);

        System.out.println("inserta un nombre:");
        nombre=teclado.nextLine();
        lista.addAtFront(nombre);

        System.out.println("inserta un nombre:");
        nombre=teclado.nextLine();
        lista.addAtTail(nombre);

        System.out.println("inserta un nombre:");
        nombre=teclado.nextLine();
        lista.addAtTail(nombre);

        int size= lista.getSize();
        System.out.println("El tamaño de la listab es de "+size+" nodos");
        lista.showMeNames();

        System.out.println("Selecciona un nombre que quieras eliminar:");
        nombre=teclado.nextLine();
        lista.removeAllWithValue(nombre);

        lista.showMeNames();
        size= lista.getSize();
        System.out.println("El tamaño de la listab es de "+size+" nodos");

        System.out.println("Ingresa el numero del nodo del que quisieras obtener un nombre:");
        int index= teclado.nextInt();
        String data=lista.getAt(index);
        System.out.println("El nombre es: "+data);
    }
}