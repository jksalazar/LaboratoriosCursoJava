package org.example.ejercicio1;

import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Crear objetos Locale para diferentes regiones
        Locale localeUS = new Locale("en", "US");
        Locale localeFR = new Locale("fr", "FR");
        Locale localeJP = new Locale("ja", "JP");
        Locale localeMX = new Locale("es", "MX");

        // Imprimir el idioma y el país de cada Locale
        printLocaleDetails(localeUS);
        printLocaleDetails(localeFR);
        printLocaleDetails(localeJP);
        printLocaleDetails(localeMX);
    }

    private static void printLocaleDetails(Locale locale) {
        System.out.println("Idioma: " + locale.getLanguage() + ", País: " + locale.getCountry());
    }
}