package com.dam.juego;
import javax.swing.*;
import static com.dam.juego.MetodosAhorcado.*;
import libreriaDani.lerDatos;

public class Ahorcado {

    public static void main(String[] args) {
        int op;

        try {
            op = Integer.parseInt(lerDatos.lerString("      "
                    + "     **** MENU ****"
                    + "\n1 --> Empezar partida" + "\n2 --> Elegir dificultad" + "\n3 --> Salir"));
            switch (op) {
                case 1:
                    partida();
                    break;
                case 2:
                    elegirDificultad();
            }
            while (op != 3);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El valor ingresado no es un número.");
        }
    }

    public static void elegirDificultad(){

        int op;

        try {

            op = Integer.parseInt(lerDatos.lerString("      " + "  **** DIFICULTAD ****"
                    + "\n1 --> Fácil: 5 intentos" + "\n2 --> Media: 3 intentos" + "\n3 --> Imposible: 1 intentos"));

            switch (op) {
                case 1:
                    partida();
                    break;
                case 2:
                    partidaMedia();
                    break;
                case 3:
                    partidaDificil();
                    break;
            }
            while (op != 4);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El valor ingresado no es un número.");
        }
    }
}
