package calculator;

public class Calculator {
    public int x1, x2;
    
  //  Constructor
    public Calculator(int a, int b){
       x1 = a;
       x2 = b;    
    }   
    
    public int add (){
        return x1 + x2;    
    }
    
    public int subs (){
        return x1 - x2; 
    }
    
    public int mult (){
        return x1 * x2; 
    }
    
    public int div (){
        return x1 / x2; 
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Calculator m = new Calculator(34,43);
        System.out.println("La suma con el objeto m es: " + m.add());
        System.out.println("La resta con el objeto m es: " + m.subs());
        System.out.println("La multiplicación con el objeto m es: " + m.mult());
        System.out.println("La división con el objeto m es: " + m.div());
        
        Calculator n = new Calculator(50,22);
        System.out.println("La suma con el objeto n es: " + n.add()); 
        System.out.println("La resta con el objeto n es: " + m.subs());
        System.out.println("La multiplicación con el objeto n es: " + m.mult());
        System.out.println("La división con el objeto n es: " + m.div());
        
    }
    
}
