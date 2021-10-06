
package com.ceep.domain;


public class Raton  extends DispositivoEntrada{
   
  private int idRaton;
  private static int contadorRtones;  

    public Raton(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
      this.idRaton = +Raton.contadorRtones;
    
    }

    @Override
    public String toString() {
        return super.toString() + "Raton{" + "idRaton=" + idRaton + ", contadorRtones=" + contadorRtones + '}';
    }
    
    
    
    
}
