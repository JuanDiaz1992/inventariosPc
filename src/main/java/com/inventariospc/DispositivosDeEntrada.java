package com.inventariospc;

public class DispositivosDeEntrada {
    private String tipoDeEntrada;
    private String marca;
    public DispositivosDeEntrada(String tipoDeEntrada, String marca){
        this.tipoDeEntrada = tipoDeEntrada;
        this.marca = marca;
    }

    public String getTipoDeEntrada() {
        return tipoDeEntrada;
    }

    public void setTipoDeEntrada(String tipoDeEntrada) {
        this.tipoDeEntrada = tipoDeEntrada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DispositivosDeEntrada{");
        sb.append("tipoDeEntrada='").append(tipoDeEntrada).append('\'');
        sb.append(", marca='").append(marca).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
