
/**
 * Escreva uma descrição da classe Loja aqui.
 * 
 * @author (Salomão de Cristo Machado) 
 * @version (1º semestre)
 */

public class Principal{
    public static void main(String[] args){
        
      int opcao;
      Loja loja = null;
      Produto produto1 = null;
      
        do{
            System.out.println("****************");
            System.out.println("\n1 - criar uma loja");
            System.out.println("2 - criar um produto");
            System.out.println("3 - sair");
            System.out.println("\n****************");
            opcao = Teclado.leInt("O que gostarias de fazer?");          
            
            if (opcao == 1){
                
                loja = new Loja(Teclado.leString("Qual seria  nome da sua loja?"), 
                                Teclado.leInt("Quantos funcionarios a sua loja possui:"),
                                Teclado.leDouble("Qual é o salario base dos funcionarios?"),
                                new Endereco(Teclado.leString("Qual o nome da rua?"), 
                                             Teclado.leString("Qual o nome da cidade?"),
                                             Teclado.leString("Qual o Estado?"),
                                             Teclado.leString("Qual o nome do pais?"),
                                             Teclado.leString("digite seu cep"),
                                             Teclado.leString("Informe o numero da loja"),
                                             Teclado.leString("Possui algum complemento?")),
                                new Data(Teclado.leInt("Qual a data da fundação?\nDia: "),Teclado.leInt("Mês: "), Teclado.leInt("Ano: ")),
                                Teclado.leInt("Qual será a quantia de produtos?"));
                System.out.println("Tudo certo com a sua loja. O que deseja fazer agora?");
                    
            }else if(opcao == 2){
                produto1 = new Produto(Teclado.leString("Qual seria  nome do seu produto?"), 
                                      Teclado.leDouble("Qual o valor do produto?"),
                                      new Data(Teclado.leInt("Qual a data de validade?\nDia: "),
                                               Teclado.leInt("Mês: "), 
                                               Teclado.leInt("Ano: ")));
                System.out.println("Tudo certo com o seu produto. O que deseja fazer agora?");
            }else if(opcao != 1 && opcao != 2 && opcao != 3){
                System.out.println("Numero inválido.");
            }
        }while(opcao != 3);
        
        Data vencido = new Data(20,10,2023);
        
        if(produto1 != null && produto1.getDataValidade().compareTo(vencido) > 0){
            System.out.println("O produto está vencido.");
        } else {
            System.out.println("O não produto está vencido.");
        } 
        
        if (loja != null) {
            System.out.println(loja.toString());
        } else {
            throw new NullPointerException("A variável 'loja' é nula.");
        }
        
        try {
            System.out.println(produto1.toString());
        }catch(NullPointerException e){
            System.err.println("A loja ou o produto não foi cadastrado");
        }
        
    }
}
