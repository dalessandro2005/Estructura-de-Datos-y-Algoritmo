/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana01;

import java.util.Random;
public class Ejerfor01 {
    public static void main(String[] args) {
        Random r = new Random();
        int contador = 0;

        for (int i = 1; i <= 10; i++) {
            int num = r.nextInt(50) + 1;
            System.out.println("Numero: " + num);

            if (num % 2 == 0) {
                contador++;
            }
        }

        System.out.println("Cantidad de numeros pares: " + contador);
    }
}

