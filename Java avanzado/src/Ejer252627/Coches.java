package Ejer252627;

import java.util.ArrayList;

public class Coches {
    CochesDB cochesDB = new CochesDB("fichero.txt");

    public ArrayList<Coche> listarCoches() {
        return cochesDB.obtener();
    }

    public Coche obtenerCoche(String nombreCoche) {
        Coche coche = new Coche();
        coche.nombreCoche = nombreCoche;

        return cochesDB.buscar(coche);
    }

    public void crearCoche(Coche coche) {
        if (cochesDB.buscar(coche) != null) {
            return;
        }

        cochesDB.insertar(coche);
    }

    public void borrarCoche(String nombreCoche) {
        Coche coche = new Coche();
        coche.nombreCoche = nombreCoche;

        cochesDB.borrar(coche);
    }
}
