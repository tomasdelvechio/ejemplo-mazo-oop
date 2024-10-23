package ar.edu.unlu.poo;

public class CartaAccion extends Carta {
    public CartaAccion(Color color, TipoDeCarta tipo) {
        super(color, tipo);
        if (tipo != TipoDeCarta.BLOQUEO && tipo != TipoDeCarta.REVERSO && tipo != TipoDeCarta.TOMA2) {
            throw new IllegalArgumentException("Tipo de acción invalido");
        }
    }

}
