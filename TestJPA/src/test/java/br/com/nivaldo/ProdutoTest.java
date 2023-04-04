package br.com.nivaldo;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import br.com.nivaldo.dao.IProdutoDAO;
import br.com.nivaldo.dao.ProdutoDAO;
import br.com.nivaldo.domain.Produto;

public class ProdutoTest {
	private IProdutoDAO produtoDAO;

	public ProdutoTest() {
		produtoDAO = new ProdutoDAO();
	}

	@Test
	public void cadastrar() {
		Produto produto = new Produto();
		produto.setCodigo("A2");
		produto.setDescricao("exemplo");
		produto.setNome("Xbox");
		produto = produtoDAO.cadastrar(produto);

		assertNotNull(produto);
		assertNotNull(produto.getId());
	}
}
