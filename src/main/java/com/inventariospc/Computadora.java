package com.inventariospc;

public class Computadora {
    private final int idComputadora;
    private String nombreComputadora;
    private Monitor monitor;
    private Raton raton;
    private Teclado teclado;
    private static int contadorComputadoras;

    private Computadora(){
        this.idComputadora = ++Computadora.contadorComputadoras;
    }
    public Computadora(String nombreComputadora, Monitor monitor, Raton raton, Teclado teclado){
        this();
        this.nombreComputadora = nombreComputadora;
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;
    }

    public int getIdComputadora() {
        return idComputadora;
    }

    public String getNombreComputadora() {
        return nombreComputadora;
    }

    public void setNombreComputadora(String nombreComputadora) {
        this.nombreComputadora = nombreComputadora;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Raton getRaton() {
        return raton;
    }

    public void setRaton(Raton raton) {
        this.raton = raton;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Computadora{");
        sb.append("idComputadora=").append(idComputadora);
        sb.append(", nombreComputadora='").append(nombreComputadora).append('\'');
        sb.append(", monitor=").append(monitor);
        sb.append(", raton=").append(raton);
        sb.append(", teclado=").append(teclado);
        sb.append('}');
        return sb.toString();
    }
}
