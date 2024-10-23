package ar.edu.unlu.poo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MazoUno {
    private final List<Carta> cartas;

    public MazoUno() {
        this.cartas = new ArrayList<>();
        iniciarMazo();
        mezclar(); // podria no estar acá si se lo quiere mezclar de afuera
    }

    /**
     * Este método seria el mas cercano a tu método "mezclar"
     */
    private void iniciarMazo() {
        for (Color color : Arrays.asList(Color.ROJO, Color.AZUL, Color.VERDE, Color.AMARILLO)) {
            // De la carta cero hay una por color
            cartas.add(new CartaNumerica(color, 0));

            // Dos cartas de cada número del 1-12 por color
            for (int numero = 1; numero <= 12; numero++) {
                cartas.add(new CartaNumerica(color, numero));
                cartas.add(new CartaNumerica(color, numero));
            }

            // Dos cartas de cada tipo de acción por color
            for (int i = 0; i < 2; i++) {
                cartas.add(new CartaAccion(color, TipoDeCarta.BLOQUEO));
                cartas.add(new CartaAccion(color, TipoDeCarta.REVERSO));
                cartas.add(new CartaAccion(color, TipoDeCarta.TOMA2));
            }
        }

        // Agregar cartas especiales
        for (int i = 0; i < 4; i++) {
            cartas.add(new CartaEspecial(TipoDeCarta.COMODIN));
            cartas.add(new CartaEspecial(TipoDeCarta.COMODINTOMA4));
        }
    }

    public List<Carta> getCartas() {
        return new ArrayList<>(cartas);  // Retorna una copia para encapsulación
    }

    public void mezclar() {
        Collections.shuffle(cartas);
    }

}
