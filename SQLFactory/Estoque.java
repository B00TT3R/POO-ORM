public class Estoque extends SQLClass{    
    @Key
    int id;
    int produto_id;
    int filial_id;
    double quantidade;
    String nome;

    Estoque(){
        this.setTableName("ESTOQUE");
    }
}
