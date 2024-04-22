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
    Bags stats = new Bags();
    Operators op = new Operators();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opc;
        String direction = null;
        Principal ppal = new Principal();
        Scanner in = new Scanner(System.in);
        Iterator<Boxes> itQueue = ppal.boxes.iterator();
        Iterator<Boxes> itEastS = ppal.eastS.iterator();
        Iterator<Boxes> itWestS = ppal.westS.iterator();
        Iterator<Boxes> itNorthS = ppal.northS.iterator();
        Iterator<Boxes> itSouthS = ppal.southS.iterator();
        Iterator<Boxes> itCenterS = ppal.centerS.iterator();

        System.out.println("Bienvenido usuario!");

        do {
            System.out.println("""
                               Ingrese la accion a realizar: 
                               
                               1. Ingresar caja
                               2. Enviar caja a la bodega
                               3. Cargar los camiones
                               4. Mostrar gu\u00edas""");
            opc = in.nextInt();

            switch (opc) {
                case 1 -> {
                    System.out.println("Por favor ingrese los siguientes datos: \n");
                    System.out.println("Quien envia: \n");
                    String sender = in.next();
                    System.out.println("Quien recibe: \n");
                    String receiver = in.next();
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
                    }
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

                    break;
                }
                case 2 -> {
                    if (ppal.boxes.isEmpty()) {
                        System.out.println("No hay cajas en la cola para enviar a las bodegas.");
                    } else {
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
                    
                }
            }

        } while (true);
    }

}
