import java.util.Queue;

import controller.Stack;
import controller.StackG;
import controller.QueueG;
import models.Persona;

public class App {

    public static void main(String[] args) throws Exception {
        // StackG<Integer> pilaG = new StackG();
        // pilaG.push(10);
        // pilaG.push(-1);
        // pilaG.push(5);
        // pilaG.push(8);
        // System.out.println("Tam ="+pilaG.size());
        // pilaG.print();
        // pilaG.pop();
        // System.out.println("Tam ="+pilaG.size());
        // pilaG.print();

        Persona p1 = new Persona("Juan");
        Persona p2 = new Persona("Maria");
        Persona p3 = new Persona("Pedro");
        Persona p4 = new Persona("David");

        QueueG<Persona> colaPersonas = new QueueG<Persona>();
        colaPersonas.add(p1);
        colaPersonas.add(p2);
        colaPersonas.add(p3);
        colaPersonas.printCola();
        System.out.println("Persona Atendida -> " + colaPersonas.remove());
        colaPersonas.printCola();

        Persona pB = colaPersonas.findByName("Juan");
        System.out.println("Persona buscada -> " + pB != null ? pB : "Ninguna");
        Persona pE = colaPersonas.deleteByName("Pedro");
        System.out.println("Persona eliminada -> " + pE != null ? pE : "Ninguna");
        colaPersonas.printCola();

    }
}
