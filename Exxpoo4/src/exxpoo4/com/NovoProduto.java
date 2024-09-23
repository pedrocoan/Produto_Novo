package exxpoo4.com;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

// Nessa classe sera criado os metodos e aplicado a lógica para instanciar em outra classe/*
public class NovoProduto {
	//Criando os atributos/*
	private String nome;
    private double precoCusto;
    private double precoVenda;
    private LocalDate dataFabricacao;
    private LocalDate dataValidade;

    // Criando o construtor que recebe todos os atributos/*
    
    public NovoProduto(String nome, double precoCusto, double precoVenda, LocalDate dataFabricacao, LocalDate dataValidade) {
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
        this.dataFabricacao = dataFabricacao;
        this.dataValidade = dataValidade;
	

}
    // Criando o construtor que recebe o nome, precocusto e e venda,e data de fabricação/*
    // a Data da validade vai ser 1 mes depois que a data de fabricacao/*
    public NovoProduto(String nome, double precoCusto, double precoVenda, LocalDate dataFabricacao) {
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
        this.dataFabricacao = dataFabricacao;
        this.dataValidade = dataFabricacao.plus(1, ChronoUnit.MONTHS);
}
    //Criando o construtor que recebe o nome e o precodecusto/*
    // preco de venda vai ser 10% a mais qu o preco do custo/*
    public NovoProduto(String nome, double precoCusto) {
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.precoVenda = precoCusto * 1.10; 
        this.dataFabricacao = LocalDate.now();
        this.dataValidade = dataFabricacao.plus(1, ChronoUnit.MONTHS);
    }
    
    //Sobreescrevendo e criando o to string para exibir na tela os atributos do objeto corretamente/*
    @Override
    public String toString() {
        return "NovoProduto{" +
                "nome='" + nome + '\'' +
                ", precoCusto=" + precoCusto +
                ", precoVenda=" + precoVenda +
                ", dataFabricacao=" + dataFabricacao +
                ", dataValidade=" + dataValidade +
                '}';
    }
}