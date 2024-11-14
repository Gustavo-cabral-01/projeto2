package br.com.catolica.Cassino;

import enums.Fichas;
import enums.LimiteDeJogadores;

import enums.ModoDeJogo;

public class BlackJack {
    private Fichas fichas;
    private ModoDeJogo modoDeJogo;
    private LimiteDeJogadores limiter;

    
    public BlackJack(Fichas fichas, ModoDeJogo modoDeJogo, LimiteDeJogadores limiter) {
        this.fichas = fichas;
        this.modoDeJogo = modoDeJogo;
        this.limiter = limiter;
    }

    public Fichas getFichas() {

        return fichas;
    }

    public ModoDeJogo getModoDeJogo() {

        return modoDeJogo;
    }


    public int getValorDaFicha() {

        return fichas.getValor();

    }

    public int getLimiterr() {
        return limiter.getValorr();
    }
}


