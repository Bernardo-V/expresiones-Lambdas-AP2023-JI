package com.argentinaprograma.expresioneslambdas;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TransformadorStrings {
    public static void main(String[] args) {
        // Ejemplo de uso
        List<String> listaOriginal = List.of("Hola", "Mundo", "Java");
        List<String> listaTransformada = transformarStrings(listaOriginal, s -> s.toUpperCase());
        System.out.println(listaTransformada);
    }

    // Método que transforma cada String en mayúsculas utilizando una interfaz funcional
    public static List<String> transformarStrings(List<String> lista, Function<String, String> transformador) {
        return lista.stream()
                .map(transformador)
                .collect(Collectors.toList());
    }
}