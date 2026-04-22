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

public class Ejerdo_while01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, suma = 0;

        do {
            System.out.print("Ingrese un numero (0 para salir): ");
            num = sc.nextInt();
            suma += num;
        } while (num != 0);

        System.out.println("Suma total: " + suma);
    }
}