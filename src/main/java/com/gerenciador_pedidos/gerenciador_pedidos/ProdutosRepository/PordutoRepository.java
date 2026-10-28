package com.gerenciador_pedidos.gerenciador_pedidos.ProdutosRepository;

import com.gerenciador_pedidos.gerenciador_pedidos.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PordutoRepository extends JpaRepository<Produto, Long> {
}
