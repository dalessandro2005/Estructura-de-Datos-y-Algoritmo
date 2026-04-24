/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana02;
import java.util.ArrayList;

public class EjerMemoria01 {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();

        runtime.gc(); // limpiar memoria
        long memoriaAntes = runtime.totalMemory() - runtime.freeMemory();
        int size = 1000000;

        // Arreglo primitivo
        int[] arreglo = new int[size];

        long memoriaDespuesArreglo = runtime.totalMemory() - runtime.freeMemory();

        System.out.println("Memoria usada por int[]: " + 
            (memoriaDespuesArreglo - memoriaAntes) + " bytes");

        // Limpiar referencia
        arreglo = null;
        runtime.gc();
        long memoriaAntesLista = runtime.totalMemory() - runtime.freeMemory();

        // ArrayList
        ArrayList<Integer> lista = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            lista.add(i);
        }

        long memoriaDespuesLista = runtime.totalMemory() - runtime.freeMemory();

        System.out.println("Memoria usada por ArrayList<Integer>: " + 
            (memoriaDespuesLista - memoriaAntesLista) + " bytes");
    }
}
