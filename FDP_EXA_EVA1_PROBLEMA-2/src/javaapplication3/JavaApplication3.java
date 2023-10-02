/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author KEVIN
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double centi;
        double kelv;
        double faren;
        Scanner captura = new Scanner(System.in);
        System.out.println("Ingresa los grados Fahrenheit");
        faren = captura.nextDouble();
        System.out.println("Grados Fahrenheit a Centigrados:");
        centi = (faren-32)*.5556;
        System.out.println(centi);
        System.out.println("Grados Fahrenheit a kelvin:");
        kelv = centi+273.15;
        System.out.println(kelv);
    }
    
}
