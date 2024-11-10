package br.com.casadocodigo.livraria.teste;

import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.produtos.CarrinhoDeCompras;
import br.com.casadocodigo.livraria.produtos.Ebook;
import br.com.casadocodigo.livraria.produtos.LivroFisico;
import br.com.casadocodigo.livraria.produtos.Produto;

import java.util.List;

public class RegistroDeVendas {

    public static void main(String[] args) {
        Autor autor = criarAutor("Mauricio Aniche", "mauricio.aniche@caelum.com.br", "12345678910");

        LivroFisico fisico = criarLivroFisico(autor, "Test-Driven Development", 59.90);
        aplicarDesconto(fisico, 0.10);

        Ebook ebook = criarEbook(autor, "Test-Driven Development", 29.90);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adiciona(fisico);
        carrinho.adiciona(ebook);

        System.out.println("Total: " + carrinho.getTotal());

        imprimirValoresProdutos(carrinho.getProdutos());

        System.out.println("Foi executado");
    }

    private static void imprimirValoresProdutos(List<Produto> produtos) {
    }

    private static Autor criarAutor(String nome, String email, String cpf) {
        return new Autor(nome, email, cpf);
    }

    private static LivroFisico criarLivroFisico(Autor autor, String nome, double valor) {
        LivroFisico livro = new LivroFisico(autor);
        livro.setNome(nome);
        livro.setValor(valor);
        return livro;
    }

    private static Ebook criarEbook(Autor autor, String nome, double valor) {
        Ebook ebook = new Ebook(autor);
        ebook.setNome(nome);
        ebook.setValor(valor);
        return ebook;
    }

    private static void aplicarDesconto(LivroFisico livro, double porcentagem) {
        if (livro.aplicaDescontoDe(porcentagem)) {
            System.out.printf("Valor do livro físico com desconto: %.2f%n", livro.getValor());
        } else {
            System.out.println("Desconto não aplicado.");
        }
    }

    private static void imprimirValoresProdutos(Produto[] produtos) {
        for (Produto produto : produtos) {
            if (produto != null) {
                System.out.printf("Valor do produto: %.2f%n", produto.getValor());
            }
        }
    }
}