/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana01;

/**
 *
 * @author User
 */
import java.util.Random;

public class Ejerwhile05 {
    public static void main(String[] args) {
        Random r = new Random();
        int contador = 0, i = 1;

        while (i <= 10) {
            int num = r.nextInt(50) + 1;
            System.out.println("Numero: " + num);

            if (num % 2 == 0) {
                contador++;
            }
            i++;
        }

        System.out.println("Cantidad de pares: " + contador);
    }
}