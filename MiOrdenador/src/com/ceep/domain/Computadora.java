
package com.ceep.domain;


public class Computadora {
private int idComputadora;
private String nombre;
private Monitor monitor;
private teclado teclado;
private Raton raton;
private static  int contadorComputadora;
    public Computadora() {
       this.idComputadora = ++Computadora.contadorComputadora;
    }

    public Computadora(String nombre, Monitor monitor) {
         this.idComputadora = ++Computadora.contadorComputadora;
        this.nombre = nombre;
        this.monitor = monitor;
    }

    public Computadora(Monitor monitor, teclado teclado, Raton raton) {
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;
    }

    public int getIdComputadora() {
        return idComputadora;
    }

    public String getNombre() {
        return nombre;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public teclado getTeclado() {
        return teclado;
    }

    public Raton getRaton() {
        return raton;
    }

    
    
    
    @Override
    public String toString() {
        return "Computadora{" + "idComputadora=" + idComputadora + ", nombre=" + nombre + ", monitor=" + monitor + ", teclado=" + teclado + ", raton=" + raton + '}';
    }
  
 





}
