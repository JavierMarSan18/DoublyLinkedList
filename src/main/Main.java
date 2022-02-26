package main;

import com.umg.data.structures.LinkedList.DoublyLinkedList;
import java.util.Scanner;

public class Main {
    static DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {
        listMenu();
    }

    private static void listMenu(){
        System.out.println("\nLista Doblemente Enlazada");
        System.out.println("1.-Insertar al Inicio");
        System.out.println("2.-Insertar al Final");
        System.out.println("3.-Recorrer hacia adelante");
        System.out.println("4.-Recorrer hacia atrás");
        System.out.println("5.-Mostrar tamaño de la lista");
        System.out.println("6.-Mostrar si la lista está vacía");
        System.out.println("7.-Buscar elemento por valor");
        System.out.println("8.-Buscar elemento por índice");
        System.out.println("9.-Borrar un Elemento");
        System.out.println("0.-Salir");
        int opc = read.nextInt();

        switch (opc){
            case 1:
                System.out.println("\nIngresa el valor a insertar al inicio");
                int value = read.nextInt();
                doublyLinkedList.insertAtHead(value);
                System.out.println("\nValor insertado!");
                listMenu();
                break;
            case 2:
                System.out.println("\nIngresa el valor a insertar al final");
                value = read.nextInt();
                doublyLinkedList.insertAtTail(value);
                System.out.println("\nValor insertado!");
                listMenu();
                break;
            case 3:
                System.out.println("\nLista recorrida hacia adelante:");
                doublyLinkedList.traverseForward();
                listMenu();
                break;
            case 4:
                System.out.println("\nLista recorrida hacia atrás:");
                doublyLinkedList.traverseBackward();
                listMenu();
                break;
            case 5:
                System.out.println("\nEl tamaño de la lista es de: "+doublyLinkedList.size());
                listMenu();
                break;
            case 6:
                System.out.println("\nLa lista está vacía: "+doublyLinkedList.isEmpty());
                listMenu();
                break;
            case 7:
                System.out.println("\nIngresa valor buscado");
                value = read.nextInt();
                System.out.println("Valor: "+doublyLinkedList.searchByValue(value));
                listMenu();
                break;
            case 8:
                System.out.println("\nIngresa el índice de busqueda");
                int index = read.nextInt();
                System.out.println("Valor: "+doublyLinkedList.searchByIndex(index));
                listMenu();
                break;
            case 9:
                deleteMenu();
                listMenu();
                break;
            default:
                break;
        }
    }

    private static void deleteMenu(){
        System.out.println("\nEliminar de:");
        System.out.println("1.-Inicio\n2.-Final\n3.-Posición\n4.-Volver");
        int opc = read.nextInt();

        switch (opc){
            case 1:
                doublyLinkedList.deleteFromHead();
                System.out.println("\nValor eliminado!");
                deleteMenu();
                break;
            case 2:
                doublyLinkedList.deleteFromTail();
                System.out.println("\nValor eliminado!");
                deleteMenu();
                break;
            case 3:
                System.out.println("\nIngresa la posición del elemento a eliminar");
                int index = read.nextInt();
                doublyLinkedList.deleteFromPosition(index);
                System.out.println("\nValor eliminado!");
                deleteMenu();
                break;
            default:
                break;
        }
    }
}
