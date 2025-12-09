package org;

public class Endereco extends LojaVirtual{
    private static Endereco endereco = new Endereco();

    private Endereco() {};

    public static Endereco getInstancia() {
        return endereco;
    }
}