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

public class Ejerdo_while04{
    public static void main(String[] args) {
        Random r = new Random();
        int suma = 0;

        do {
            int num = r.nextInt(10) + 1;
            suma += num;
            System.out.println("Numero: " + num + " | Suma: " + suma);
        } while (suma < 50);

        System.out.println("Suma final: " + suma);
    }
}