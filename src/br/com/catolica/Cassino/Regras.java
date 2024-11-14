package br.com.catolica.Cassino;

import interfaces.Dono;

public class Regras implements Dono {

    private int idadeMinima;


    public void setIdade(int idade) {

        this.idadeMinima = idade;
    }


    public boolean entrada() {
        System.out.println("Pode entrar com bebida no Cassino ?");
        return false;
    }


    public int getIdadeMinima() {
        return idadeMinima = 18;
    }


    public void detalhesDaRegra() {
        System.out.println("A idade minimar para a postar é = " + getIdadeMinima());
        System.out.println(entrada());
    }
}