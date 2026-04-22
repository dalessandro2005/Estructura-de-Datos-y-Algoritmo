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

public class Ejerdo_while02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String clave;

        do {
            System.out.print("Ingrese la contrasena: ");
            clave = sc.next();
        } while (!clave.equals("1234"));

        System.out.println("Acceso correcto");
    }
}