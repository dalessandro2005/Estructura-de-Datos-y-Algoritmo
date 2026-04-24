/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana02;

public class EjerTiempo02 {
    public static void main(String[] args) {
        int repeticiones = 10000;

        // Con String
        long inicioString = System.nanoTime();
        String texto = "";
        for (int i = 0; i < repeticiones; i++) {
            texto += "a";
        }
        long finString = System.nanoTime();

        // Con StringBuilder
        long inicioBuilder = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < repeticiones; i++) {
            sb.append("a");
        }
        long finBuilder = System.nanoTime();

        System.out.println("Tiempo con String: " + (finString - inicioString) + " ns");
        System.out.println("Tiempo con StringBuilder: " + (finBuilder - inicioBuilder) + " ns");
    }
}