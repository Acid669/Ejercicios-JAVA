package com.ejercicio2.sbc2d3ejercicio2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ConversorMorse {
    @GetMapping("/convertirAMorse/{palabra}")
    public String convertirAPalabraMorse(@PathVariable String palabra) {
        String morse = convertirPalabraAMorse(palabra);
        return morse;
    }

    private String convertirPalabraAMorse(String palabra) {

        //Creamos un HashMap para indicar tabla de conversión
        Map<Character, String> tablaMorse = new HashMap<>();
        //Letras
        tablaMorse.put('A', ".-");
        tablaMorse.put('B', "-...");
        tablaMorse.put('C', "-.-.");
        tablaMorse.put('D', "-..");
        tablaMorse.put('E', ".");
        tablaMorse.put('F', "..-.");
        tablaMorse.put('G', "--.");
        tablaMorse.put('H', "....");
        tablaMorse.put('I', "..");
        tablaMorse.put('J', ".---");
        tablaMorse.put('K', "-.-");
        tablaMorse.put('L', ".-..");
        tablaMorse.put('M', "--");
        tablaMorse.put('N', "-.");
        tablaMorse.put('O', "---");
        tablaMorse.put('P', ".--.");
        tablaMorse.put('Q', "--.-");
        tablaMorse.put('R', ".-.");
        tablaMorse.put('S', "...");
        tablaMorse.put('T', "-");
        tablaMorse.put('U', "..-");
        tablaMorse.put('V', "...-");
        tablaMorse.put('W', ".--");
        tablaMorse.put('X', "-..-");
        tablaMorse.put('Y', "-.--");
        tablaMorse.put('Z', "--..");

        // Números
        tablaMorse.put('0', "-----");
        tablaMorse.put('1', ".----");
        tablaMorse.put('2', "..---");
        tablaMorse.put('3', "...--");
        tablaMorse.put('4', "....-");
        tablaMorse.put('5', ".....");
        tablaMorse.put('6', "-....");
        tablaMorse.put('7', "--...");
        tablaMorse.put('8', "---..");
        tablaMorse.put('9', "----.");

        //Convierte la palabra a mayúsculas
        palabra = palabra.toUpperCase();

        //Clase generadora de cadenas
        StringBuilder morseBuilder = new StringBuilder();

        //Itera sobre cada letra de la palabra
        for (char letra : palabra.toCharArray()) {
            //Verifica si la letra está en la tabla de conversión
            if (tablaMorse.containsKey(letra)) {
                //Agrega el código Morse correspondiente a la letra al StringBuilder
                morseBuilder.append(tablaMorse.get(letra)).append(" ");
            } else {
                //Si la letra no está en la tabla, agrega un espacio en blanco
                morseBuilder.append(" ");
            }
        }

        // Elimina el último espacio en blanco, si existe
        if (morseBuilder.length() > 0) {
            morseBuilder.deleteCharAt(morseBuilder.length() - 1);
        }

        return morseBuilder.toString();
    }
}
