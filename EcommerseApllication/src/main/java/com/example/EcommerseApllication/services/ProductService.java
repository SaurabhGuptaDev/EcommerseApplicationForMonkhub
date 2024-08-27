 com.example.EcommerseApllication.service;

import com.example.EcommerseApllication.model.Product;
import com.example.EcommerseApllication.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public Product updateProduct(Long id, Product updatedProduct) {
        return productRepository.findById(id)
            .map(product -> {
                product.setTitle(updatedProduct.getTitle());
                product.setDescription(updatedProduct.getDescription());
                product.setPrice(updatedProduct.getPrice());
                return productRepository.save(product);
            })
            .orElseGet(() -> {
                updatedProduct.setId(id);
                return productRepository.save(updatedProduct);
            });
    }
}