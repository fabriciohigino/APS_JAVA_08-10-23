package Bling_Estoque;

/**
 * Classe que representa um produto do tipo Alimento, estendendo a classe
 * abstrata Produto e implementando a interface Vendavel.
 */
public class Alimento extends Produto implements Vendavel {

	/**
	 * A marca do alimento.
	 */
	private String marca;

	/**
	 * Construtor para criar uma instância de Alimento.
	 *
	 * @param nome         O nome do alimento.
	 * @param preco        O preço do alimento.
	 * @param quantEstoque A quantidade em estoque do alimento.
	 * @param marca        A marca do alimento.
	 */
	public Alimento(String nome, double preco, int quantEstoque, String marca) {
		super(nome, preco, quantEstoque);
		this.marca = marca;
	}

	/**
	 * Obtém a marca do alimento.
	 *
	 * @return A marca do alimento.
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * Define a marca do alimento.
	 *
	 * @param marca A nova marca do alimento.
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * Vende uma quantidade específica de alimentos, lançando uma exceção se a
	 * quantidade em estoque for insuficiente.
	 *
	 * @param quantidade A quantidade a ser vendida.
	 * @throws EstoqueInsuficienteException Se a quantidade em estoque for
	 *                                      insuficiente para a venda.
	 */
	@Override
	public void venderException(int quantidade) throws EstoqueInsuficienteException {
		if (quantidade > getQuantEstoque()) {
			throw new EstoqueInsuficienteException(
					"Estoque insuficiente: " + quantidade + " unidades de " + getNome());
		}
		setQuantEstoque(getQuantEstoque() - quantidade);
	}

	/**
	 * Vende uma quantidade específica de alimentos.
	 *
	 * @param quantidade A quantidade a ser vendida.
	 */
	@Override
	public void vender(int quantidade) {
		try {
			venderException(quantidade);
			System.out.println("Concluido");
		} catch (EstoqueInsuficienteException e) {
			System.out.println("Erro ao vender produto: " + e.getMessage());
		}
	}

	/**
	 * Retorna uma representação em formato de string do objeto Alimento.
	 *
	 * @return Uma string representando o objeto Alimento.
	 */
	@Override
	public String toString() {
		return "Alimento marca:" + marca + ", nome:" + nome + ", preco:" + preco + ", quantEmEstoque:" + quantEstoque;
	}

	@Override
	public void comprar(int quantidade) {
		setQuantEstoque(getQuantEstoque()+quantidade);
	}
}
