
package ejemploclases;


public class Vehiculo {
    public int pasajero;
    String combustible;
    public int velocidad;
    String marca;
    public String color;
    
    public void metodo1 (){
        
        System.out.println("Encender");
    }
    public void metodo2(){
        System.out.println("Apagar");
    }
    public int metodo3(){
        int gasto;
        gasto = pasajero * velocidad;
        return gasto;
    }
    
    
    
}
