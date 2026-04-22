/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana01;

import java.util.Scanner;

public class EjerVector01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] numeros = new int[5];
        int suma = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese un numero: ");
            numeros[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            suma = suma + numeros[i];
        }
        
        System.out.println("La suma total es: " + suma);
    }
}