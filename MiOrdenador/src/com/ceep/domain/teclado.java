
package com.ceep.domain;


public class teclado extends DispositivoEntrada {
  
   private int idTeclado;
   private static int contadorTeclados;

    public teclado(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
    
        this.idTeclado = ++ teclado.contadorTeclados;
    }

    @Override
    public String toString() {
        return  super.toString() +"teclado{" + "idTeclado=" + idTeclado + '}';
    }
   
    
    
    
    
    
    
}
