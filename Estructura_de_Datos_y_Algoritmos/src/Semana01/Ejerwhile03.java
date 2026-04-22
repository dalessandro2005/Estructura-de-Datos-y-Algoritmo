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

public class Ejerwhile03 {
    public static void main(String[] args) {
        Random r = new Random();
        int suma = 0;

        while (suma <= 100) {
            int num = r.nextInt(20) + 1;
            suma += num;
            System.out.println("Numero: " + num + " | Suma: " + suma);
        }

        System.out.println("Suma final: " + suma);
    }
}