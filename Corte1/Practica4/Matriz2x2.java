package matrices;

import java.util.Scanner;
        
public class Matriz2x2 {
    
    public int[][] data;
    public int filas;
    public int columnas;
    
    public Matriz2x2(){
        filas=2;
        columnas=2;
        data=new int[filas][columnas];
    }

    public void set(){
        Scanner sc = new Scanner(System.in);
        
        for(int i=0; i<filas;i++){
            for(int j=0; j<columnas;j++){
                System.out.print("Data["+i+"]["+j+"]:");
                data [i][j]= sc.nextInt();                   
            }
        }
    }
    
    public void get(){
        System.out.print("\nMatriz 2x2:");
        System.out.println();
         for(int i=0; i<filas;i++){
            for(int j=0; j<columnas;j++){    
                System.out.print(data[i][j]+" ");                   
            }
            System.out.println();
        }       
    }
    
    public static void main(String[] args) {
    Matriz2x2 m = new Matriz2x2();
    Matriz2x2 n = new Matriz2x2();

    System.out.println("Ingrese la primera matriz:");
    m.set();

    System.out.println("Ingrese la segunda matriz:");
    n.set();

    Matriz2x2 resultado = m.sumar(n);
    Matriz2x2 resultadoM = m.multiplicar(n);
    System.out.println("\nPrimera matriz:");
    m.get();

    System.out.println("\nSegunda matriz:");
    n.get();

    System.out.println("\nSuma de matrices:");
    resultado.get();
    
    System.out.println("\nMultiplicacion de matrices:");
    resultadoM.get();
}
     public Matriz2x2 sumar(Matriz2x2 otra) {

     Matriz2x2 resultado = new Matriz2x2();
     for (int i = 0; i < filas; i++) {
     for (int j = 0; j < columnas; j++) {
     resultado.data[i][j] =

    this.data[i][j] + otra.data[i][j];
}
}
return resultado;
 }
    public Matriz2x2 multiplicar(Matriz2x2 otra) {

    Matriz2x2 resultadoM = new Matriz2x2();

    for (int i = 0; i < filas; i++) {
        for (int j = 0; j < columnas; j++) {
            resultadoM.data[i][j] = 0;

            for (int k = 0; k < columnas; k++) {
                resultadoM.data[i][j] += this.data[i][k] * otra.data[k][j];
            }
        }
    }

    return resultadoM;
} 
 }