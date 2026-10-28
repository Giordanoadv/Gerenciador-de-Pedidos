package com.gerenciador_pedidos.gerenciador_pedidos;

import com.gerenciador_pedidos.gerenciador_pedidos.CategoriaRepository.CategoriaRepository;
import com.gerenciador_pedidos.gerenciador_pedidos.PedidosRepository.PedidosRepository;
import com.gerenciador_pedidos.gerenciador_pedidos.ProdutosRepository.PordutoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class GerenciadorPedidosApplication implements CommandLineRunner {


	private final CategoriaRepository categoriaRepository;
	private final PedidosRepository pedidosRepository;
	private final PordutoRepository produtoRepository;

    public GerenciadorPedidosApplication(CategoriaRepository categoriaRepository, PedidosRepository pedidosRepository, PedidosRepository pedidosRepository2, PordutoRepository ordutoRepository) {
        this.categoriaRepository = categoriaRepository;
        this.pedidosRepository = pedidosRepository;
		this.produtoRepository = ordutoRepository;
    }



	@Override
	public void run(String... args) throws Exception {

		Categoria categoria = new Categoria();
		categoria.setNome("Informática");
		categoriaRepository.save(categoria);





		Pedido pedido = new Pedido();
		pedido.setDate(LocalDate.now());
		pedidosRepository.save(pedido);





		Produto produto = new Produto();
		produto.setPreco(1200);
		produto.setNome("Monitor");


		System.out.println("Categoria: " + categoria.getNome() + "Produto: " + produto.getNome() + "Pedido" + pedido.getDate() + "salvo" );



	}

	public static void main(String[] args) {
		SpringApplication.run(GerenciadorPedidosApplication.class, args);


	}

}
