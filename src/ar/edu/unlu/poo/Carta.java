package ar.edu.unlu.poo;

public abstract class Carta {
    protected final Color color;
    protected final TipoDeCarta tipo;

    public Carta(Color color, TipoDeCarta tipo) {
        this.color = color;
        this.tipo = tipo;
    }

    public Color getColor() {
        return color;
    }

    public TipoDeCarta getTipo() {
        return tipo;
    }

}
