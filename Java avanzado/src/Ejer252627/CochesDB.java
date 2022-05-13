package Ejer252627;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class CochesDB {
    public String ficheroDatos;

    private CochesDB() {}
    public CochesDB(String ficheroDatos) {
        this.ficheroDatos = ficheroDatos;
    }

    public ArrayList<Coche> obtener() {
        ArrayList<Coche> usuarios = new ArrayList();

        try {
            Scanner scanner = new Scanner(new File(ficheroDatos));

            while (scanner.hasNext()) {
                String usuarioActual = scanner.next();
                String []partes = usuarioActual.split(",");

                Coche coche = new Coche();
                coche.nombreCoche = partes[0];
                coche.marca = partes[1];
                coche.modelo = partes[2];
                coche.motor = partes[3];
                coche.puertas = Integer.parseInt(partes[4]);

                usuarios.add(coche);
            }

            scanner.close();
        } catch (Exception e) {
        }

        return usuarios;
    }

    public Coche buscar(Coche coche) {
        ArrayList<Coche> coches = obtener();

        for (Coche cocheActual : coches) {
            if (cocheActual.nombreCoche.equalsIgnoreCase(coche.nombreCoche)) {
                return cocheActual;
            }
        }

        return null;
    }

    public void insertar(Coche coche) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(ficheroDatos, true);
            PrintStream printStream = new PrintStream(fileOutputStream);
            printStream.println(separarUsuarioPorComas(coche));
            printStream.flush();
            printStream.close();
        } catch (Exception e) {
        }
    }

    public void borrar(Coche coche) {
        ArrayList<Coche> coches = obtener();

        for (int i = 0; i < coches.size(); i++) {
            if (coches.get(i).nombreCoche.equalsIgnoreCase(coche.nombreCoche)) {
                coches.remove(i);
            }
        }

        try {
            PrintStream printStream = new PrintStream(ficheroDatos);

            for (Coche cocheActual : coches) {
                String cocheComas = separarUsuarioPorComas(cocheActual);
                printStream.println(cocheComas);
            }

            printStream.close();
        } catch (Exception e) {
        }
    }

    private String separarUsuarioPorComas(Coche coche) {
        return coche.nombreCoche + ","
                + coche.marca + ","
                + coche.modelo + ","
                + coche.motor + ","
                + coche.puertas;
    }

}
