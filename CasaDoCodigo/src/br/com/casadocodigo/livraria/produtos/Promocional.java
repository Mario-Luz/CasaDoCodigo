package br.com.casadocodigo.livraria.produtos;

/**
 * Interface que define o comportamento promocional para produtos.
 * Permite a aplicação de descontos em produtos que implementam esta interface.
 */
public interface Promocional {

    /**
     * Aplica um desconto ao produto com base na porcentagem fornecida.
     * A implementação deve garantir que a porcentagem de desconto seja válida.
     *
     * @param porcentagem a porcentagem de desconto a ser aplicada, entre 0 e 1.
     * @return true se o desconto foi aplicado com sucesso, false caso contrário.
     */
    boolean aplicaDescontoDe(double porcentagem);

    /**
     * Aplica um desconto padrão de 10% ao produto.
     * Este método utiliza o método {@link #aplicaDescontoDe(double)} para aplicar o desconto.
     *
     * @return true se o desconto de 10% foi aplicado com sucesso, false caso contrário.
     */
    default boolean aplicaDescontoDe10Porcento() {
        return aplicaDescontoDe(0.1);
    }
}