package exxpoo4.com;

import java.time.LocalDate;

public class AplicacaoNovoProduto {

	public static void main(String[] args) {
		 // Criando um objeto utilizando o primeiro construtor (todos os atributos)
		
        NovoProduto p1 = new NovoProduto("Celular", 100.0, 150.0, LocalDate.of(2024, 9, 1), LocalDate.of(2024, 10, 1));
        System.out.println(p1);

        // Criando um objeto utilizando o segundo construtor (nome, preço de custo, preço de venda e data de fabricação)
        NovoProduto p2 = new NovoProduto("Nootebook", 200.0, 250.0, LocalDate.of(2024, 9, 15));
        System.out.println(p2);

        // Criando um objeto utilizando o terceiro construtor (nome e preço de custo)
        NovoProduto p3 = new NovoProduto("Tv", 300.0);
        System.out.println(p3);
    }

	

}

