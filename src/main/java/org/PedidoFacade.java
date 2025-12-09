package org;

public class PedidoFacade {
    public static boolean verificarPendenciaConfirmacao(Pedido pedido) {
        if (Endereco.getInstancia().verificarPedidoComPendencia(pedido)) {
            return false;
        }
        if (Cartao.getInstancia().verificarPedidoComPendencia(pedido)) {
            return false;
        }
        if (Cliente.getInstancia().verificarPedidoComPendencia(pedido)) {
            return false;
        }
        return true;
    }
}