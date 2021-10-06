
package com.ceep.domain;


public class Raton  extends DispositivoEntrada{
   
  private int idRaton;
  private int contadorRtones;  

    public Raton(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
    }

    @Override
    public String toString() {
        return "Raton{" + "idRaton=" + idRaton + ", contadorRtones=" + contadorRtones + '}';
    }
    
    
    
    
}
