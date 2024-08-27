com.example.EcommerseApllication.repository;

import example.EcommerseApllication.model.Product;

import org.springframework.data.jpa.JpaRepository;

import org.springframework.stereotype.repository;
@Repository
public interface ProductRepository extends JpaRepository <Product ,Long>{

}