package fdp_exa_eva1_problema8;

import java.util.Scanner;

public class FDP_EXA_EVA1_PROBLEMA8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * El programa solicitara la coordenadas del centro y los ejes divisores
         * de una hiperbola horizontal para calcular los vertices, focos y la
         * distancia que hay entre cada foco y el centro.
         */
        //1.DECLARACION
        Scanner captura = new Scanner(System.in);
        double h, k, x, y, a, b, c;
        //2.CAPTURA
        System.out.println("Datos del centro:");
        System.out.println("Ingrese h:");
        h = captura.nextDouble();
        k = captura.nextDouble();
        System.out.println("Ingrese k:");
        System.out.println("Datos de los divisores:");
        System.out.println("Ingrese x:");
        x = captura.nextDouble();
        System.out.println("Ingrese y:");
        y = captura.nextDouble();
        //3.ASIGNACION
        /**
         * a: distancia desde el centro al divisor vertical, b: distancia desde
         * el centro al divisor horizontal, c:distancia desde el centro al
         * vertice.
         */
        a = Math.abs(h - x);
        b = Math.abs(k - y);
        c = Math.sqrt((a * a) + (b * b));
        /**
         * Por lo que tengo entendido, Math es una clase o libreria que me
         * permite usar mas operaciones matematicas ademas de las basicas.
         * abs:es valor absoluto, coniverte cualquier valor a positivo sqrt:saca
         * raiz cuadrada al valor que se encuentre dentro del parentesis.
         */
        //4.SALIDA
        System.out.println("Distancia entre foco y centro=" + c);
        System.out.println("Foco 1: (" + (h - c) + ", " + k + ")");
        System.out.println("Foco 2: (" + (h + c) + ", " + k + ")");
        System.out.println("Vertice 1: (" + (h - a) + ", " + k + ")");
        System.out.println("Vertice 2: (" + (h + a) + ", " + k + ")");

    }

}
