package Ejercicios15161718;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejer3 {
    public static void main(String[] args) {
        try{
            Scanner input = new Scanner(new File("word.txt"));
            String in = input.nextLine();
        }catch(FileNotFoundException e){
            System.out.println("No existe el fichero que buscas "+e);
        }
    }
}
