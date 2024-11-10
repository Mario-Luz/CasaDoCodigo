package br.com.casadocodigo.livraria.produtos;

import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.exception.AutorNuloException;

public class Livro implements Produto {

    private String nome;
    private String descricao;
    private double valor;
    private String isbn;
    private Autor autor;

    public Livro(Autor autor) {
        setAutor(autor);
        this.isbn = "000-00-00000-00-0";
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

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        validarString(isbn, "ISBN");
        this.isbn = isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        if (autor == null) {
            throw new AutorNuloException("Selecione um Autor");
        }
        this.autor = autor;
    }

    @Override
    public boolean aplicaDescontoDe(double v) {
        return false;
    }

    public void mostrarDetalhes() {
        StringBuilder detalhes = new StringBuilder();
        detalhes.append("Mostrando detalhes do livro:\n")
                .append("Nome: ").append(nome).append("\n")
                .append("Descrição: ").append(descricao).append("\n")
                .append("Valor: ").append(valor).append("\n")
                .append("ISBN: ").append(isbn).append("\n")
                .append("Autor: ").append(autor != null ? autor.getNome() : "Autor Desconhecido").append("\n")
                .append("--");
        System.out.println(detalhes.toString());
    }

    private void validarString(String valor, String campo) {
        if (valor == null || valor.trim().isEmpty()) {
            throw new IllegalArgumentException(campo + " não pode ser vazio ou nulo.");
        }
    }
}