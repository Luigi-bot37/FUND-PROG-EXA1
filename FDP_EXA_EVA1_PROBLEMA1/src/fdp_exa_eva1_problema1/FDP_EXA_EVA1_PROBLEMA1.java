package fdp_exa_eva1_problema1;

import java.util.Scanner;

public class FDP_EXA_EVA1_PROBLEMA1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * El software le pedira al usuario que introduzca los datos referentes
         * a su equipo como el proyecto, nombres, apellidos, etc.
         */
//1.DECLARACION
        Scanner captura = new Scanner(System.in);
        String equipo;
        String proyecto;
//Datos de los integrantes
        String apellido1, nombre1, control1;
        String apellido2, nombre2, control2;
        String apellido3, nombre3, control3;
//2.CAPTURA
        System.out.println("Igrese el nombre del equipo:");
        equipo = captura.nextLine();
        System.out.println("Ingrese el nombre del proyecto:");
        proyecto = captura.nextLine();
//integrante 1
        System.out.println("Ingrese los datos del Integrante 1:");
        System.out.println("Apellidos:");
        apellido1 = captura.nextLine();
        System.out.println("Nombres:");
        nombre1 = captura.nextLine();
        System.out.println("Num. Contreol:");
        control1 = captura.nextLine();
        //Integrante 2
        System.out.println("Ingrese los datos del Integrante 2:");
        System.out.println("Apellidos:");
        apellido2 = captura.nextLine();
        System.out.println("Nombres:");
        nombre2 = captura.nextLine();
        System.out.println("Num. Control:");
        control2 = captura.nextLine();
        //Integrante 3
        System.out.println("Ingrese los datos del Integrante 3:");
        System.out.println("Apellidos:");
        apellido3 = captura.nextLine();
        System.out.println("Nombres:");
        nombre3 = captura.nextLine();
        System.out.println("Num. Control:");
        control3 = captura.nextLine();

        //3.SALIDA
        System.out.println("Nombre del Equipo:" + equipo);
        System.out.println("Proyecto:" + proyecto);
        //Salida de integrante 1
        System.out.println("Integrante 1.");
        System.out.println("Nombres:" + nombre1);
        System.out.println("Apellidos:" + apellido1);
        System.out.println("Num. de Control:" + control1);
        //Salida de integrante 2
        System.out.println("Integrante 2.");
        System.out.println("Nombres:" + nombre2);
        System.out.println("Apellidos:" + apellido2);
        System.out.println("Num. de Control:" + control2);
        //Salida de integrante 3
        System.out.println("Integrante 3.");
        System.out.println("Nombres:" + nombre3);
        System.out.println("Apellidos:" + apellido3);
        System.out.println("Num. de Control:" + control3);
    }

}
