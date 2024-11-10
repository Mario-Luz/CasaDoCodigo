package br.com.casadocodigo.livraria.teste;

import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.produtos.Ebook;
import br.com.casadocodigo.livraria.produtos.Livro;
import br.com.casadocodigo.livraria.produtos.MiniLivro;

public class RegrasDeDesconto {

    public static void main(String[] args) {
        Autor autor = criarAutor("Mario Luz");

        Livro miniLivro = criarMiniLivro(autor, 39.90);
        aplicarDesconto(miniLivro, 0.3, "livro", 0.3);

        Ebook ebook = criarEbook(autor, 29.90);
        aplicarDesconto(ebook, 0.15, "ebook", 0.15);
    }

    private static Autor criarAutor(String nome) {
        Autor autor = new Autor();
        autor.setNome(nome);
        return autor;
    }

    private static Livro criarMiniLivro(Autor autor, double valor) {
        Livro miniLivro = new MiniLivro(autor);
        miniLivro.setValor(valor);
        return miniLivro;
    }

    private static Ebook criarEbook(Autor autor, double valor) {
        Ebook ebook = new Ebook(autor);
        ebook.setValor(valor);
        return ebook;
    }

    private static void aplicarDesconto(Livro livro, double porcentagem, String tipo, double maxDesconto) {
        if (!livro.aplicaDescontoDe(porcentagem)) {
            System.out.printf("Desconto do %s não pode ser maior do que %.0f%%%n", tipo, maxDesconto * 100);
        } else {
            System.out.printf("Valor do %s com desconto: %.2f%n", tipo, livro.getValor());
        }
    }
}