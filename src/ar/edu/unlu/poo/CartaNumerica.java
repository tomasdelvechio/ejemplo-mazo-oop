package ar.edu.unlu.poo;

public class CartaNumerica extends Carta {
    private final int numero;

    public CartaNumerica(Color color, int numero) {
        super(color, TipoDeCarta.NUMERICA);
        if (numero < 0 || numero > 12) {
            throw new IllegalArgumentException("Número de carta invalido");
        }
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

}
