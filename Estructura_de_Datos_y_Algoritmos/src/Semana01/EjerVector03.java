/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana01;

import java.util.Scanner;

public class EjerVector03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] notas = new double[4];
        double suma = 0;
        double promedio;

        for (int i = 0; i < 4; i++) {
            System.out.print("Ingrese nota: ");
            notas[i] = sc.nextDouble();
        }

        for (int i = 0; i < 4; i++) {
            suma = suma + notas[i];
        }

        promedio = suma / 4;

        System.out.println("El promedio es: " + promedio);
    }
}