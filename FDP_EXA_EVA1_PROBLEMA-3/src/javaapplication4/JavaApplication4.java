/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication4;

import java.util.Scanner;

/**
 *
 * @author KEVIN
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double radio;
        double vel;
        double m3;
        double area;
        Scanner captura = new Scanner(System.in);
        System.out.println("Ingrese el radio de la tuberia:");
        radio = captura.nextDouble();
        System.out.println("Ingrese la velocidad de flujo del agua em metros sobre segundo (m/s)");
        vel = captura.nextDouble();
        area = Math.PI*(radio*radio);
        m3 = vel*area;
        System.out.println("metros cubicos (m3) de agua que fluye por la tuberia:");
        System.out.println(m3); 
        
    }  
}
