
/**
 * Escreva uma descrição da classe Loja aqui.
 * 
 * @author (Salomão de Cristo Machado) 
 * @version (1º semestre)
 */
public class Informatica extends Loja{
    private double seguroEletronicos;
    
    public Informatica(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double seguroEletronicosint, int quantiaProdutos){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantiaProdutos);
        this.seguroEletronicos = seguroEletronicos;
    }
    
    public Informatica(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, double seguroEletronicos, int quantiaProdutos){
        super(nome, quantidadeFuncionarios, endereco, dataFundacao, quantiaProdutos);
        this.seguroEletronicos = seguroEletronicos;
    }
    
    public double getSeguroEletronicos(){
        return seguroEletronicos;
    }
    
    public void setSeguroEletronicos(double seguroEletronicos){
        this.seguroEletronicos = seguroEletronicos;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\n Valor seguro sobre eletronicos: " + seguroEletronicos;
    }
}
