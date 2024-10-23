package ar.edu.unlu.poo;

public class CartaEspecial extends Carta {
    public CartaEspecial(TipoDeCarta tipoDeCarta) {
        super(Color.ESPECIAL, tipoDeCarta);
        if (tipoDeCarta != TipoDeCarta.COMODINTOMA4 && tipoDeCarta != TipoDeCarta.COMODIN) {
            throw new IllegalArgumentException("Tipo de Carta invalido");
        }
    }
}
