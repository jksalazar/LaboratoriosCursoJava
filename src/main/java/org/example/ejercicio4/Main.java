package org.example.ejercicio3;

import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Configuración regional por defecto
        Locale defaultLocale = Locale.getDefault();

        // Cargar el ResourceBundle para el idioma por defecto
        ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", defaultLocale);

        // Mostrar los mensajes en el idioma por defecto
        System.out.println("Default Locale: " + defaultLocale);
        System.out.println(messages.getString("greeting"));
        System.out.println(messages.getString("farewell"));

        // Configuración regional para francés de Francia
        Locale frLocale = new Locale("fr", "FR");

        // Cargar el ResourceBundle para el francés de Francia
        ResourceBundle messagesFr = ResourceBundle.getBundle("MessagesBundle", frLocale);

        // Mostrar los mensajes en francés
        System.out.println("\nFrench Locale: " + frLocale);
        System.out.println(messagesFr.getString("greeting"));
        System.out.println(messagesFr.getString("farewell"));
    }


}