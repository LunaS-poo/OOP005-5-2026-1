
package modificadoresacceso;

public class MainCuenta {
    
    public static void main(String[] args) {
     CuentaBancaria c1 = new CuentaBancaria("Maria", 100000.0);
     c1.mostrar();
     c1.depositar(25000.0);
     c1.retirar(10000.0);
     System.out.println("\nDespues de operaciones:");
     c1.mostrar();
     System.out.println("\nAcceso controlado con getter:");
     System.out.println("Saldo actual = " + c1.getSaldo());
}

}
    
    

