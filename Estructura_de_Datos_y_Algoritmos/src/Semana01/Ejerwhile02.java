/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana01;

/**
 *
 * @author User
 */
import java.util.Scanner;

public class Ejerwhile02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 1, positivos = 0, negativos = 0;

        while (num != 0) {
            System.out.print("Ingrese un numero (0 para salir): ");
            num = sc.nextInt();

            if (num > 0) {
                positivos++;
            } else if (num < 0) {
                negativos++;
            }
        }

        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
    }
}