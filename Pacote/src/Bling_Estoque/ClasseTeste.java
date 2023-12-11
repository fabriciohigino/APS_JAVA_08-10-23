package Bling_Estoque;

public class ClasseTeste {

    public static void main(String[] args) {

    Alimento n1 = new Alimento("Arroz", 5.99, 100, "Fortaleza");

    n1.comprar(10);
    System.out.println(n1.quantEstoque);
    n1.vender(50);
        System.out.println(n1.quantEstoque);

}
}