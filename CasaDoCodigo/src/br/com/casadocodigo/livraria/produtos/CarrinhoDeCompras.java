package br.com.casadocodigo.livraria.produtos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Classe que representa um carrinho de compras para armazenar produtos.
 */
public class CarrinhoDeCompras {
    private List<Produto> produtos;

    /**
     * Construtor para inicializar o carrinho de compras.
     */
    public CarrinhoDeCompras() {
        this.produtos = new ArrayList<>();
    }

    /**
     * Adiciona um produto ao carrinho de compras.
     *
     * @param produto o produto a ser adicionado
     * @throws IllegalArgumentException se o produto for nulo
     */
    public void adiciona(Produto produto) {
        if (produto == null) {
            throw new IllegalArgumentException("Produto não pode ser nulo.");
        }
        System.out.println("Adicionando produto: " + produto);
        this.produtos.add(produto);
    }

    /**
     * Remove um produto do carrinho de compras.
     *
     * @param produto o produto a ser removido
     * @return true se o produto foi removido, false caso contrário
     */
    public boolean remove(Produto produto) {
        boolean removed = this.produtos.remove(produto);
        if (removed) {
            System.out.println("Removendo produto: " + produto);
        } else {
            System.out.println("Produto não encontrado no carrinho: " + produto);
        }
        return removed;
    }

    /**
     * Limpa todos os produtos do carrinho de compras.
     */
    public void limpa() {
        this.produtos.clear();
        System.out.println("Carrinho de compras limpo.");
    }

    /**
     * Retorna uma lista imutável de produtos no carrinho.
     *
     * @return lista de produtos
     */
    public List<Produto> getProdutos() {
        return Collections.unmodifiableList(produtos);
    }

    /**
     * Calcula e retorna o valor total dos produtos no carrinho.
     *
     * @return o valor total
     */
    public double getTotal() {
        return produtos.stream().mapToDouble(Produto::getValor).sum();
    }

    /**
     * Retorna uma representação em string do carrinho de compras.
     *
     * @return uma string representando o carrinho
     */
    @Override
    public String toString() {
        return String.format("CarrinhoDeCompras [Total: %.2f, Produtos: %s]", getTotal(), produtos);
    }
}