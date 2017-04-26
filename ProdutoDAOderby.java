

import negocio.DAOProdutoException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class ProdutoDAOderby implements ProdutoDAO {

    @Override
    public List<Produto> buscarTodos() throws DAOProdutoException {
        List<Produto> produtos = new ArrayList<>();
        String sql = "select * from produtos";
        try (Connection conexao = InicializadorBancoDadosDataSource.conectarBd()) {
            try (Statement comando = conexao.createStatement()) {
                try (ResultSet resultado = comando.executeQuery(sql)) {
                    while (resultado.next()) {
                        Produto produto = new Produto(
                             
                                resultado.getString("nome"),
                                resultado.getString("descricao"),
                                resultado.getFloat("avaliacao"),
                                resultado.getFloat("preco"),
                                resultado.getIntt("sKU"));

                        autores.add(autor);
                    }
                    return autores;
                }
            }
        } catch (Exception e) {
            throw new DAOAutorException("Falha na busca", e);
        }
    }

   
}
