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

public class Ejerfor05 {
    public static void main(String[] args) {
        Random r = new Random();
        int contador = 0;

        for (int i = 1; i <= 8; i++) {
            int num = r.nextInt(100) + 1;
            System.out.println("Numero: " + num);

            if (num > 50) {
                contador++;
            }
        }

        System.out.println("Cantidad mayores a 50: " + contador);
    }
}