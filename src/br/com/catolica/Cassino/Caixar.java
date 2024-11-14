package br.com.catolica.Cassino;

import interfaces.Pagamento;

public class Caixar implements Pagamento {
    private int depositorminimor;
    private int saquerminimor;



    public void setdepositor(int depositor) {
        this.depositorminimor = depositor;
    }


    public void setsaquer(int saquer) {
        this.saquerminimor = saquer;

    }


    public int getDepositorminimor() {
        return depositorminimor = 10;
    }

    public int getSaquerminimor() {
        return saquerminimor = 30;
    }

    public void pagamentos(){
        System.out.println("O depositor minimor é = " + getDepositorminimor());
        System.out.println("saquer minimor é = " + getSaquerminimor());
    }


}
