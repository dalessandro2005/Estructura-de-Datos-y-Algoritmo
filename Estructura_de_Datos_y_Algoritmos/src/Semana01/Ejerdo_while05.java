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

public class Ejerdo_while05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("1. Saludar");
            System.out.println("2. Mostrar mensaje");
            System.out.println("0. Salir");
            System.out.print("Elige una opcion: ");
            opcion = sc.nextInt();

            if (opcion == 1) {
                System.out.println("Hola!");
            } else if (opcion == 2) {
                System.out.println("Bienvenido al programa");
            }

        } while (opcion != 0);

        System.out.println("Programa finalizado");
    }
}