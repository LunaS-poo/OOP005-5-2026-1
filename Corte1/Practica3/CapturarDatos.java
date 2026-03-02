



package entrenandoarrays;

import java.util.Scanner;

public class CapturarDatos {
    public int [] data ;
    public int n;
    public Scanner Scanner;

// Constructor : crea vector de t a m a o n
    public CapturarDatos( int n ) {
       this.n = n ;
       this.data = new int[n];
       this.Scanner = new Scanner(System.in);
    }
    
    public void print( String name ) {
    System.out.print(name + " = [ " ) ;
       for (int i = 0; i < n ; i ++) {
           System . out . print ( data [ i ]) ;
           if(i < n - 1) System . out . print ( " , " ) ;
       }
       System.out.println(" ] ") ;
              
}    public void IngresarDatos(){
       System.out.println("Ingrese " + data.length + " numeros:");
        for (int i = 0; i < data.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            // 2. Usar scanner.nextInt() para guardar en el arreglo
            data[i] = Scanner.nextInt(); 
        }
        System.out.println("Arreglo cargado");
    }
    public int sum(){
    int s = 0;
    for (int i = 0; i < n; i++) {
        s += data[i];
    }
    return s;
    }
    
   public double mean(){
    if (n == 0) return 0.0;
    return (double) sum() / n;
    }
    
    public int max(){
        int m= data[0];
        for (int i = 1; i<n;i++){
            if (data[i]>m ) m = data [i];
            }
        return m;
    }
    public int min(){
        int m= data[0];
        for (int i = 1; i < n; i++){
            if (data[i]<m ) m = data [i];
            }
        return m;
    }
        
    public static void main(String[] args) {
    CapturarDatos ob1 = new CapturarDatos(8); 
    ob1.IngresarDatos();

    System.out.println("Suma: " + ob1.sum());
    System.out.println("Promedio: " + ob1.mean());
    System.out.println("Numero maximo: " + ob1.max());
    System.out.println("Numero minimo: " + ob1.min());

      
    }
}