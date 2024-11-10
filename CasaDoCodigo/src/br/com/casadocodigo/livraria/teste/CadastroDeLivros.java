package br.com.casadocodigo.livraria.teste;

import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.produtos.Ebook;
import br.com.casadocodigo.livraria.produtos.Livro;
import br.com.casadocodigo.livraria.produtos.LivroFisico;

public class CadastroDeLivros {

    public static void main(String[] args) {
        Autor autor1 = new Autor("Mario Luz", "marioluz@caelum.com.br", "12345678910");
        Livro livro1 = criarLivroFisico(autor1, "Java 8 Prático", "Novos recursos da linguagem", 59.90, "978-85-66250-46-6");
        livro1.mostrarDetalhes();

        Autor autor2 = new Autor("Paulo Silveira", "paulo.silveira@caelum.com.br", "12345678910");
        Livro livro2 = criarEbook(autor2, "Lógica de Programação", "Crie seus primeiros programas", 59.90, "978-85-66250-22-0");
        livro2.mostrarDetalhes();
    }

    private static Livro criarLivroFisico(Autor autor, String nome, String descricao, double valor, String isbn) {
        Livro livro = new LivroFisico(autor);
        livro.setNome(nome);
        livro.setDescricao(descricao);
        livro.setValor(valor);
        livro.setIsbn(isbn);
        return livro;
    }

    private static Livro criarEbook(Autor autor, String nome, String descricao, double valor, String isbn) {
        Livro livro = new Ebook(autor);
        livro.setNome(nome);
        livro.setDescricao(descricao);
        livro.setValor(valor);
        livro.setIsbn(isbn);
        return livro;
    }
}