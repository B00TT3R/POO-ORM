public class Carro extends SQLClass{
    Carro(){
        this.setTableName("tabela");
    };

    String modelo;
    String marca;
    int ano;
    double valor;
    
}
