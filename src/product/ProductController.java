package product;

import java.util.ArrayList;

import exceptions.NegativePriceException;
import exceptions.NotFoundExecption;

public class ProductController {
    ArrayList<ProductModel> products = new ArrayList<>();
    ProductModel newProduct;
    public String create(ProductModel payload) throws Exception{
        newProduct = new ProductModel(payload.getBarCode(),payload.getName(),payload.getPriceInCents());
        if(payload.getPriceInCents() < 0){
            throw new NegativePriceException("O preço do produto precisa ser um número positivo");
        }
        newProduct.setStock(newProduct.getStock() + 1);
        products.add(products.size(), newProduct);
        return "Produto " + payload.getName() + " adcionado!";
    }

    public ArrayList<ProductModel> read(){
        return products;
    }

    public int retrivePrice(String barCode) throws Exception{
        for (ProductModel i:products ){
            if (i.getBarCode() == barCode) {
                return i.getPriceInCents();
            }
        }
        throw new NotFoundExecption("Produto não encontrado!");
    }
}
