/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana02;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;

public class EjerProcesador01{
    public static void main(String[] args) {
        ThreadMXBean bean = ManagementFactory.getThreadMXBean();

        if (bean.isThreadCpuTimeSupported()) {
            bean.setThreadCpuTimeEnabled(true);
        } else {
            System.out.println("CPU no soportado");
            return;
        }
        // Bucle simple
        long inicioSimple = bean.getCurrentThreadCpuTime();
        long suma = 0;
        for (long i = 1; i < 200000000; i++) {
            suma += i;
        }
        long finSimple = bean.getCurrentThreadCpuTime();
        // Cálculo pesado 
        long inicioPesado = bean.getCurrentThreadCpuTime();
        double resultado = 0;
        for (long i = 1; i < 200000000; i++) {
            resultado += Math.log(i) * Math.sqrt(i);
        }
        long finPesado = bean.getCurrentThreadCpuTime();

        System.out.println("CPU bucle simple: " + (finSimple - inicioSimple) + " ns");
        System.out.println("CPU calculo pesado: " + (finPesado - inicioPesado) + " ns");

        // Para evitar optimización del compilador
        System.out.println("Control: " + (suma + resultado));
    }
}