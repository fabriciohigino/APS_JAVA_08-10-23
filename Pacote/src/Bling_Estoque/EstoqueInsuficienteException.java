package Bling_Estoque;

/**
 * Exceção lançada quando a quantidade em estoque de um produto é insuficiente.
 */
public class EstoqueInsuficienteException extends Exception {

    /**
     * Construtor para criar uma instância de EstoqueInsuficienteException com uma mensagem específica.
     *
     * @param mensagem A mensagem detalhando da exceção.
     */
    public EstoqueInsuficienteException(String mensagem) {
        super(mensagem);
    }
}
