/**
 * Escreva uma descrição da classe Loja aqui.
 * 
 * @author (Salomão de Cristo Machado) 
 * @version (1º semestre)
 */
public class Shopping{
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;
    
    public Shopping(String nome, Endereco endereco, int quantiaLojas){
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[quantiaLojas];
    }
    
    public boolean insereLoja(Loja loja){
        for (int i = 0; i < lojas.length; i++){
            if(lojas[i] == null){
                lojas[i] = loja;
                return true;
            }
        }
        return false;
    }
    
    public boolean removeLoja(String nomeLoja){
        for(int i = 0; i < lojas.length; i++){
            if(lojas[i] != null && lojas[i].getNome().equals(nomeLoja)){
                lojas[i] = null;
                return true;
            }
        }
        return false;
    }
    
    public int quantidadeLojasPorTipo(String tipoLoja){
        int quantidade = 0;
        for(Loja loja : lojas) {
            if(loja != null){
                if(loja instanceof Cosmetico && tipoLoja.equalsIgnoreCase("Cosmético")){
                    quantidade++;
                }else if(loja instanceof Vestuario && tipoLoja.equalsIgnoreCase("Vestuário")){
                    quantidade++;
                }else if(loja instanceof Bijuteria && tipoLoja.equalsIgnoreCase("Bijuteria")){
                    quantidade++;
                }else if(loja instanceof Alimentacao && tipoLoja.equalsIgnoreCase("Alimentação")){
                    quantidade++;
                }else if(loja instanceof Informatica && tipoLoja.equalsIgnoreCase("Informática")){
                    quantidade++;
                }
            }
        }
        
        if(quantidade == 0 && !tipoLoja.equalsIgnoreCase("Cosmético") &&
                              !tipoLoja.equalsIgnoreCase("Vestuário") &&
                              !tipoLoja.equalsIgnoreCase("Bijuteria") &&
                              !tipoLoja.equalsIgnoreCase("Alimentação") &&
                              !tipoLoja.equalsIgnoreCase("Informática")){
            quantidade = -1;
        }
        return quantidade;
    }
    
    public Informatica lojaSeguroMaisCaro() {
    Informatica lojaMaisCara = null;
    double maiorValorSeguro = 0.0;

    for (Loja loja : lojas) {
        if (loja instanceof Informatica) {
            Informatica informatica = (Informatica) loja;
            if (informatica.getSeguroEletronicos() > maiorValorSeguro) {
                lojaMaisCara = informatica;
                maiorValorSeguro = informatica.getSeguroEletronicos();
            }
        }
    }

    return lojaMaisCara;
}

    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public Endereco getEndereco(){
        return endereco;
    }
    
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
    
    public Loja[] getLojas(){
        return lojas;
    }
    
    public void setLojas(Loja[] lojas){
        this.lojas = lojas;
    }
    
    @Override
    public String toString(){
        String resultado = "Shopping:\n";
                resultado += "Nome: " + nome + "\n";
                resultado += "Endereço: " + endereco.toString() + "\n";
                resultado += "Lojas:\n";
                for(Loja loja : lojas){
                    if(loja != null){
                        resultado += loja.toString() + "\n";
                    }
                }
                return resultado;
    }
}
