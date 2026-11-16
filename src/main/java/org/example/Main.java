package org.example;

import com.github.lalyos.jfiglet.FigletFont;
import com.google.gson.Gson;

import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() throws IOException {

        Estudiante est1 = new Estudiante("Alvaro", 18);

        String json = new Gson().toJson(est1);
        System.out.println(json);

        String estudianteAscii = FigletFont.convertOneLine(est1.getNombre());
        System.out.println(estudianteAscii);
    }
}
