package lp3;

/**
 *
 * @author Filipe
 */
public class PrincipalAlt {
    
    public static void main(String[] args) {
        Livro l1 = new Livro("Java para leigos", "S. Hawking", 2012, 100, 
                100.00);
        Livro l2 = new Livro("Java para gênios", "S. Hawking", 2012, 1, 
                1000.00);
        Livro l3 = new Livro("Java para pessoas medianas", "S. Hawking", 2012, 50, 
                200.00);
        System.out.println("Livros disponíveis");
        System.out.println(l1.toString());
        System.out.println(l2.toString());
        System.out.println(l3.toString());
    }
      
}
