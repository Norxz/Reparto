package main;

import java.util.Scanner;
import dataStructures.*;
import java.util.Iterator;
import objects.*;

/**
 *
 * @author espin
 */
public class Principal {

    Queue boxes = new Queue();
    List northS = new List();
    List southS = new List();
    List eastS = new List();
    List westS = new List();
    List centerS = new List();
    Stack northT = new Stack();
    Stack southT = new Stack();
    Stack eastT = new Stack();
    Stack westT = new Stack();
    Stack centerT = new Stack();
    Bags guides = new Bags();
    Operators op = new Operators();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opc;
        String direction;
        Principal ppal = new Principal();
        Scanner in = new Scanner(System.in);

        System.out.println("Bienvenido usuario!");

        do {
            System.out.println("""
                               Ingrese la accion a realizar: 
                               
                               1. Ingresar caja
                               2. Enviar caja a la bodega
                               3. Cargar los camiones
                               4. Despachar caminoes
                               5. Mostrar gu\u00edas""");
            opc = in.nextInt();

            switch (opc) {
                case 1 -> {
                    System.out.println("Por favor ingrese los siguientes datos: \n");
                    System.out.println("Quien envia: \n");
                    String sender = in.next();
                    System.out.println("Quien recibe: \n");
                    String receiver = in.next();
                    do {
                        System.out.println("""
                                       Direcci\u00f3n: 
                                       1. North
                                       2. South
                                       3. East
                                       4. West
                                       5. Center""");
                        opc = in.nextInt();
                        switch (opc) {
                            case 1 -> {
                                direction = "north";
                                break;
                            }
                            case 2 -> {
                                direction = "south";
                                break;
                            }
                            case 3 -> {
                                direction = "east";
                                break;
                            }
                            case 4 -> {
                                direction = "west";
                                break;
                            }
                            case 5 -> {
                                direction = "center";
                                break;
                            }
                            default -> {
                                direction = "invalid";
                            }
                        }
                    } while (direction.equals("invalid"));

                    System.out.println("Ingrese la altura de la caja: ");
                    double height = in.nextDouble();
                    System.out.println("Ingrese el ancho de la caja: ");
                    double wide = in.nextDouble();
                    System.out.println("Ingrese el largo de la caja: ");
                    double large = in.nextDouble();
                    System.out.println("Ingrese el peso de la caja: ");
                    double weight = in.nextDouble();
                    double distance = ppal.op.distanceCalculator();
                    double volume = ppal.op.volumenCalculator(weight, height, wide);
                    double volumetricWeight = ppal.op.volumetricWeightCalculator(volume);
                    int price = ppal.op.priceCalculator(weight, volumetricWeight);
                    Boxes box = new Boxes(volume, volumetricWeight, weight, height, wide, large, price, sender, receiver, direction, distance);
                    Guides guide = new Guides(sender, receiver, direction, distance);
                    ppal.boxes.enqueue(box);
                    ppal.guides.add(guide);

                    break;
                }
                case 2 -> {
                    if (ppal.boxes.isEmpty()) {
                        System.out.println("No hay cajas en la cola para enviar a las bodegas.");
                    } else {
                        Iterator<Boxes> itQueue = ppal.boxes.iterator();
                        while (itQueue.hasNext()) {
                            Boxes box = itQueue.next();
                            direction = box.getDirection();

                            switch (direction) {
                                case "north" ->
                                    ppal.northS.add(box);
                                case "south" ->
                                    ppal.southS.add(box);
                                case "east" ->
                                    ppal.eastS.add(box);
                                case "west" ->
                                    ppal.westS.add(box);
                                case "center" ->
                                    ppal.centerS.add(box);
                                default ->
                                    System.out.println("Dirección desconocida: " + direction);
                            }
                        }
                        System.out.println("Todas las cajas han sido enviadas a sus respectivas bodegas.");
                    }

                    break;
                }
                case 3 -> {
                    Sort.insertionSort(ppal.northS);
                    Sort.insertionSort(ppal.southS);
                    Sort.insertionSort(ppal.eastS);
                    Sort.insertionSort(ppal.westS);
                    Sort.insertionSort(ppal.centerS);

                    while (!ppal.northS.isEmpty()) {
                        ppal.northT.push(ppal.northS.removeLast());
                    }
                    while (!ppal.southS.isEmpty()) {
                        ppal.southT.push(ppal.southS.removeLast());
                    }
                    while (!ppal.eastS.isEmpty()) {
                        ppal.eastT.push(ppal.eastS.removeLast());
                    }
                    while (!ppal.westS.isEmpty()) {
                        ppal.westT.push(ppal.westS.removeLast());
                    }
                    while (!ppal.centerS.isEmpty()) {
                        ppal.centerT.push(ppal.centerS.removeLast());
                    }

                    System.out.println("Los camiones cargados.");
                    break;
                }
                case 4 -> {
                    System.out.println("Despachando el camión del norte...");
                    while (!ppal.northT.isEmpty()) {
                        Guides guide = (Guides) ppal.northT.pop();
                        System.out.println("Entregando la caja de " + guide.getSender() + " a " + guide.getReceiver() + " a una distancia de " + guide.getDistance() + " km.");
                    }

                    System.out.println("Despachando el camión del sur...");
                    while (!ppal.southT.isEmpty()) {
                        Guides guide = (Guides) ppal.southT.pop();
                        System.out.println("Entregando la caja de " + guide.getSender() + " a " + guide.getReceiver() + " a una distancia de " + guide.getDistance() + " km.");
                    }

                    System.out.println("Despachando el camión del este...");
                    while (!ppal.eastT.isEmpty()) {
                        Guides guide = (Guides) ppal.eastT.pop();
                        System.out.println("Entregando la caja de " + guide.getSender() + " a " + guide.getReceiver() + " a una distancia de " + guide.getDistance() + " km.");
                    }

                    System.out.println("Despachando el camión del oeste...");
                    while (!ppal.westT.isEmpty()) {
                        Guides guide = (Guides) ppal.westT.pop();
                        System.out.println("Entregando la caja de " + guide.getSender() + " a " + guide.getReceiver() + " a una distancia de " + guide.getDistance() + " km.");
                    }

                    System.out.println("Despachando el camión del centro...");
                    while (!ppal.centerT.isEmpty()) {
                        Guides guide = (Guides) ppal.centerT.pop();
                        System.out.println("Entregando la caja de " + guide.getSender() + " a " + guide.getReceiver() + " a una distancia de " + guide.getDistance() + " km.");
                    }

                    System.out.println("Todos los camiones han sido despachados.");
                    break;
                }

                case 5 -> {

                    Iterator<Guides> itGuides = ppal.guides.iterator();
                    while (itGuides.hasNext()) {
                        Guides guide = itGuides.next();
                        System.out.println(guide);
                    }
                }

            }

        } while (true);
    }

}
