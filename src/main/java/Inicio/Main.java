package Inicio;

import com.inventariospc.*;

public class Main {
    public static void main(String[] args){
        Raton raton1 = new Raton("Bluethoo", "HP");
        Raton raton2 = new Raton("Cable", "Lenovo");
        Teclado teclado1 = new Teclado("Bluethoo","Hp");
        Teclado teclado2 = new Teclado("Cable","Lenovo");
        Monitor monitor1 = new Monitor("Samsung",25);
        Monitor monitor2 = new Monitor("LG",32);
        Computadora computadora1 = new Computadora("Computadora Oficina",monitor1, raton1, teclado1);
        Computadora computadora2 = new Computadora("Computadora Gamer",monitor2,raton2,teclado2);
        Orden orden = new Orden();
        orden.agregarComputadora(computadora1);
        orden.agregarComputadora(computadora2);
        orden.mostrarOrden();
    }
}
