import java.sql.*;
public class Database{
    private static Connection connect(){
        String url = "jdbc:sqlite:C:\\Users\\TEMP.LABORATORIOS.002\\Desktop\\SQLFactor\\produto.db";
        Connection conn = null;
        try{
            conn = DriverManager.getConnection(url);
        } catch(Exception e){
            e.printStackTrace();
        }
        return conn;
    }
    public static boolean inserir(SQLClass registro){
        return executarSQL(registro.insertSQL());
    }
    public static boolean atualizar(SQLClass registro){
        return executarSQL(registro.updateSQL());
        
    }
    public static boolean deletar(SQLClass registro){
        return executarSQL(registro.deleteSQL());
    }
    public static boolean abrir(SQLClass registro){
        return executarSQL(registro.selectSQL());
    }
    public static boolean executarSQL(String sql){
        System.out.println(sql);
        boolean ok = false;

        Connection currentConn = connect();
        try{
            Statement statement = currentConn.createStatement();
            statement.execute(sql);
            currentConn.close();
            ok = true;
        } catch(Exception e){
            e.printStackTrace();
            ok = false;
        }

        return true;
    }
}