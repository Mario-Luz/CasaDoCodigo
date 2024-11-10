package br.com.casadocodigo.livraria;

import java.util.Objects;
import java.util.Optional;

/**
 * Classe que representa um Autor com nome, email e CPF.
 */
public class Autor {
    private String nome;
    private String email;
    private String cpf;

    /**
     * Construtor para inicializar um objeto Autor com nome, email e CPF.
     *
     * @param nome  Nome do autor, não pode ser nulo ou vazio.
     * @param email Email do autor, deve conter um '@'.
     * @param cpf   CPF do autor, deve ter 11 dígitos.
     */
    public Autor(String nome, String email, String cpf) {
        setNome(nome);
        setEmail(email);
        setCpf(cpf);
    }

    public Autor() {

    }

    /**
     * Obtém o nome do autor.
     *
     * @return o nome do autor
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do autor.
     *
     * @param nome o nome a ser definido, não pode ser nulo ou vazio
     */
    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser nulo ou vazio");
        }
        this.nome = nome;
    }

    /**
     * Obtém o email do autor.
     *
     * @return um Optional contendo o email do autor, se presente
     */
    public Optional<String> getEmail() {
        return Optional.ofNullable(email);
    }

    /**
     * Define o email do autor.
     *
     * @param email o email a ser definido, deve conter um '@'
     */
    public void setEmail(String email) {
        if (email != null && !email.contains("@")) {
            throw new IllegalArgumentException("Email inválido");
        }
        this.email = email;
    }

    /**
     * Obtém o CPF do autor.
     *
     * @return um Optional contendo o CPF do autor, se presente
     */
    public Optional<String> getCpf() {
        return Optional.ofNullable(cpf);
    }

    /**
     * Define o CPF do autor.
     *
     * @param cpf o CPF a ser definido, deve ter 11 dígitos
     */
    public void setCpf(String cpf) {
        if (cpf != null && cpf.length() != 11) {
            throw new IllegalArgumentException("CPF deve ter 11 dígitos");
        }
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return String.format("Autor{nome='%s', email='%s', cpf='%s'}", nome, email, cpf);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Autor autor = (Autor) o;
        return Objects.equals(nome, autor.nome) &&
                Objects.equals(email, autor.email) &&
                Objects.equals(cpf, autor.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, email, cpf);
    }
}