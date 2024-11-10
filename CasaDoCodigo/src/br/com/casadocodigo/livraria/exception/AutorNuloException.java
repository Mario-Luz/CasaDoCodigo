package br.com.casadocodigo.livraria.exception;

import java.io.Serializable;

/**
 * Exceção lançada quando um autor nulo é encontrado.
 */
public class AutorNuloException extends RuntimeException implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * Cria uma nova instância de AutorNuloException com uma mensagem especificada.
     *
     * @param mensagem a mensagem detalhada da exceção
     */
    public AutorNuloException(String mensagem) {
        super(mensagem);
    }

    /**
     * Cria uma nova instância de AutorNuloException com uma mensagem e uma causa especificadas.
     *
     * @param mensagem a mensagem detalhada da exceção
     * @param causa    a causa da exceção
     */
    public AutorNuloException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }

    /**
     * Cria uma nova instância de AutorNuloException com uma causa especificada.
     *
     * @param causa a causa da exceção
     */
    public AutorNuloException(Throwable causa) {
        super(causa);
    }
}