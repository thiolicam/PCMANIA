package br.inatel.pcmania.model;

public class Computador {
    public String marca;
    public double preco;
    public SistemaOperacional sistema;
    public MemoriaUSB memoriaUSB;
    public HardwareBasico[] hardwares;

    public Computador(String marca, double preco) {
        this.marca = marca;
        this.preco = preco;
        this.hardwares = new HardwareBasico[3];
    }

    public void adicionaHardware(HardwareBasico hw, int pos) {
        if (pos >= 0 && pos < hardwares.length) {
            hardwares[pos] = hw;
        }
    }

    public void mostraPCConfig() {
        System.out.println("Marca: " + marca);
        System.out.println("Preço: R$" + preco);
        for (HardwareBasico hw : hardwares) {
            if (hw != null)
                hw.mostraInfo();
        }
        if (sistema != null) sistema.mostraInfo();
        if (memoriaUSB != null) memoriaUSB.mostraInfo();
        System.out.println();
    }
}