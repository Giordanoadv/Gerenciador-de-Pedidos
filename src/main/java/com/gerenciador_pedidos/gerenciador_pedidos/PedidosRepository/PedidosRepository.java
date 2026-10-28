package com.gerenciador_pedidos.gerenciador_pedidos.PedidosRepository;

import com.gerenciador_pedidos.gerenciador_pedidos.Pedido;
import com.gerenciador_pedidos.gerenciador_pedidos.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidosRepository extends JpaRepository<Pedido, Long> {
}
