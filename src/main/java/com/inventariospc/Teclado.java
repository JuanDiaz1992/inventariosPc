package com.inventariospc;

public class Teclado extends DispositivosDeEntrada {

    private final int idTeclado;
    private  static int contadorTeclados;


    public Teclado(String tipoDeEntrada, String marca){
        super(tipoDeEntrada, marca);
        this.idTeclado = ++ Teclado.contadorTeclados;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Teclado{");
        sb.append("idTeclado=").append(idTeclado);
        sb.append(",").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
