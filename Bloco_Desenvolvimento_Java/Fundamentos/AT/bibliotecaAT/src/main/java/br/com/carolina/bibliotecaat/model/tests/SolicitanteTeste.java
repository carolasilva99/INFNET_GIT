package br.com.carolina.bibliotecaat.model.tests;

import br.com.carolina.bibliotecaat.model.domain.Solicitante;

public class SolicitanteTeste {
    public static void main(String[] args) {
        Solicitante solicitante = new Solicitante("Carol", "carol@carol.com", "(31)3272-3213");
        System.out.println("Solicitante: " + solicitante);
    }
}
