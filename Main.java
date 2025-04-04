package br.inatel.pcmania.main;

import br.inatel.pcmania.model.*;
import br.inatel.pcmania.cliente.Cliente;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cliente cliente = new Cliente("João Silva", "123.456.789-00");
        int matricula = 9664;

        Computador[] promocoes = new Computador[3];

        Computador c1 = new Computador("Apple", matricula);
        c1.adicionaHardware(new HardwareBasico("Pentium Core i3", 2200), 0);
        c1.adicionaHardware(new HardwareBasico("Memória RAM", 8), 1);
        c1.adicionaHardware(new HardwareBasico("HD", 500), 2);
        c1.sistema = new SistemaOperacional("Linux Ubuntu", 32);
        c1.memoriaUSB = new MemoriaUSB("Pen-drive", 16);
        promocoes[0] = c1;

        Computador c2 = new Computador("Samsung", matricula + 1234);
        c2.adicionaHardware(new HardwareBasico("Pentium Core i5", 3370), 0);
        c2.adicionaHardware(new HardwareBasico("Memória RAM", 16), 1);
        c2.adicionaHardware(new HardwareBasico("HD", 1000), 2);
        c2.sistema = new SistemaOperacional("Windows 8", 64);
        c2.memoriaUSB = new MemoriaUSB("Pen-drive", 32);
        promocoes[1] = c2;

        Computador c3 = new Computador("Dell", matricula + 5678);
        c3.adicionaHardware(new HardwareBasico("Pentium Core i7", 4500), 0);
        c3.adicionaHardware(new HardwareBasico("Memória RAM", 32), 1);
        c3.adicionaHardware(new HardwareBasico("HD", 2000), 2);
        c3.sistema = new SistemaOperacional("Windows 10", 64);
        c3.memoriaUSB = new MemoriaUSB("HD Externo", 1000);
        promocoes[2] = c3;

        int opcao;
        do {
            System.out.println("\nDigite a promoção desejada (1, 2, 3) ou 0 para sair: ");
            opcao = sc.nextInt();
            if (opcao >= 1 && opcao <= 3) {
                cliente.comprar(promocoes[opcao - 1]);
                System.out.println("Computador adicionado ao carrinho!\n");
            }
        } while (opcao != 0);

        cliente.mostraCompra();
        sc.close();
    }
}