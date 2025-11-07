import java.util.Scanner;

public  class PromedioNotas {
    public  static void main(String[] args) {
        final int NUM_NOTAS = 5;
        double[] notas = new double[NUM_NOTAS];
        int inicio;
        double calculadora = 0;

        Scanner sc = new Scanner(System.in);
        for (inicio = 0; inicio < notas.length; inicio++) {
            System.out.println("Introduce una nota: ");
            notas[inicio] = sc.nextDouble();
            calculadora += notas[inicio];
        }

        double promedio = calculadora / NUM_NOTAS;
        System.out.println("El promedio es: " + promedio);

        if (promedio >= 9) {
            System.out.println("El promedio es excelente");
        } else if (promedio >= 7) {
            System.out.println("Buen trabajo");
        } else if (promedio >= 5) {
            System.out.println("Necesitas mejorar");
        }else {
            System.out.println("Has suspendido");
        }

        for( double n: notas){
            System.out.print(n + "; ");
        }
        System.out.println();

        inicio = 0;
        while (inicio < notas.length){
            System.out.println("Nota" + (inicio+1) + ": " + notas[inicio]);
            inicio++;
        }

        inicio = 0;
        do {
            System.out.print("Nota" + (inicio+1) + ": " + notas[inicio] + " ------ ");
            inicio++;
        }while (inicio < NUM_NOTAS);

    }
}
