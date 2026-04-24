/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana02;
import java.util.Arrays;

public class EjerTiempo01 {
    public static void main(String[] args) {
        int size = 1000000;
        int[] arreglo = new int[size];

        for (int i = 0; i < size; i++) {
            arreglo[i] = i;
        }

        int objetivo = size - 1;

        // Búsqueda lineal
        long inicioLineal = System.nanoTime();
        int posLineal = -1;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == objetivo) {
                posLineal = i;
                break;
            }
        }
        long finLineal = System.nanoTime();

        // Búsqueda binaria
        long inicioBinaria = System.nanoTime();
        int posBinaria = Arrays.binarySearch(arreglo, objetivo);
        long finBinaria = System.nanoTime();

        System.out.println("Posicion (Lineal): " + posLineal);
        System.out.println("Tiempo Lineal: " + (finLineal - inicioLineal) + " ns");

        System.out.println("Posicion (Binaria): " + posBinaria);
        System.out.println("Tiempo Binaria: " + (finBinaria - inicioBinaria) + " ns");
    }
}