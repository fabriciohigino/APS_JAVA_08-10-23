package Bling_Estoque;

/**
 * A interface Vendavel define métodos relacionados à venda de produtos.
 */
public interface Vendavel {

    /**
     * Vende uma quantidade específica do produto, lançando uma exceção se a quantidade em estoque for insuficiente.
     *
     * @param quantidade A quantidade a ser vendida.
     * @throws EstoqueInsuficienteException Se a quantidade em estoque for insuficiente para a venda.
     */
    void venderException(int quantidade) throws EstoqueInsuficienteException;

    /**
     * Vende uma quantidade específica do produto.
     *
     * @param quantidade A quantidade a ser vendida.
     */
    void vender(int quantidade);
}
