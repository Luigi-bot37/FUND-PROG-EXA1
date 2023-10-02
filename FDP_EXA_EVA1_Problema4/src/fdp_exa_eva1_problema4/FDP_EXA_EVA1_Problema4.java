package fdp_exa_eva1_problema4;

import java.util.Scanner;

public class FDP_EXA_EVA1_Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * EL programa pedira el voltaje y el valor de 5 resistencias de un
         * circuito en paralelo pára calcular su intensidad de corriente,
         * resistencia equivalente y la intensidad de cada resistencia que hay.
         */
        /**
         * v: voltaje, I: intensidad de corriente, Req: Resistencia Equivalente.
         * I= v/ Req (intensidad de corriente es igual voltaje sobre resistencia
         * equivalente. Req= 1/r1 + 1/r2 + 1/r3...(Resistencia equivalente es
         * igual a 1 entre resistencia 1 mas 1 sobre resistencia 2 mas 1 entre
         * resistencia 3 mas las divisiones de el resto de resistencias que
         * existan
         */
        //1.DECLARACION
        Scanner captura = new Scanner(System.in);
        double r1, r2, r3, r4, r5;//Resistencias
        double v, I, Req;
        double I1, I2, I3, I4, I5; //Intensidad por resistencia
        //2.CAPTURA
        System.out.println("Ingrese el voltaje del circuito:");
        v = captura.nextDouble();
        System.out.println("Ingrese los valores de las  resistencias:");
        System.out.println("Valor de Resistencia 1:");
        r1 = captura.nextDouble();
        System.out.println("Valor de Resistencia 2:");
        r2 = captura.nextDouble();
        System.out.println("Valor de Resistencia 3:");
        r3 = captura.nextDouble();
        System.out.println("Valor de Resistencia 4:");
        r4 = captura.nextDouble();
        System.out.println("Valor de Resistencia 5:");
        r5 = captura.nextDouble();
        //3.ASIGNACION
        Req = (1 / r1) + (1 / r2) + (1 / r3) + (1 / r4) + (1 / r5);
        I = v / Req;
        I1 = v / r1;
        I2 = v / r2;
        I3 = v / r3;
        I4 = v / r4;
        I5 = v / r5;
        //4.SALIDA
        System.out.println("La resistencia equivalente es:" + Req);
        System.out.println("La intensidad de corriente es:" + I);
        System.out.println("Intensidad en Resistencia 1:" + I1);
        System.out.println("Intensidad en Resistencia 2:" + I2);
        System.out.println("Intensidad en Resistencia 3:" + I3);
        System.out.println("Intensidad en Resistencia 4:" + I4);
        System.out.println("Intensidad en Resistencia 5:" + I5);
    }

}
