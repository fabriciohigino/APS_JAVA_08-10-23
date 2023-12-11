package Bling_Estoque;

/**
 * @author Fabricio Rodrigues e Gilson Miranda 
 * 
 * A classe abstrata Produto.
 * Esta classe serve como base para classes mais específicas de produtos.
 */
public abstract class Produto {
    
	/**
     * O nome do produto.
     */
    protected String nome;
    
    /**
     * O preço do produto.
     */
    protected double preco;
    
    /**
     * A quantidade em estoque do produto.
     */
    protected int quantEstoque;

    /**
     * Construtor para inicializar de um objeto.
     *
     * @param nome         O nome do produto.
     * @param preco        O preço do produto.
     * @param quantEstoque A quantidade em estoque do produto.
     */
    public Produto(String nome, double preco, int quantEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantEstoque = quantEstoque;
    }

    /**
     * Obtém o nome do produto.
     *
     * @return O nome do produto.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do produto.
     *
     * @param O nome do produto.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém o preço do produto.
     *
     * @return O preço do produto.
     */
    public double getPreco() {
        return preco;
    }

    /**
     * Define o preço do produto.
     *
     * @param preco O preço do produto.
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }

    /**
     * Obtém a quantidade em estoque do produto.
     *
     * @return A quantidade em estoque do produto.
     */
    public int getQuantEstoque() {
        return quantEstoque;
    }

    /**
     * Define a quantidade em estoque do produto.
     *
     * @param quantEstoque A nova quantidade em estoque do produto.
     */
    public void setQuantEstoque(int quantEstoque) {
        this.quantEstoque = quantEstoque;
    }
}
