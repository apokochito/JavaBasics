package com.java.basic;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Main {

    public static void main(String[] args) {

        // My first Hello World in Java
        System.out.println("Hello world");

        // My first Interface in Java
        TestClass myFirstClass = new TestClass();
        System.out.println(myFirstClass.hello());

        // My first Constant in Java
        System.out.println("From Constants class, this is a " + Constants.THIS_IS_A_CONSTANT);

        // My first properties file in Java
        String javaPath = "C:\\Users\\DianaElenaPintoApoli\\IdeaProjects\\JavaBasics\\src\\com\\java\\basic\\java.properties";
        Properties props = new Properties();
        try {
            props.load(new FileReader(javaPath));
        } catch (IOException e) {
            e.printStackTrace();
        }

        String version = props.getProperty("version");
        System.out.println("This is my first property: " + version);
    }
}
