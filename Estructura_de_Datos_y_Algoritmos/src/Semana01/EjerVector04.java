/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana01;

import java.util.Scanner;

public class EjerVector04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[8];
        int contador = 0;
        
        for (int i = 0; i < 8; i++) {
            System.out.print("Ingrese un numero: ");
            numeros[i] = sc.nextInt();
        }
        
        for (int i = 0; i < 8; i++) {
            if (numeros[i] % 2 == 0) {
                contador++;
            }
        }
        System.out.println("Cantidad de numeros pares: " + contador);
    }
}
