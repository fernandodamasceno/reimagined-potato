import java.util.List:

public interface ProdutoDAO{

    List<ProdutoDTO> buscarTodos() throws DAOProdutoException;
   

}
