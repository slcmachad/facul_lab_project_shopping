
/**
 * Escreva uma descrição da classe Loja aqui.
 * 
 * @author (Salomão de Cristo Machado) 
 * @version (1º semestre)
 */
public class Produto {
    private String nome;
    private double preco;
    private Data dataValidade;
    
    public Produto (String nome, double preco, Data dataValidade){
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public double getPreco(){
        return preco;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    public Data getDataValidade(){
        return dataValidade;
    }
    
    public void setDataValidade(Data dataValidade){
        this.dataValidade = dataValidade;
    }
    
    public boolean estaVencido(Data dataAtual){
        return dataAtual.compareTo(dataValidade) > 0;
    }
    
    @Override
    public String toString(){
        return "Produto{" +
        "\n  nome: " + nome +
        ",\n  preco: " + preco +
        ",\n  data de validade: " + dataValidade.toString() +
        "\n}";
    }  
}
