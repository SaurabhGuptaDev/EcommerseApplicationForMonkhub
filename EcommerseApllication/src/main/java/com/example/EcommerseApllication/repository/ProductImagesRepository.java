com.example.EcommerseApllication.repository;

import example.EcommerseApllication.model.ProductImages;

import org.springframework.data.jpa.JpaRepository;

import org.springframework.stereotype.repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository <ProductImages ,Long>{

    List<ProductImages> findByProductId(long product_id);
}