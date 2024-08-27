com.example.EcommerseApllication.controller;

import example.EcommerseApllication.model.Product;


import example.EcommerseApllication.model.ProductService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.responseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/api/products")

public class productController
{

    @Autowired
    private ProductService productService;

    @getMapping
    public List<Product> getAllProducts{
        return productService.getAllProducts();

    }

    @getMapping("/{id}")
    ResponseEntity<Product> getProductById(@Pathvariable Long id){

     return    ProductService.getProductById(id).map(responseEntity::ok).orElse(responseEntity.notFounf().build());


    }

    @PostMapping
    public Product createProduct(@RequestBody Product product){
        return productService.saveProduct(products);
    }

    @PutMapping("{id}")
    public ResponseEntity<Product> updateProdct (@Pathvariable Long id , @RequestBody  Product product){
        return ResponseEntity.ok(productService.updateProdct(product));
    }
}
