import java.util.Set;

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

    public static void main(String[] args) {
        runHasSet();
        runLinkedHasSet();
        runTreeSet();
        runTreeSetPorTamaño();
    }
}
