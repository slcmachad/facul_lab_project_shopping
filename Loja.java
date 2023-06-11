
/**
 * Escreva uma descrição da classe Loja aqui.
 * 
 * @author (Salomão de Cristo Machado) 
 * @version (1º semestre)
 * Disciplina: Laboratório I (GR96002-00562)
 */
public class Loja{
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataFundacao;
    private Produto[] estoqueProdutos;
    
    
    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int quantiaProdutos){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[quantiaProdutos];
    }
    
    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, int quantiaProdutos){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[quantiaProdutos];
    }
    
    public void imprimeProdutos(){
        System.out.println("Produtos cadastrados");
        for(Produto produto : estoqueProdutos){
            if(produto != null){
                System.out.println(produto.toString());
            }
        }
    }
    
    public boolean insereProduto(Produto produto){
        for(int i = 0; i < estoqueProdutos.length; i++){
            if(estoqueProdutos[i] == null){
                estoqueProdutos[i] = produto;
                return true;
            }
        }
        return false;
    }
    
    public boolean removeProduto(String nomeProduto){
        for(int i = 0; i < estoqueProdutos.length; i++){
                if(estoqueProdutos[i] != null && estoqueProdutos[i].getNome().equals(nomeProduto)){
                    estoqueProdutos[i] = null;
                    return true;
                }
        }
        return false;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String Nome){
        this.nome = nome;
    }
    
    public int getQuantidadeFuncionarios(){
        return quantidadeFuncionarios;
    }
        
    public void setQuantidadeFuncionarios(int quantidadeFuncionarios){
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }
    
    public double getSalarioBaseFuncionario(){
        return salarioBaseFuncionario;
    }
    
    public void setSalarioBaseFuncionario(double salarioBaseFuncionario){
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }
    
    public Endereco getEndereco(){
        return endereco;
    }
    
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
    
    public Data getDataFundacao(){
        return dataFundacao;
    }
    
    public void setDataFundacao(Data dataFundacao){
        this.dataFundacao = dataFundacao;
    }
    
    public Produto[] getEstoqueProdutos(){
        return estoqueProdutos;
    }
    
    public void setEstoqueProdutos(Produto[] estoqueProduto){
        this.estoqueProdutos = estoqueProdutos;
    }
    
    @Override
    public String toString(){
        String resposta = "Loja:" + 
                            "\n nome: " + nome +
                            "\n quantidade de funcionarios: " + quantidadeFuncionarios +
                            "\n salario base dos funcionario: " + salarioBaseFuncionario +
                            "\n endereco: " + endereco.toString() +
                            "\n data da fundacao: " + dataFundacao.toString() +
                            "\n estoque de produtos: \n";
        for(Produto produto : estoqueProdutos){
            if(produto != null){
                resposta += produto.toString() + "\n";
            }
        }
        
        return resposta;
    }
    
    public double gastosComSalario(){
        if (salarioBaseFuncionario != -1){
            return salarioBaseFuncionario * quantidadeFuncionarios;
        }else {
            return -1;
        }
    }
    
    public char tamanhoDaLoja(){
        if(this.quantidadeFuncionarios < 10){
            return 'P';
        }else if(this.quantidadeFuncionarios >= 10 && this.quantidadeFuncionarios <= 30){
            return 'M';
        }else {
         return 'G';
        }        
    }

    
}
