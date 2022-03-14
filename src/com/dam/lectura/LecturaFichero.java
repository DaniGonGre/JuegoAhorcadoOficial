package com.dam.lectura;

import java.io.*;
import java.util.*;

public class LecturaFichero {

    public static void crearPalabra(List<String> jugadores){
        File fichero = new File("palabras.txt");

        try{
            Scanner leer = new Scanner(fichero);
            while (leer.hasNext()){

                jugadores.add(leer.next());
            }
            leer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
