package main;

import com.umg.data.structures.LinkedList.SinglyLinkedList;

import java.util.Scanner;

public class Main {
    static SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {
        try{
            startMenu();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    private static void startMenu(){
        System.out.println("1.-Iniciar\n2.-Salir");
        int opc = read.nextInt();
        if(opc==1){
            listMenu();
        }
    }

    private static void listMenu(){
        System.out.println("Lista enlazada");
        System.out.println("1.-Insertar al Inicio");
        System.out.println("2.-Insertar al Final");
        System.out.println("3.-Recorrer");
        System.out.println("4.-Buscar Elemento");
        System.out.println("5.-Borrar un Elemento");
        System.out.println("6.-Atrás");
        System.out.println("0.-Salir");
        int opc = read.nextInt();

        switch (opc){
            case 1:
                System.out.println("Ingresa el valor a insertar a la cabeza");
                int value = read.nextInt();
                singlyLinkedList.insertAtHead(value);
                listMenu();
                break;
            case 2:
                System.out.println("Ingresa el valor a insertar a la cola");
                value = read.nextInt();
                singlyLinkedList.insertAtTail(value);
                listMenu();
                break;
            case 3:
                singlyLinkedList.traverse();
                listMenu();
                break;
            case 4:
                searchMenu();
                listMenu();
                break;
            case 5:
                deleteMenu();
                listMenu();
                break;
            case 6:
                startMenu();
                break;
            default:
                break;
        }
    }

    private static void searchMenu(){
        System.out.println("Buscar por:");
        System.out.println("1.-Index\n2.-Valor\n3.-Atrás");
        int opc = read.nextInt();

        switch (opc){
            case 1:
                System.out.println("Ingresa el indice de busqueda");
                int value = read.nextInt();
                System.out.println(singlyLinkedList.searchByIndex(value));
                searchMenu();
                break;
            case 2:
                System.out.println("Ingresa valor buscado");
                value = read.nextInt();
                System.out.println(singlyLinkedList.searchByValue(value));
                searchMenu();
                break;
            case 3:
                listMenu();
                break;
            default:
                break;
        }
    }

    private static void deleteMenu(){
        System.out.println("Eliminar de:");
        System.out.println("1.-Cabeza\n2.-Cola\n3.-Posición\n4.-Atrás");
        int opc = read.nextInt();

        switch (opc){
            case 1:
                singlyLinkedList.deleteFromHead();
                deleteMenu();
                break;
            case 2:
                singlyLinkedList.deleteFromTail();
                deleteMenu();
                break;
            case 3:
                System.out.println("Ingresa la posición del elemento a eliminar");
                int index = read.nextInt();
                singlyLinkedList.deleteFromPosition(index);
                deleteMenu();
                break;
            default:
                break;
        }
    }
}
