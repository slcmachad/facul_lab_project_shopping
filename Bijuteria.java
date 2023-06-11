
/**
 * Escreva uma descrição da classe Loja aqui.
 * 
 * @author (Salomão de Cristo Machado) 
 * @version (1º semestre)
 */
public class Bijuteria extends Loja{
    private double metaVendas;
    
    public Bijuteria(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double metaVendas, int quantiaProdutos){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantiaProdutos);
        this.metaVendas = metaVendas;
    }
    
    public Bijuteria(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, double metaVendas, int quantiaProdutos){
        super(nome, quantidadeFuncionarios, endereco, dataFundacao, quantiaProdutos);
        this.metaVendas = metaVendas;
    }

    public double getMetaVendas(){
        return metaVendas;
    }
    
    public void setMetaVendas(double metaVendas){
        this.metaVendas = metaVendas;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\n Meta de Vendas: " + metaVendas;
    }

}
