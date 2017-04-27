
import java.sql.Connection;
import java.sql.Statement;
import javax.sql.DataSource;
import org.apache.derby.jdbc.EmbeddedDataSource;


public class InicializadorBancoDados {

    public static String DB_NAME = "dealExtremeDB";
    public static String USER_NAME = "user";
    public static String PASSWORD = "user";
    private static DataSource dataSource;
    
    
    private static DataSource criarDataSource() throws Exception {
        if (dataSource == null) {
            EmbeddedDataSource ds = new EmbeddedDataSource();
            ds.setDatabaseName(DB_NAME);
            ds.setCreateDatabase("create");
            ds.setUser(USER_NAME);
            ds.setPassword(PASSWORD);
            dataSource = ds;
        }
        return dataSource;
    }

    public static void criarBd() throws Exception {
        try (Connection con = criarDataSource().getConnection();
                Statement sta = con.createStatement()) {
            String sqlProduto = "CREATE TABLE PRODUTOS("
                    + "SKU int PRIMARY KEY NOT NULL,"
                    + "NOME varchar(5000) NOT NULL,"
                    + "DESCRICAO varchar(5000) NOT NULL,"
                    + "AVALIACAO float NOT NULL,"
                    + "PRECO float NOT NULL)";
            sta.executeUpdate(sqlProduto);
            
        }
    }

    public static Connection conectarBd() throws Exception {
        return criarDataSource().getConnection();
    }
}
