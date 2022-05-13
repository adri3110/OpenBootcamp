package EjercicioTemas789;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Ejercicio8 {
    public static void main(String[] args) {

        Ejercicio8 javaIOUtils = new Ejercicio8();
        String fileIn = "C:/Users/Adrian/IdeaProjects/Java desde 0/src/EjercicioTemas789/input.txt";
        String fileOut = "C:/Users/Adrian/IdeaProjects/Java desde 0/src/input.txt";
        boolean result = javaIOUtils.copyFile(fileIn, fileOut);
        System.out.println(result?
                "Success! File copying (Éxito! Fichero copiado)":
                "Error! Failed to copy the file (Error! No se ha podido copiar el fichero)");

    }
    public boolean copyFile(String fileIn, String fileOut) {
        File origin = new File(fileIn);
        File destination = new File(fileOut);
        if (origin.exists()) {
            try {
                InputStream in = new FileInputStream(origin);
                OutputStream out = new FileOutputStream(destination);
                // usamos un buffer para la copia
                byte[] buffer = new byte[1024];
                int len;
                while ((len = in.read(buffer)) > 0) {
                    out.write(buffer, 0, len);
                }
                in.close();
                out.close();
                return true;
            } catch (IOException ioe) {
                ioe.printStackTrace();
                return false;
            }
        } else {
            return false;
        }
    }
}


/*
byte[] array = new byte[100];

        try {
            InputStream input = new FileInputStream("input.txt");

            System.out.println("Available bytes in the file: " + input.available());

            // Read byte from the input stream
            input.read(array);
            System.out.println("Data read from the file: ");

            // Convert byte array into string
            String data = new String(array);
            System.out.println(data);

            // Close the input stream
            input.close();
        } catch (Exception e) {
            e.getStackTrace();

        }
 */