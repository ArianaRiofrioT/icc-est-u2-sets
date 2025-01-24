import java.util.ArrayList; 
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

    // Lista base de frutas
    private List<String> frutasBase() {
        List<String> frutas = new ArrayList<>();
        frutas.add("Melón");
        frutas.add("Pera");
        frutas.add("Manzana");
        frutas.add("Fresa");
        frutas.add("Kiwi");
        frutas.add("Melocoón");
    
        return frutas;
    }

    // HashSet 
    public Set<String> construirHasSet() {
        List<String> frutas = frutasBase();
        Collections.shuffle(frutas); 
        Set<String> conjunto = new HashSet<>(frutas);
        return conjunto;
    }

    public Set<String> construirLinkedHasSet() {
        List<String> frutas = frutasBase();
        Collections.shuffle(frutas); 
        Set<String> conjunto = new LinkedHashSet<>(frutas);
        return conjunto;
    }

    public Set<String> construirTreeSet() {
        List<String> frutas = frutasBase();
        Collections.shuffle(frutas); 
        Set<String> conjunto = new TreeSet<>(frutas);
        return conjunto;
    }



    public Set<String> construirTreeSetPorTamaño() {
        List<String> frutas = frutasBase();
        Collections.shuffle(frutas); 
        
        Set<String> conjunto = new TreeSet<>((fruta1, fruta2) -> Integer.compare(fruta1.length(), fruta2.length()));
        conjunto.addAll(frutas); 
        return conjunto;
    }
}
