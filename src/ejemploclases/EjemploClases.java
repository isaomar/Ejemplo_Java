
package ejemploclases;


public class EjemploClases {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Vehiculo sedan = new Vehiculo();
        
        sedan.marca = "Toyota";
        sedan.color = "rojo";
        sedan.combustible = "Gasolina";
        sedan.pasajero = 5;
        sedan.velocidad = 150;
        sedan.metodo1();
        sedan.metodo2();
        System.out.println("El gato de este vehivulo es: "+ sedan.metodo3());
        
        
        Vehiculo pikcup = new Vehiculo();
        pikcup.marca = "ford";
        pikcup.pasajero = 2;
        pikcup.velocidad = 200;
        System.out.println("El gasto de ete vehiculo es: "+ sedan.metodo3());
        
        Vehiculo suv = new Vehiculo();
        Vehiculo coupe = new Vehiculo();
        
        
    }
    
}
