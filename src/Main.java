import product.ProductController;
import product.ProductModel;

public class Main {

    // atributos auxiliares para teste (caso precise).
    public static void main(String[] args){
        // teste seu código aqui.
        ProductModel product1 = new ProductModel("xx78wq", "lápis", 70);
        ProductModel product2 = new ProductModel("xx78w2", "Borracha", 65);

        var managerProducts = new ProductController();
        try {
            System.out.println(managerProducts.create(product1));
            System.out.println(managerProducts.create(product2));
            // System.out.println(managerProducts.retrivePrice("xx78wq"));
            for(ProductModel i: managerProducts.read()) System.out.println(i.getName());;
           
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // métodos auxiliares para teste (caso precise).
}
