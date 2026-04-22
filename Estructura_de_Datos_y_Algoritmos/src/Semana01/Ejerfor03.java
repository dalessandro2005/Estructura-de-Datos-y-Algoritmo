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

public class Ejerfor03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, suma = 0;

        System.out.print("Ingrese un numero: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            suma += i;
        }

        System.out.println("La suma es: " + suma);
    }
}