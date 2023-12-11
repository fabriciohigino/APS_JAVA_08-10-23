package Bling_Estoque;

import java.util.Scanner;

/**
 * Classe principal que contém o método main para testar o controle de estoque.
 */
public class Bling_teste2 {

	public static void main(String[] args) {

		Scanner ent = new Scanner(System.in);

		int n1 = 6, n2 = 5;
		int resp2 = 0;
		String resp6;
		
		System.out.println("----------------------------------");
		System.out.println("            *BLING*              |");
		System.out.println("    --Controle de Estoque--      |");
		System.out.println("Deseja adicionar novos produtos  |"
				+ "\n1-Sim  2-Nao                     |");
		int resp = ent.nextInt();
		
		do {
			if (resp == 1) {
				System.out.println("1-Alimentos  2-Brinquedos        |");
				resp2 = ent.nextInt();
				if (resp2 == 1) {
					n1 += 1;
				} else if (resp2 == 2) {
					n2 += 1;
				} else {
					continue;
				}
			}
		} while (resp2 >= 3);

		Alimento ali[] = new Alimento[n1];
		ali[0] = new Alimento("Arroz", 5.0, 100, "Marca B");
		ali[1] = new Alimento("Feijao", 4.0, 50, "Marca C");
		ali[2] = new Alimento("Macarrao", 3.5, 75, "Marca D");
		ali[3] = new Alimento("Farinha", 2.5, 80, "Marca E");
		ali[4] = new Alimento("Acucar", 3.0, 60, "Marca F");
		ali[5] = new Alimento("Sal", 1.5, 90, "Marca G");

		Brinquedo bri[] = new Brinquedo[n2];
		bri[0] = new Brinquedo("Carrinho", 12.99, 50, "Plastico");
		bri[1] = new Brinquedo("Boneca", 15.99, 30, "Plastico");
		bri[2] = new Brinquedo("Avião", 18.99, 40, "Ferro");
		bri[3] = new Brinquedo("Trem", 20.99, 20, "Aluminio");
		bri[4] = new Brinquedo("Barco", 22.99, 10, "Plastico");

		if (resp2 == 1) {
			System.out.println("Nome do alimento:               ");
			String nome = ent.next();
			System.out.println("Preco unidade: ");
			double preco = ent.nextDouble();
			System.out.println("Quantidade em estoque: ");
			int quant = ent.nextInt();
			System.out.println("Marca: ");
			String marca = ent.next();
			ali[n1 - 1] = new Alimento(nome, preco, quant, marca);
		} else if (resp2 == 2) {
			System.out.println("Nome do Brinquedo: ");
			String nome = ent.next();
			System.out.println("Preco unidade: ");
			double preco = ent.nextDouble();
			System.out.println("Quantidade em estoque: ");
			int quant = ent.nextInt();
			System.out.println("Material: ");
			String material = ent.next();
			bri[n2 - 1] = new Brinquedo(nome, preco, quant, material);
		}

		String resp3 = "s";
		while (resp3.equals("s")) {
			System.out.println("----------------------------------");
			System.out.println("Menu de Opcoes                   |");
			System.out.println("1-Ver lista de Produtos          |\n"
					+ "2-Vender Produto                 |");
			int resp1 = ent.nextInt();
			switch (resp1) {
			case 1:
				System.out.println("Escolha:\n1-Alimentos   2-Brinquedos");
				int resp4 = ent.nextInt();
				if (resp4 == 1) {
					for (int i = 0; i < ali.length; i++) {
						System.out.println(ali[i]);
					}
				} else if (resp4 == 2) {
					for (int i = 0; i < bri.length; i++) {
						System.out.println(bri[i]);
					}
				} else {
					System.out.println("Opcao Invalida");
					continue;
				}
				break;

			case 2:
				System.out.println("Escolha:\n1-Alimentos 2-Brinquedos");
				int resp5 = ent.nextInt();
				if (resp5 == 1) {
					for (int i = 0; i < ali.length; i++) {
						System.out.println((i + 1) + "-" + ali[i].getNome() + " Quant:" + ali[i].getQuantEstoque());
					}
				} else if (resp5 == 2) {
					for (int i = 0; i < bri.length; i++) {
						System.out.println((i + 1) + "-" + bri[i].getNome() + " Quant:" + bri[i].getQuantEstoque());
					}
				} else {
					System.out.println("Opcao Invalida");
					continue;
				}
				System.out.print("Qual o numero do produto? ");
				int n3 = ent.nextInt();
				System.out.print("Qual a quantidade:");
				int n4 = ent.nextInt();

				if (resp5 == 1) {
					ali[n3 - 1].vender(n4);

				} else if (resp5 == 2) {
					bri[n3 - 1].vender(n4);
				}
				break;
			}
			System.out.println("Deseja continuar com as vendase e consultas s/n ?");
			resp3 = ent.next();
		}
		System.out.println("FINALIZADO");
		
	}
}
