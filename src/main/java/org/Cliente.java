package org;

public class Cliente extends LojaVirtual{
    private static Cliente cliente = new Cliente();

    private Cliente() {};

    public static Cliente getInstancia() {
        return cliente;
    }
}