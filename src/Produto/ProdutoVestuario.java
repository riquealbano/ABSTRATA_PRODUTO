package Produto;

// Classe ProdutoVestuario se extende da classe Produto
public class ProdutoVestuario extends Produto {
    private String tamanho; // Atributo exclusivo

    public ProdutoVestuario(String nome, double precoCusto, double precoVenda, String tamanho) {
        super(nome, precoCusto, precoVenda);
        this.tamanho = tamanho;
    }

    // Sobrescrever o método ja salvo
    @Override
    public void salvar() {
    	System.out.println("Produto de Vestuário salvo.");
    	}

    @Override
    public void deletar() {
    	System.out.println("Produto de Vestuário deletado.");
    	}

    @Override
    public void atualizar() {
    	System.out.println("Produto de Vestuário atualizado.");
    	}

    // Getter e Setter
    public String getTamanho() {
    	return tamanho;
    	}
    public void setTamanho(String tamanho) {
    	this.tamanho = tamanho;
    	}
}
