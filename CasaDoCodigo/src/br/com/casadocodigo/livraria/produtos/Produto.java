package br.com.casadocodigo.livraria.produtos;

/**
 * Interface que representa um produto na livraria.
 * Define operações básicas que todos os produtos devem implementar.
 */
public interface Produto {

    /**
     * Obtém o valor atual do produto.
     *
     * @return o valor monetário do produto.
     */
    double getValor();

    /**
     * Aplica um desconto ao produto com base na porcentagem fornecida.
     * A implementação deve garantir que a porcentagem de desconto seja válida.
     *
     * @param porcentagem a porcentagem de desconto a ser aplicada, entre 0 e 1.
     * @return true se o desconto foi aplicado com sucesso, false caso contrário.
     */
    boolean aplicaDescontoDe(double porcentagem);
}