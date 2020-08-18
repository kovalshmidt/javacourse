package spring;

import org.springframework.stereotype.Component;
import spring.model.Product;
import spring.model.ProductViewModel;

@Component
public class Mapper {

    /**
     * Convert Product entity to ProductViewModel that represent Product fields in a way that allows the use of it JSON
     */
    public ProductViewModel convertProductToViewModel(Product product) {
        ProductViewModel productViewModel = new ProductViewModel();
        //Set fields
        productViewModel.setUuid(product.getUuid().toString());
        productViewModel.setDescription(product.getDescription());
        productViewModel.setName(product.getName());
        productViewModel.setAvailable(product.getAvailable());
        productViewModel.setUserId(product.getUser().getUuid().toString());

        return productViewModel;
    }
}
