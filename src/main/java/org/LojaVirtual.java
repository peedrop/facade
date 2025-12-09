package org;

import java.util.ArrayList;
import java.util.List;

public abstract class LojaVirtual {
    private List<Pedido> pedidoComPendencia = new ArrayList<Pedido>();

    public void addPedidoPendente(Pedido pedido) {
        this.pedidoComPendencia.add(pedido);
    }

    public boolean verificarPedidoComPendencia(Pedido pedido) {
        return this.pedidoComPendencia.contains(pedido);
    }
}
