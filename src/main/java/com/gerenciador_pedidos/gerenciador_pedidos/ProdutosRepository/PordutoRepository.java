package com.gerenciador_pedidos.gerenciador_pedidos.ProdutosRepository;

import com.gerenciador_pedidos.gerenciador_pedidos.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PordutoRepository extends JpaRepository<Produto, Long> {
}

public interface List<Produto> findByNome(String nome){
}
