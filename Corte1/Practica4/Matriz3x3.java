package matrices;

import java.util.Scanner;
        
public class Matriz3x3 {
    
    public int[][] data;
    public int filas;
    public int columnas;
    
    public Matriz3x3(){
        filas=3;
        columnas=3;
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
        System.out.print("\nMatriz 3x3:");
        System.out.println();
         for(int i=0; i<filas;i++){
            for(int j=0; j<columnas;j++){    
                System.out.print(data[i][j]+" ");                   
            }
            System.out.println();
        }       
    }
    
    public static void main(String[] args) {
        Matriz3x3 m = new Matriz3x3();
        Matriz3x3 n = new Matriz3x3();

    System.out.println("Ingrese la primera matriz:");
    m.set();

    System.out.println("Ingrese la segunda matriz:");
    n.set();

    Matriz3x3 resultado = m.sumar(n);
    Matriz3x3 resultadoM = m.multiplicar(n);
    System.out.println("\nPrimera matriz:");
    m.get();

    System.out.println("\nSegunda matriz:");
    n.get();

    System.out.println("\nSuma de matrices:");
    resultado.get();
    
    System.out.println("\nMultiplicacion de matrices:");
    resultadoM.get();
}
     public Matriz3x3 sumar(Matriz3x3 otra) {

     Matriz3x3 resultado = new Matriz3x3();
     for (int i = 0; i < filas; i++) {
     for (int j = 0; j < columnas; j++) {
     resultado.data[i][j] =

    this.data[i][j] + otra.data[i][j];
}
}
return resultado;
 }
    public Matriz3x3 multiplicar(Matriz3x3 otra) {

    Matriz3x3 resultadoM = new Matriz3x3();

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