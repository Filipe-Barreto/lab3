package lp3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Filipe
 */
public class PrincipalAlt {
    
    public static void main(String[] args) {
        
        List<Livro> livros = new ArrayList<>();
        
        livros.add(new Livro("Java para leigos", "S. Hawking", 2012, 100, 
                100.00));
        
        livros.add(new Livro("Java para gênios", "S. Hawking", 2012, 1, 
                1000.00));
       
        livros.add(new Livro("Java para pessoas medianas", "S. Hawking", 2012, 50, 
                200.00));
        
        System.out.println("Livros disponíveis");
        
        //digite fore e aperte tab
        for (Livro livro : livros) {
            System.out.println(livro);
        }
        
    }
      
}
