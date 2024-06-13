package org.example.ejercicio4;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class Main {
    public static void main(String[] args) {
        // El número a formatear
        double number = 12345.67;

        //Estados Unidos
        Locale usLocale = Locale.US;
        NumberFormat usCurrencyFormat = NumberFormat.getCurrencyInstance(usLocale);
        String usFormatted = usCurrencyFormat.format(number);

        //Francia
        Locale frLocale = Locale.FRANCE;
        NumberFormat frCurrencyFormat = NumberFormat.getCurrencyInstance(frLocale);
        String frFormatted = frCurrencyFormat.format(number);

        //Japón
        Locale jpLocale = Locale.JAPAN;
        NumberFormat jpCurrencyFormat = NumberFormat.getCurrencyInstance(jpLocale);
        String jpFormatted = jpCurrencyFormat.format(number);

        //Resultados
        System.out.println("US: " + usFormatted);
        System.out.println("France: " + frFormatted);
        System.out.println("Japan: " + jpFormatted);
    }


}