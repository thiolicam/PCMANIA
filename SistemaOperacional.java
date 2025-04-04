package br.inatel.pcmania.model;

public class SistemaOperacional {
    public String nome;
    public int tipo; // 32 ou 64 bits

    public SistemaOperacional(String nome, int tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public void mostraInfo() {
        System.out.println("  - Sistema Operacional: " + nome + " - " + tipo + " bits");
    }
}