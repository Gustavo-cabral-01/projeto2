package enums;

public enum Fichas {
    FICHA_BRANCA(5),
    FICHA_VERMELHA(10);

    private final int valor;


    Fichas(int valor) {
        this.valor = valor;
    }


    public int getValor() {
        return valor;
    }
}

