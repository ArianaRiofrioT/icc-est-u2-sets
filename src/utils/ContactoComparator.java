package utils;

import models.Contacto;
import java.util.Comparator;

public class ContactoComparator implements Comparator<Contacto> {

    @Override
    public int compare(Contacto c1, Contacto c2) {
        // Primero comparamos apellidos 
        int comparacionApellido = c1.getApellido().compareToIgnoreCase(c2.getApellido());

        if (comparacionApellido != 0) {
            return comparacionApellido;
        }

        int comparacionNombre = c1.getNombre().compareToIgnoreCase(c2.getNombre());
        if(comparacionNombre != 0){
            return comparacionNombre;

        }

        return c1.getTelefono().compareToIgnoreCase(c2.getTelefono());



    }
}
    