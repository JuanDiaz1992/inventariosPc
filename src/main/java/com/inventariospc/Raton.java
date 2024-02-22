package com.inventariospc;

public class Raton extends DispositivosDeEntrada {
    private final int idRaton;
    private  static int contadorRatones;


    public Raton(String tipoDeEntrada, String marca){
        super(tipoDeEntrada, marca);
        this.idRaton = ++ Raton.contadorRatones;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Raton{");
        sb.append("idRaton=").append(idRaton);
        sb.append(",").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
