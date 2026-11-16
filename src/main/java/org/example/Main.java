package org.example;

import com.google.gson.Gson;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Estudiante est1 = new Estudiante("Alvaro", 18);

        String json = new Gson().toJson(est1);
        System.out.println(json);
    }
}
