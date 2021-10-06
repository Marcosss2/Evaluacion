
package com.ceep.domain;


public class Monitor {
 
    
   private int idMonitor;
   private String marca;
   private double tamanio;
   private int ContadorMonitor;

    public Monitor() {
    this.idMonitor = ++ ContadorMonitor;
    }

    public Monitor(String marca, double tamanio) {
        this();
        this.marca = marca;
        this.tamanio = tamanio;
    }

    public int getIdMonitor() {
        return idMonitor;
    }

    public String getMarca() {
        return marca;
    }

    public double getTamanio() {
        return tamanio;
    }

    public int getContadorMonitor() {
        return ContadorMonitor;
    }

    public void setIdMonitor(int idMonitor) {
        this.idMonitor = idMonitor;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    public void setContadorMonitor(int ContadorMonitor) {
        this.ContadorMonitor = ContadorMonitor;
    }

    @Override
    public String toString() {
        return "Monitor{" + "idMonitor=" + idMonitor + ", marca=" + marca + ", tamanio=" + tamanio + ", ContadorMonitor=" + ContadorMonitor + '}';
    }
    
    
    
    
    
}
