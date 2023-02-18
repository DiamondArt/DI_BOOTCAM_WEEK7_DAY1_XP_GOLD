import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        List <Article> products = new ArrayList<>(Arrays.asList(
                new Dress("Robe rouge",45000,"Robe de soiréee moulant",20 ),
                new Dress("Robe cocktail",55000,"Robe de coktail pour mariage",10 ),
                new Shoes("Escapin",35000,"Escapin rouge",0, 39 )
        ));
        products.forEach(product -> {
           product.displayArticle();
        });
    }
}