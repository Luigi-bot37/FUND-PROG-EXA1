/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication6;

import java.util.Scanner;

/**
 *
 * @author KEVIN
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double x1;
        double x2;
        double x3;
        double x4;
        double x5;
        Scanner captura = new Scanner(System.in);
        System.out.println("Formula la cual usaremos: y = x^2");   
        System.out.println("Ingrese un valor para (x):");   
        x1 =  captura.nextDouble();
        System.out.println("Valor de la pendiente:");
        x2 = 2*x1;
        System.out.println(x2);
        System.out.println("Valor del area entre dos valores de (x):");
        System.out.println("Ingrese el primer valor para (x):");
        x3 =  captura.nextDouble();
        System.out.println("Ingrese el segundo valor para (x):");
        x4 =  captura.nextDouble();
        System.out.println("Valor de el area:");
        x5 = (x1*x1)/(x3+x4);
        System.out.println(x5);
    }
    
}
