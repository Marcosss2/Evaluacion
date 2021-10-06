
package com.ceep.domain;


public class Orden {
 private  int idOrden;
 private Computadora[] computadora;
 private  static int contadorOrdenes;
 private static  int contadorComputadoras;
 private static int maxComputadoras = 5;

    public Orden() {
    
    Orden.contadorComputadoras = 0;
        computadora = new Computadora[Orden.maxComputadoras];
        this.idOrden = ++Orden.contadorOrdenes;
    
    
    
    }
 
   public void agregarComputador(Computadora computadoraa){
       
       if (Orden.contadorComputadoras < Orden.maxComputadoras){
            computadora[Orden.contadorComputadoras++] = computadoraa;
        } else {
            System.out.println("Has alcanzado el máximo de computadoras " +
                    + Orden.maxComputadoras);
        }
   } 
    
   public void mostrarOrden(){
       
        System.out.println("Id de Orden: " + this.idOrden);
        for (int i = 0; i < Computadora.contadorComputadora; i++) {
            System.out.println("Nombre [" + i + "] -> " 
                    + computadora[i].getNombre());
            System.out.println("Monitor[" + i + "] -> " 
                    + computadora[i].getMonitor());            
        }
       
       
       
   } 
    
    
    
    
    
}
