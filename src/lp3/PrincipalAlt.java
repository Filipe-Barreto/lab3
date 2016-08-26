package lp3;

/**
 *
 * @author Filipe
 */
public class PrincipalAlt {
    
    public static void main(String[] args) {
        Livro l1 = new Livro("Java para leigos", 2012, 100, 
                100.00F);
        Livro l2 = new Livro("Java para gênios", 2012, 1, 
                1000.00F);
        Livro l3 = new Livro("Java para pessoas medianas", 2012, 50, 
                200.00F);
        System.out.println("Livros disponíveis");
        System.out.println(l1.toString());
        System.out.println(l2.toString());
        System.out.println(l3.toString());
    }
      
}
