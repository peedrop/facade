import org.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {
    @Test
    void deveRetornarPendenciaClientePedido() {
        Pedido pedido = new Pedido();
        Cliente.getInstancia().addPedidoPendente(pedido);

        assertEquals(false, pedido.confirmar());
    }

    @Test
    void deveRetornarPendenciaEnderecoPedido() {
        Pedido pedido = new Pedido();
        Endereco.getInstancia().addPedidoPendente(pedido);

        assertEquals(false, pedido.confirmar());
    }

    @Test
    void deveRetornarPendenciaCartaoPedido() {
        Pedido pedido = new Pedido();
        Cartao.getInstancia().addPedidoPendente(pedido);

        assertEquals(false, pedido.confirmar());
    }

    @Test
    void deveRetornarpedidoSemPendenciaPedido() {
        Pedido pedido = new Pedido();

        assertEquals(true, pedido.confirmar());
    }

}