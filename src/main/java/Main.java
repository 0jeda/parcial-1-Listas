import uaslp.objetos.list.List;
import uaslp.objetos.list.arraylist.ArrayList;
import uaslp.objetos.list.linkedlist.LinkedList;

import javax.swing.*;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> lista= new LinkedList<>();
        int condition=1;
        Object dato;
        int index;


        lista.addAtTail("hola");
        //lista.addAtTail(88);
        //lista.addAtTail(new ArrayList<>());

        /*
        while(condition>0) {
            Scanner teclado=new Scanner(System.in);
            System.out.println("¿Qué te gustaria hacer?\n");
            System.out.println("1.-Insertar al inicio\n2.-Insertar al final\n3.-Remover un valor(Index)\n4.-Remover un valor(dato)" +
                    "\n5.-Remover todo\n6.-Inserta un valor en una posición\n7.-Regresa el valor de una posicion\n" +
                    "8.-Regresa cuantos valores hay en el arreglo\n9.-Muestrame el arreglo\n10.-Salir");
            int option = teclado.nextInt();
            Scanner cadena=new Scanner(System.in);
            switch (option) {
                case 1:
                    System.out.println("Ingresa un dato:");
                    dato = cadena.nextLine();
                    lista.addAtFront(dato);
                    break;
                case 2:
                    System.out.println("\nIngresa un dato:");
                    dato = cadena.nextLine();
                    lista.addAtTail(dato);
                    break;
                case 3:
                    System.out.println("\nIngresa el numero del dato que deseas eliminar:");
                    index = teclado.nextInt();
                    lista.remove((int) index);
                    break;
                case 4:
                    System.out.println("\nIngresa el dato que deseas eliminar:");
                    dato = cadena.nextLine();
                    lista.removeAllWithValue(dato);
                    break;
                case 5:
                    lista.removeAll();
                    System.out.println("Listo!");
                    break;
                case 6:
                    System.out.println("\nIngresa un dato:");
                    dato = cadena.nextLine();
                    System.out.println("\nIngresa la posición:");
                    index = teclado.nextInt();
                    lista.setAt((int) index, dato);
                    break;
                case 7:
                    System.out.println("\nIngresa la posición:");
                    index = teclado.nextInt();
                    dato=lista.getAt((int) index);
                    System.out.println("El dato obtenido es "+dato);
                    break;
                case 8:
                    index = lista.getSize();
                    System.out.println("Hay " + index + " datos en el arreglo");
                    break;
                case 9:
                    lista.showMeNames();
                    break;
                case 10:
                    System.out.println("Hasta luego!");
                    condition=0;
                    break;
                default:
                    System.out.println("Ingresa una opcion valida");
                    break;
            }
        }*/
    }
}