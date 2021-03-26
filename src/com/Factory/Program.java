package com.Factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program {
    public static String name;

    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public  static  void main(String[] args) throws IOException {
        name = reader.readLine();
        DeveloperFactory developerFactory = createDeveloperBySpecialty(name);
        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();
    }

    static  DeveloperFactory createDeveloperBySpecialty(String specialty) {
        if (specialty.equalsIgnoreCase("java")) {
            return  new JavaDeveloperFactory();

        }else if (specialty.equalsIgnoreCase("c++")) {
            return new CppDeveloperFactory();

        }else if (specialty.equalsIgnoreCase("php")) {
            return  new PhpDeveloperFactory();
        }
        else {
            throw new RuntimeException(specialty + " is unknown specialty.");
        }
    }
}
