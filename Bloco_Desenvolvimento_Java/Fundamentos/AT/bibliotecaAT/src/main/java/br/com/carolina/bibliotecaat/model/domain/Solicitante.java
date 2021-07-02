package br.com.carolina.bibliotecaat.model.domain;

public class Solicitante {
    private String nome;
    private String email;
    private String telefone;

    public Solicitante(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.nome);
        stringBuilder.append(";");
        stringBuilder.append(this.email);
        stringBuilder.append(";");
        stringBuilder.append(this.telefone);

        return stringBuilder.toString();
    }
}
