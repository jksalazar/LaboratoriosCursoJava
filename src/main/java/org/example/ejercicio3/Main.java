package org.example.ejercicio2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Crear objeto Properties
        Properties properties = new Properties();

        // Intentar cargar el archivo de propiedades
        try (InputStream input = Main.class.getResourceAsStream("/config.properties")) {
            // Cargar las propiedades desde el archivo
            properties.load(input);

            // Obtener las propiedades y mostrarlas en la consola
            String appName = properties.getProperty("appName");
            String version = properties.getProperty("version");
            String author = properties.getProperty("author");

            System.out.println("appName: " + appName);
            System.out.println("version: " + version);
            System.out.println("author: " + author);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }


}