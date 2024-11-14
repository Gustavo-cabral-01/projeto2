package br.com.catolica.Cassino;

public abstract class Jogos {
    double EntradaMinimar;
    double EntradaMaxima;


    public  Jogos(double EntradaMinimar, double EntradaMaxima) {
        this.EntradaMinimar = EntradaMinimar;
        this.EntradaMaxima = EntradaMaxima;

    }


    public String detalhes() {
        return  "Jogos{" +
                "EntradaMinimar=" + EntradaMinimar +
                ", EntradaMaxima=" + EntradaMaxima +
                '}';
    }

}