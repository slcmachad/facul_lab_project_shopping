
/**
 * Escreva uma descrição da classe Loja aqui.
 * 
 * @author (Salomão de Cristo Machado) 
 * @version (1º semestre)
 */
public class Cosmetico extends Loja{
    private double taxaComercializacao;
    
    public Cosmetico(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double taxaComercializacao, int quantiaProdutos){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantiaProdutos);
        this.taxaComercializacao = taxaComercializacao;
    }
    
    public Cosmetico(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, double taxaComercializacao, int quantiaProdutos){
        super(nome, quantidadeFuncionarios, endereco, dataFundacao, quantiaProdutos);
        this.taxaComercializacao = taxaComercializacao;
    }
    
    public double getTaxaComercializacao(){
        return taxaComercializacao;
    }
    
    public void setTaxaComercializacao(double taxaComercializacao){
        this.taxaComercializacao = taxaComercializacao;
    }
    
    @Override
    public String toString() {
        return "Cosmetico{" +
                "\n nome: " + getNome() +
                ",\n quantidade de funcionarios: " + getQuantidadeFuncionarios() +
                ",\n salario base dos funcionario: " + getSalarioBaseFuncionario() +
                ",\n endereco: " + getEndereco().toString() +
                ",\n data da fundacao: " + getDataFundacao().toString() +
                ",\n taxa de comercializacao: " + taxaComercializacao +
                "\n}";
    }
}