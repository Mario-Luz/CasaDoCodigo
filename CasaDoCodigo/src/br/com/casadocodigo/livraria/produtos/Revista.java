package br.com.casadocodigo.livraria.produtos;

import br.com.casadocodigo.livraria.Editora;

/**
 * Classe que representa uma revista, implementando as interfaces Produto e Promocional.
 * Fornece métodos para manipular informações da revista e aplicar descontos.
 */
public class Revista implements Produto, Promocional {

    private String nome;
    private String descricao;
    private double valor;
    private Editora editora;

    public Revista(String nome, String descricao, double valor, Editora editora) {
        setNome(nome);
        setDescricao(descricao);
        setValor(valor);
        setEditora(editora);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        validarString(nome, "Nome");
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        validarString(descricao, "Descrição");
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Valor não pode ser negativo.");
        }
        this.valor = valor;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        if (editora == null) {
            throw new IllegalArgumentException("Editora não pode ser nula.");
        }
        this.editora = editora;
    }

    @Override
    public boolean aplicaDescontoDe(double porcentagem) {
        if (!isDescontoValido(porcentagem)) {
            return false;
        }
        aplicarDesconto(porcentagem);
        return true;
    }

    private boolean isDescontoValido(double porcentagem) {
        return porcentagem >= 0 && porcentagem <= 0.1;
    }

    private void aplicarDesconto(double porcentagem) {
        double desconto = valor * porcentagem;
        valor -= desconto;
    }

    private void validarString(String valor, String campo) {
        if (valor == null || valor.trim().isEmpty()) {
            throw new IllegalArgumentException(campo + " não pode ser vazio ou nulo.");
        }
    }
}