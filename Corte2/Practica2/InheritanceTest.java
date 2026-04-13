package test;

import inheritance.*;
import java.util.Date;
public class InheritanceTest {
    public static void main(String[] args) {
        employee employee1 = new employee(1, 3000, "Alex", 'M', 32, "Facatativa");
        System.out.println(employee1);
        employee employee2 = new employee(2, 3450, "Alicia", 'F', 41, "Madrid");
        System.out.println(employee2);
        
        var fecha = new Date();
        
        cliente cliente1 = new cliente(fecha, true, "HBG", 'M', 46, "Bogota");
        System.out.println(cliente1);
        
        var fecha1 = new Date();
        
        cliente cliente2 = new cliente(fecha1, false, "Carla", 'F', 43, "Cota");
        System.out.println(cliente2);
        
        person persona1 = new person("Fabio", 'M', 25, "Madrid");
        imprimir(persona1);

        
        System.out.println("Detalles cliente 1: " + cliente1.obtenerDetalles());
        System.out.println("Detalles empleado 1: " + employee1.obtenerDetalles());

        
        person persona2 = new employee(3, 4567, "Alex", 'M', 37, "Teusaquillo");
        employee empleado1 = (employee) persona2;
        System.out.println(empleado1.obtenerDetalles());

        person persona3 = empleado1;
        System.out.println(persona3.obtenerDetalles());                

}        
    public static void imprimir(person persona) {
        System.out.println(persona.obtenerDetalles());
   
    }      
        
}      

