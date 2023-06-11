
/**
 * Escreva uma descrição da classe Loja aqui.
 * 
 * @author (Salomão de Cristo Machado) 
 * @version (1º semestre)
 */
public class Data implements Comparable<Data> {
    private int dia;
    private int mes;
    private int ano;
    
    public Data(int dia, int mes, int ano){
        if(!validaData(dia,mes,ano)){
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }else{
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }
    }
    
    public int getDia(){
        return dia;
    }
    
    public int getMes(){
        return mes;
    }
    
    public int getAno(){
        return ano;
    }
    
    public void setDia(int dia){
        if(validaData(dia, this.mes, this.ano)){
            this.dia = dia;    
        }else{
            System.out.println("Data inválida");
        }
    }
    
    public void setMes(int mes){
        if(validaData(this.dia, mes, this.ano)){
            this.mes = mes;
        }else{
            System.out.println("Não tem mes que corresponde a esse numero");
        }
    }
    
    public void setAno(int ano){
        this.ano = ano;
    }
    
    private boolean validaData(int dia, int mes, int ano){
        if(mes < 1 || mes > 12){
            return false;
        }
        
        int diaFinal = 0;
        
        switch(mes){
            case 2: 
                diaFinal = (verificaAnoBissexto()) ? 29 : 28;
                break;
            case 4: 
                diaFinal = 30;
                break;
            case 6: 
                diaFinal = 30;
                break;
            case 9: 
                diaFinal = 30;
                break;
            case 11: 
            diaFinal = 30;
            break;
            default: diaFinal = 31;
        }
        return (dia >= 1 && dia <= diaFinal);
    }
    
    public boolean verificaAnoBissexto(){
        if(ano % 4 != 0){
            return false;
        }else if(ano % 100 != 0){
            return true;
        }else if(ano % 400 != 0){
            return false;
        }else{
            return true;
        }
    }
    
    @Override
    public String toString(){
        return "(" + dia + "/" + mes + "/" + ano + ")";
    }
    
    @Override
    public int compareTo(Data outraData) {
        if (this.ano != outraData.ano) {
            return Integer.compare(this.ano, outraData.ano);
        } else if (this.mes != outraData.mes) {
            return Integer.compare(this.mes, outraData.mes);
        } else {
            return Integer.compare(this.dia, outraData.dia);
        }
    }
}
