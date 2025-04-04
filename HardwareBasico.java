package br.inatel.pcmania.model;

public class HardwareBasico {
    public String nome;
    public int capacidade;

    public HardwareBasico(String nome, int capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
    }

    public void mostraInfo() {
        System.out.println("  - " + nome + " - " + capacidade);
    }
}