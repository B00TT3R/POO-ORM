
public class SQLFactory {
    public static void main(String[] args) {

        Estoque pilha = new Estoque();

        pilha.id = 1;
        pilha.filial_id = 2;
        pilha.produto_id = 42;
        pilha.quantidade = 1900;
        pilha.nome = "Banana";

        Database.inserir(pilha);
        /*
         * Database.atualizar(pilha); Database.abrir(pilha); Database.deletar(pilha);
         */

    }
}