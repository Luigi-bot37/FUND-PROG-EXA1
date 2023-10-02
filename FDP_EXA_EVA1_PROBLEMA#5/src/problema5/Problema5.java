/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema5;

import java.util.Scanner;

/**
 *
 * @author JOSHUA
 */
public class Problema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double gravedad = 9.81;
        double pi;
        pi = 3.1415;
        double anguloR = pi / 4;
        double seno45 = 1/Math.sqrt(2);
        double alturaM;
        double distancia;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingresa la velocidad inicial en metros/s: ");
        double velocidadin = input.nextDouble();
        
        alturaM = (velocidadin * velocidadin * seno45 * seno45) / (2*gravedad);
        distancia = (velocidadin * velocidadin * seno45 * seno45) / gravedad;
        
        System.out.println("la altura maxima alcanzada es : " + alturaM );
        System.out.println("la distancia que alcanza el objeto al caer es: " + distancia);
        
    }
    
}
