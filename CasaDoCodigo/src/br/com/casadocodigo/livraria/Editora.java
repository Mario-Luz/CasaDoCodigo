package br.com.casadocodigo.livraria;

/**
 * Classe que representa uma Editora com informações básicas.
 */
public class Editora {
    private final String nomeFantasia;
    private final String razaoSocial;
    private final String cnpj;

    /**
     * Construtor para criar uma instância de Editora.
     *
     * @param nomeFantasia o nome fantasia da editora
     * @param razaoSocial  a razão social da editora
     * @param cnpj         o CNPJ da editora
     * @throws IllegalArgumentException se algum parâmetro for inválido
     */
    public Editora(String nomeFantasia, String razaoSocial, String cnpj) {
        if (nomeFantasia == null || nomeFantasia.isEmpty()) {
            throw new IllegalArgumentException("Nome fantasia não pode ser nulo ou vazio.");
        }
        if (razaoSocial == null || razaoSocial.isEmpty()) {
            throw new IllegalArgumentException("Razão social não pode ser nula ou vazia.");
        }
        if (cnpj == null || cnpj.isEmpty() || !isValidCnpj(cnpj)) {
            throw new IllegalArgumentException("CNPJ inválido.");
        }
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
    }

    /**
     * Valida o CNPJ.
     *
     * @param cnpj o CNPJ a ser validado
     * @return true se o CNPJ for válido, caso contrário false
     */
    private boolean isValidCnpj(String cnpj) {
        // Implementação completa para validação de CNPJ
        // Aqui você pode usar uma biblioteca externa ou implementar a lógica completa
        return cnpj.matches("\\d{14}");
    }

    /**
     * Obtém o nome fantasia da editora.
     *
     * @return o nome fantasia
     */
    public String getNomeFantasia() {
        return nomeFantasia;
    }

    /**
     * Obtém a razão social da editora.
     *
     * @return a razão social
     */
    public String getRazaoSocial() {
        return razaoSocial;
    }

    /**
     * Obtém o CNPJ da editora.
     *
     * @return o CNPJ
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * Retorna uma representação em string da editora.
     *
     * @return uma string representando a editora
     */
    @Override
    public String toString() {
        return String.format("Editora [Nome Fantasia: %s, Razão Social: %s, CNPJ: %s]",
                nomeFantasia, razaoSocial, cnpj);
    }
}