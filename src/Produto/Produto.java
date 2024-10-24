package Produto;

public abstract class Produto {
	
	// Atributos da classe Produto
    private String nome; 
    private double precoCusto;
    private double precoVenda;

    // Contrutor Produto
    public Produto(String nome, double precoCusto, double precoVenda) {
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
    }

    public double calcularLucro() {
        return precoVenda - precoCusto;
    }

    // Métodos simulados de banco de dados
    // Todos abstratos
    public abstract void salvar();
    public abstract void deletar();
    public abstract void atualizar();

    // Getters e Setters
    // Senti que ficou mais fácil "codar" usando o get e set
    
    // get e set no Nome
    public String getNome() {
    	return nome; 
    	}
    public void setNome(String nome) { 
    	this.nome = nome; 
    	}
    
    // get e set no PrecoCusto
    public double getPrecoCusto() { 
    	return precoCusto; 
    	}
    public void setPrecoCusto(double precoCusto) { 
    	this.precoCusto = precoCusto; 
    	}

	// get e set no PrecoVenda
    public double getPrecoVenda() { 
    	return precoVenda; 
    	}
    public void setPrecoVenda(double precoVenda) { 
    	this.precoVenda = precoVenda; 
    	}
}
