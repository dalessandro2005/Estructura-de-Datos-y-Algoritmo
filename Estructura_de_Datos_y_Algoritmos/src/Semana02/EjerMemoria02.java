/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana02;

class Persona {
    int edad;
    double altura;

    public Persona(int edad, double altura) {
        this.edad = edad;
        this.altura = altura;
    }
}

public class EjerMemoria02 {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();

        runtime.gc();
        long memoriaAntes = runtime.totalMemory() - runtime.freeMemory();

        int size = 100000;

        // Variables primitivas
        int[] edades = new int[size];
        double[] alturas = new double[size];

        long memoriaDespuesPrimitivos = runtime.totalMemory() - runtime.freeMemory();

        System.out.println("Memoria usada por primitivos: " + 
            (memoriaDespuesPrimitivos - memoriaAntes) + " bytes");

        edades = null;
        alturas = null;
        runtime.gc();

        long memoriaAntesObjetos = runtime.totalMemory() - runtime.freeMemory();

        // Objetos
        Persona[] personas = new Persona[size];
        for (int i = 0; i < size; i++) {
            personas[i] = new Persona(i, 1.70);
        }

        long memoriaDespuesObjetos = runtime.totalMemory() - runtime.freeMemory();

        System.out.println("Memoria usada por objetos: " + 
            (memoriaDespuesObjetos - memoriaAntesObjetos) + " bytes");
    }
}