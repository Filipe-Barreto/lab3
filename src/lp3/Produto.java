package lp3;

/**
 *
 * @author Filipe
 */
public interface Produto {

    Double getPreco();

    String getTitulo();

    void setPreco(Double preco);

    void setTitulo(String titulo);

    @Override
    String toString();
    
}
