
/**
 * Escreva uma descrição da classe Loja aqui.
 * 
 * @author (Salomão de Cristo Machado) 
 * @version (1º semestre)
 */
public class Alimentacao extends Loja{
    private Data dataAlvara;
    
    public Alimentacao(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, Data dataAlvara, int quantiaProdutos){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantiaProdutos);
        this.dataAlvara = dataAlvara;
    }
    
    public Alimentacao(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, Data dataAlvara, int quantiaProdutos){
        super(nome, quantidadeFuncionarios, endereco, dataFundacao, quantiaProdutos);
        this.dataAlvara = dataAlvara;
    }
    
    public Data getDataAlvara(){
        return dataAlvara;
    }
    
    public void setDataAlvara(Data dataAlvara){
        this.dataAlvara = dataAlvara;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\n Data do alvara: " + dataAlvara.toString();
    }
    
}
