package br.com.casadocodigo.livraria.produtos;

import br.com.casadocodigo.livraria.Autor;

public class LivroFisico extends Livro implements Promocional {

    private static final double TAXA_IMPRESSAO = 0.05;
    private static final double DESCONTO_MAXIMO = 0.3;

    public LivroFisico(Autor autor) {
        super(autor);
    }

    public double getTaxaImpressao() {
        return calcularTaxaImpressao();
    }

    private double calcularTaxaImpressao() {
        return getValor() * TAXA_IMPRESSAO;
    }

    @Override
    public boolean aplicaDescontoDe(double porcentagem) {
        if (!isDescontoValido(porcentagem)) {
            System.out.println("Desconto inválido para Livro Físico");
            return false;
        }
        aplicarDesconto(porcentagem);
        System.out.println("Desconto aplicado no Livro Físico");
        return true;
    }

    private boolean isDescontoValido(double porcentagem) {
        return porcentagem >= 0 && porcentagem <= DESCONTO_MAXIMO;
    }

    private void aplicarDesconto(double porcentagem) {
        double desconto = getValor() * porcentagem;
        setValor(getValor() - desconto);
    }
}