package Produto;

// Classe ProdutoAlimenticio se extende da classe Produto
public class ProdutoAlimenticio extends Produto {
    private String dataValidade; // Atributo exclusivo

    public ProdutoAlimenticio(String nome, double precoCusto, double precoVenda, String dataValidade) {
        super(nome, precoCusto, precoVenda);
        this.dataValidade = dataValidade;
    }

    // Sobrescrever o método ja salvo
    @Override
    public void salvar() {
    	System.out.println("Produto Alimentício salvo.");
    	}

    @Override
    public void deletar() {
    	System.out.println("Produto Alimentício deletado.");
    	}

    @Override
    public void atualizar() {
    	System.out.println("Produto Alimentício atualizado.");
    	}

    // Getter e Setter
    public String getDataValidade() {
    	return dataValidade;
    	}
    public void setDataValidade(String dataValidade) {
    	this.dataValidade = dataValidade;
    	}
}
