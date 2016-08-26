package lp3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Filipe
 */
public class PrincipalAlt {
    
    public static void main(String[] args) {
        
        List<Produto> produtos = new ArrayList<>();
        
        produtos.add(new Livro("Java para leigos", "S. Hawking", 2012, 100, 
                100.00));
        
        produtos.add(new Livro("Java para gênios", "S. Hawking", 2012, 1, 
                1000.00));
       
        produtos.add(new Livro("Java para pessoas medianas", "S. Hawking", 2012, 50, 
                200.00));

        produtos.add(new CD("Exception","Bonde Java", 20.45));
        
        System.out.println("Produtos disponíveis");
        
//digite fore e aperte tab
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
        
    }
      
}
