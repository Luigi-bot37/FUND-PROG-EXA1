/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema6;

import java.util.Scanner;

/**
 *
 * @author JOSHUA
 */
public class Problema6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double velocidadAnginicial;
        double velocidadAngfinal;
        double tiemporotacion;
        double radiorueda;
        double distanciaangular;
        double distanciametros;
        double velocidadAngpromedio;
        double velocidadPromMtsXseg;
        double aceleracionAng;
        double aceleracionMtsXsegCuadrado;
        double frecuenciagiro;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingresa la velocidad angular inicial (en radianes/s): ");
        velocidadAnginicial = input.nextDouble();
        
        System.out.print("Ingrese la velocidad angular final (en radianes/s): ");
        velocidadAngfinal = input.nextDouble();
        
        System.out.print("Ingrese el tiempo de rotacion (en segundos): ");
        tiemporotacion = input.nextDouble();
        
        System.out.print("Ingrese el radio de la rueda (en metros): ");
        radiorueda = input.nextDouble();
        
        //calcular 
        distanciaangular = velocidadAnginicial * tiemporotacion;
        distanciametros = distanciaangular * radiorueda;
        velocidadAngpromedio = (velocidadAngfinal - velocidadAnginicial) / tiemporotacion;
        velocidadPromMtsXseg = velocidadAngpromedio * radiorueda;
        aceleracionAng = (velocidadAngfinal - velocidadAnginicial) / tiemporotacion;
        aceleracionMtsXsegCuadrado = aceleracionAng * radiorueda;
        frecuenciagiro = 1/tiemporotacion;
        
        System.out.println("Distancia Angular Recorrida (radianes): " + distanciaangular);
        System.out.println("Distancia Recorrida (metros): " + distanciametros);
        System.out.println("Velocidad Angular Promedio (radianes/s): " + velocidadAngpromedio);
        System.out.println("Velocidad Promedio (m/s): " + velocidadPromMtsXseg);
        System.out.println("Aceleración Angular (radianes/s²): " + aceleracionAng);
        System.out.println("Aceleración (m/s²): " + aceleracionMtsXsegCuadrado);
        System.out.println("Frecuencia de Giro (Hertz): " + frecuenciagiro);
        
    }
    
}
