import models.Seguro;

import java.util.ArrayList;
import java.util.List;

public class EjemploListas {
    public static void main(String[] args) {
        List<String> animales = new ArrayList<>(); // []
        animales.add("Elefante"); // ["Elefante"]
        animales.add("Venado"); // ["Elefante", "Venado"]
        animales.add("Mono"); // ["Elefante", "Venado", "Mono"]
        // [
        // 0: "Elefante",
        // 1: "Venado",
        // 2: "Mono"
        // ]

        System.out.println(animales.get(2));

        List<Seguro> seguros = new ArrayList<>();
        seguros.add(new Seguro()); // 0
        seguros.add(new Seguro()); // 1
        seguros.add(new Seguro()); // 2
        seguros.add(new Seguro()); // 3

        seguros.get(3).getAsegurado();
    }
}
