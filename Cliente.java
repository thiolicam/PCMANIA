package br.inatel.pcmania.cliente;

import br.inatel.pcmania.model.Computador;

public class Cliente {
    public String nome;
    public String cpf;
    public Computador[] computadores;
    public int contador;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.computadores = new Computador[10];
        this.contador = 0;
    }

    public void comprar(Computador c) {
        if (contador < computadores.length) {
            computadores[contador++] = c;
        }
    }

    public void mostraCompra() {
        System.out.println("Cliente: " + nome + " | CPF: " + cpf);
        double total = 0;
        for (int i = 0; i < contador; i++) {
            System.out.println("\nComputador " + (i + 1) + ":");
            computadores[i].mostraPCConfig();
            total += computadores[i].preco;
        }
        System.out.println("\nTOTAL DA COMPRA: R$" + total);
    }
}