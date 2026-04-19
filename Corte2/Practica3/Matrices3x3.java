package matricesprivate;

import java.util.Scanner;

public class Matrices3x3 {

    private int[][] data;
    private int filas;
    private int columnas;

    public Matrices3x3() {
        this.filas = 3;
        this.columnas = 3;
        this.data = new int[filas][columnas];
    }
    public int getFilas() {
        return filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public int getValor(int i, int j) {
        return data[i][j];
    }
    public void setValor(int i, int j, int valor) {
        data[i][j] = valor;
    }
    public void llenar() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Data[" + i + "][" + j + "]: ");
                setValor(i, j, sc.nextInt());
            }
        }
    }
    public void mostrar() {
        System.out.println("\nMatriz 2x2:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(getValor(i, j) + " ");
            }
            System.out.println();
        }
    }
    public Matrices3x3 sumar(Matrices3x3 otra) {
        Matrices3x3 resultado = new Matrices3x3();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                int suma = this.getValor(i, j) + otra.getValor(i, j);
                resultado.setValor(i, j, suma);
            }
        }
        return resultado;
    }
    public Matrices3x3 multiplicar(Matrices3x3 otra) {
        Matrices3x3 resultado = new Matrices3x3();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                int valor = 0;

                for (int k = 0; k < columnas; k++) {
                    valor += this.getValor(i, k) * otra.getValor(k, j);
                }

                resultado.setValor(i, j, valor);
            }
        }
        return resultado;
    }

    public static void main(String[] args) {
       Matrices3x3 m = new Matrices3x3();
       Matrices3x3 n = new Matrices3x3();

        System.out.println("Ingrese la primera matriz:");
        m.llenar();

        System.out.println("Ingrese la segunda matriz:");
        n.llenar();

        Matrices3x3 suma = m.sumar(n);
        Matrices3x3 mult = m.multiplicar(n);

        System.out.println("\nPrimera matriz:");
        m.mostrar();

        System.out.println("\nSegunda matriz:");
        n.mostrar();

        System.out.println("\nSuma:");
        suma.mostrar();

        System.out.println("\nMultiplicación:");
        mult.mostrar();
    }
}