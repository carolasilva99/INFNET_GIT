package br.com.carolina.bibliotecaat.model.tests;

import br.com.carolina.bibliotecaat.model.domain.Reserva;
import br.com.carolina.bibliotecaat.model.domain.Solicitante;
import br.com.carolina.bibliotecaat.model.domain.exceptions.SolicitanteNaoInformadoException;

public class ReservaTeste {
    public static void main(String[] args) {
        try {
            Solicitante solicitante = new Solicitante("Carolina", "carolina@carolina.com",
                    "(31) 983728-1829");

            Reserva reserva1 = new Reserva();
            reserva1.setSolicitante(solicitante);
            reserva1.setObservacao("Primeira reserva");
            System.out.println("Reserva: " + reserva1);

            Reserva reserva2 = new Reserva("Reserva da Carol");
            reserva2.setSolicitante(null);
            System.out.println("Reserva: " + reserva2);
        } catch (SolicitanteNaoInformadoException e) {
            System.out.println(e.getMessage());
        }

    }
}
