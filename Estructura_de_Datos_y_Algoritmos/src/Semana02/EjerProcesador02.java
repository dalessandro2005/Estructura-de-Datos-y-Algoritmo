/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana02;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;
import java.util.Arrays;
import java.util.Random;

public class EjerProcesador02 {
    public static void main(String[] args) {
        ThreadMXBean bean = ManagementFactory.getThreadMXBean();

        if (bean.isThreadCpuTimeSupported()) {
            bean.setThreadCpuTimeEnabled(true);
        } else {
            System.out.println("CPU no soportado");
            return;
        }

        int size = 50000; //  para forzar uso de CPU
        int[] arreglo1 = new int[size];
        int[] arreglo2 = new int[size];

        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            int num = rand.nextInt(100000);
            arreglo1[i] = num;
            arreglo2[i] = num;
        }

        //Bubble Sort (muy pesado)
        long inicioBurbuja = bean.getCurrentThreadCpuTime();
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (arreglo1[j] > arreglo1[j + 1]) {
                    int temp = arreglo1[j];
                    arreglo1[j] = arreglo1[j + 1];
                    arreglo1[j + 1] = temp;
                }
            }
        }
        long finBurbuja = bean.getCurrentThreadCpuTime();

        //Arrays.sort (optimizado)
        long inicioSort = bean.getCurrentThreadCpuTime();
        Arrays.sort(arreglo2);
        long finSort = bean.getCurrentThreadCpuTime();

        System.out.println("CPU Bubble Sort: " + (finBurbuja - inicioBurbuja) + " ns");
        System.out.println("CPU Arrays.sort: " + (finSort - inicioSort) + " ns");

        // Evita optimización del compilador
        System.out.println("Control: " + arreglo1[0] + arreglo2[0]);
    }
}