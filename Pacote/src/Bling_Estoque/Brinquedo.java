package Bling_Estoque;

/**
 * Classe que representa um produto do tipo Brinquedo, estendendo a classe
 * abstrata Produto e implementando a interface Vendavel.
 */
public class Brinquedo extends Produto implements Vendavel {

	/**
	 * O material do brinquedo.
	 */
	private String material;

	/**
	 * Construtor para criar uma instância de Brinquedo.
	 *
	 * @param nome         O nome do brinquedo.
	 * @param preco        O preço do brinquedo.
	 * @param quantEstoque A quantidade em estoque do brinquedo.
	 * @param material     O material do brinquedo.
	 */
	public Brinquedo(String nome, double preco, int quantEstoque, String material) {
		super(nome, preco, quantEstoque);
		this.material = material;
	}

	/**
	 * Obtém o material do brinquedo.
	 *
	 * @return O material do brinquedo.
	 */
	public String getMaterial() {
		return material;
	}

	/**
	 * Define o material do brinquedo.
	 *
	 * @param material O novo material do brinquedo.
	 */
	public void setMaterial(String material) {
		this.material = material;
	}

	/**
	 * Vende uma quantidade específica de brinquedos, lançando uma exceção se a
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
		//System.out.println("-Venda Concluida-");
		setQuantEstoque(getQuantEstoque() - quantidade);
	}

	/**
	 * Vende uma quantidade específica de brinquedos.
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
	 * Retorna uma representação em formato de string do objeto Brinquedo.
	 *
	 * @return Uma string representando o objeto Brinquedo.
	 */
	@Override
	public String toString() {
		return "Brinquedo material:" + material + ", nome:" + nome + ", preco:" + preco + ", quantEmEstoque:"
				+ quantEstoque;
	}

	@Override
	public void comprar(int quantidade) {
		setQuantEstoque(getQuantEstoque()+quantidade);
	}
}
