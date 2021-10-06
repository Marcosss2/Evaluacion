
package com.ceep.domain;


public class Orden {
 private final int idOrden;
 private Computadora[] computadora;
 private  static int contadorOrdenes;
 private static  int contadorComputadoras;
 private static  final int maxComputadoras = 4;

    public Orden() {
    
    contadorComputadoras = 0;
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
        for (int i = 0; i < contadorComputadoras; i++) {
            System.out.println(computadora[i]);           
        }
       
       
       
   } 
    
    
    
    
    
}
