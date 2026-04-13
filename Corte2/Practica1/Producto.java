
package sobrecargadeconstructores;

class Producto {
     public String nombre;
     public double precio;
     
// Constructor Vacìo

    public Producto() {
    }
     
 // Constructor con 1 atributo

    public Producto(String nombre) {
        this.nombre = nombre;
    }
    
 // Constructor con ambos atributos

        public Producto(String nombre, double precio) {
            this.nombre = nombre;
            this.precio = precio;
        }
         public void mostrar() {
        System.out.println("Nombre = " + nombre);
        System.out.println("Precio = " + precio);
  }
 }


