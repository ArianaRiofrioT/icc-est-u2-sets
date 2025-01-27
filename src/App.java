import java.util.Set;
import java.util.TreeSet;

import models.Contacto;
import utils.ContactoComparator;

public class App {

    // Método HashSet
    private static void runHasSet() {
        Sets sets = new Sets();
        Set<String> ejemploHasSet = sets.construirHasSet();
        System.out.println("----HashSet-----");
        System.out.println("Elementos del HashSet (no se garantiza orden):");
        for (String fruta : ejemploHasSet) {
            System.out.println(fruta);
        }
    }

    // Método LinkedHashSet
    private static void runLinkedHasSet() {
        Sets sets = new Sets();
        Set<String> ejemploLinkedHasSet = sets.construirLinkedHasSet();
        System.out.println("----LinkedHashSet-----");
        System.out.println("Elementos del LinkedHashSet (orden de inserción):");
        for (String fruta : ejemploLinkedHasSet) {
            System.out.println(fruta);
        }
    }

    // Método TreeSet
    private static void runTreeSet() {
        Sets sets = new Sets();
        Set<String> ejemploTreeSet = sets.construirTreeSet();
        System.out.println("----TreeSet-----");
        System.out.println("Elementos del TreeSet (orden alfabetico):");
        for (String fruta : ejemploTreeSet) {
            System.out.println(fruta);
        }
    }

    // Método para el uso de TreeSet ordenado por tamaño de palabra
    private static void runTreeSetPorTamaño() {
        Sets sets = new Sets();
        Set<String> ejemploTreeSetPorTamaño = sets.construirTreeSetPorTamaño();
        System.out.println("----TreeSet con Comparator-----");
        System.out.println("Elementos del TreeSet (ordenados por longitud):");
        for (String fruta : ejemploTreeSetPorTamaño) {
            System.out.println(fruta);
        }
    }



    
    // -----------------TAREA - EJERCICIO--------------------
    private static void runContactos() {
        Set<Contacto> agenda = new TreeSet<>(new ContactoComparator());

        // Agregamos algunos contactos
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Luis", "Perez", "111111111"));
        agenda.add(new Contacto("Ana", "Perez", "987654321"));
        agenda.add(new Contacto("Pedro", "Lopez", "123456789"));



        System.out.println("----Contactos ordenados por apellido y luego por nombre----");
        for (Contacto contacto : agenda) {
            System.out.println(contacto);
        }
    }

    public static void main(String[] args) {
       // runHasSet();
        //runLinkedHasSet();
        //runTreeSet();
        //runTreeSetPorTamaño();
        runContactos();
    }
}
