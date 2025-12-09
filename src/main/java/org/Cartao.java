package org;

public class Cartao extends LojaVirtual{
    private static Cartao cartao = new Cartao();

    private Cartao() {};

    public static Cartao getInstancia() {
        return cartao;
    }
}