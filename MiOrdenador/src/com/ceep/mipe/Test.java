/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceep.mipe;

import com.ceep.domain.Computadora;
import com.ceep.domain.Monitor;
import com.ceep.domain.Orden;
import com.ceep.domain.teclado;


public class Test {
    
      public static void main(String[] args) {
          
          teclado teclado1 = new teclado("USB","LGKGGK");
          
          
          Monitor a1 = new Monitor("acer3e",40);
          Monitor a2 = new Monitor("asust5",30);
          Monitor a3 = new Monitor("hpy6",20);
          Monitor a4 = new Monitor("lenovol9",10);
          
         Computadora computadora1 = new Computadora("Lenovo",a4);
         Computadora computadora2 = new Computadora("hp",a3);
          Computadora computadora3 = new Computadora("asus",a2);
          Computadora computadora4 = new Computadora("Acer",a1);
         
         
         
         Orden orden1 = new Orden();
         orden1.agregarComputador(computadora1);
         orden1.agregarComputador(computadora2);
         orden1.agregarComputador(computadora3);
         orden1.agregarComputador(computadora4);
         
         orden1.mostrarOrden();
      
      
      
      }
    
    
    
    
    
    
    
    
    
    
    
}
