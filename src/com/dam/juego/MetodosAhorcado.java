package com.dam.juego;

import com.dam.lectura.LecturaFichero;

import java.util.*;
import javax.swing.*;

import static javax.swing.JOptionPane.QUESTION_MESSAGE;
import static javax.swing.JOptionPane.YES_NO_OPTION;

public class MetodosAhorcado {

    public static void partida() {

        List<String> palabras = new ArrayList<>();
        LecturaFichero.crearPalabra(palabras);
        int i = 0;

        Random rand = new Random();
        String palabraJuego = palabras.get(rand.nextInt(palabras.size()));

        //System.out.println(palabraJuego);
        List<Character> jugadores = new ArrayList<>();

        int intentos = 0;

        while (true) {
            if (intentos >= 5) {
                JOptionPane.showMessageDialog(null, "Has acabado todos tus intentos.");
                break;
            }

            if (!jugando(palabraJuego, jugadores)) {
                intentos++;
                JOptionPane.showMessageDialog(null, "Esta letra no está en la palabra. Te quedan " + (6 - intentos) + " intentos");

            }

            if (verPalabras(palabraJuego, jugadores)) {
                JOptionPane.showMessageDialog(null, "Has acertado la palabra.");
                break;
            } else
                MetodosAhorcado.averiguar(palabraJuego, jugadores);
        }
    }

    public static void averiguar(String palabraJuego, List<Character> jugadores) {
        int op = JOptionPane.showOptionDialog(null, "¿Quieres introducir la palabra?", "Averiguar",
                YES_NO_OPTION, QUESTION_MESSAGE, null, new Object[]{"Si", "No"}, null);

        switch (op) {
            case 0 :
                String palabra = JOptionPane.showInputDialog("Introduce la palabra: ");
                if (palabraJuego.equals(palabra)) {
                    JOptionPane.showMessageDialog(null, "Has acertado la palabra.");
                    break;
                } else
                    JOptionPane.showMessageDialog(null, "La palabra no es correcta.");
            case 1 :
        }

    }
    public static boolean jugando(String palabraJuego, List<Character> jugadores) {

        String letra = JOptionPane.showInputDialog("Introduce unha letra: ");
        jugadores.add(letra.charAt(0));

        return palabraJuego.contains(letra);
    }

    public static boolean verPalabras(String palabraJuego, List<Character> jugadores) {
        String concatena = "";
        int correctas = 0;

        for (int i = 0; i < palabraJuego.length(); i++) {
            if (jugadores.contains(palabraJuego.charAt(i))) {
                concatena = concatena + palabraJuego.charAt(i);
                correctas++;
            } else {
                concatena = concatena + " - ";
            }
        }
        System.out.println(concatena);
        JOptionPane.showMessageDialog(null, concatena);

        return (palabraJuego.length() == correctas);
    }

    public static void partidaDificil() {

        List<String> palabras = new ArrayList<>();
        LecturaFichero.crearPalabra(palabras);
        int i = 0;

        Random rand = new Random();
        String palabraJuego = palabras.get(rand.nextInt(palabras.size()));

        //  System.out.println(palabraJuego);
        List<Character> jugadores = new ArrayList<>();

        System.out.println();

        int intentos = 0;

        while (true) {
            if (intentos >= 1) {
                JOptionPane.showMessageDialog(null, "Has acabado todos tus intentos.");
                break;
            }

            if (!jugando(palabraJuego, jugadores)) {
                intentos++;
                JOptionPane.showMessageDialog(null, "Esta letra no está en la palabra. Te quedan " + (2 - intentos) + " intentos");

            }

            if (verPalabras(palabraJuego, jugadores)) {
                //            ImageIcon icono = new ImageIcon(Ahorcado.class.getResource("ahorcado.gif"));
                JOptionPane.showMessageDialog(null, "Has acertado la palabra.");
                //            JOptionPane.showMessageDialog(null, icono, "Has acertado la palabra.", JOptionPane.INFORMATION_MESSAGE);
            }

        }
    }

    public static void partidaMedia() {

        List<String> palabras = new ArrayList<>();
        LecturaFichero.crearPalabra(palabras);
        int i = 0;

        Random rand = new Random();
        String palabraJuego = palabras.get(rand.nextInt(palabras.size()));

        //    System.out.println(palabraJuego);
        List<Character> jugadores = new ArrayList<>();

        System.out.println();

        int intentos = 0;

        while (true) {
            if (intentos >= 4) {
                JOptionPane.showMessageDialog(null, "Has acabado todos tus intentos.");
                break;
            }

            if (!jugando(palabraJuego, jugadores)) {
                intentos++;
                JOptionPane.showMessageDialog(null, "Esta letra no está en la palabra. Te quedan " + (3 - intentos) + " intentos");

            }

            if (verPalabras(palabraJuego, jugadores)) {
                JOptionPane.showMessageDialog(null, "Has acertado la palabra.");
            }

        }
    }
}
