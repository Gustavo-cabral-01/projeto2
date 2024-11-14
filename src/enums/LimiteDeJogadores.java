package enums;

public enum LimiteDeJogadores {

    MAXIMO(10);

    private final int valor;

    LimiteDeJogadores(int valor) {
        this.valor = valor;
    }

    public int getValorr() {
        return valor;
    }
}
