com.example.EcommerseApllication.controller;

import example.EcommerseApllication.model.ProductImages;


import example.EcommerseApllication.model.ProductImagesService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.responseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/api/products-images")

public class productController
{
    @Autowired
    private ProductImagesService productImagesService;

    @getMapping("/product/{productId}")
    public List<ProductImages> getImageByProductId(@Pathvariable Long productId){
        return productImageService.getImagesByProductId(productId);

    }

    @PostMapping

    public ProductImage createdProductImage(@RequestBody ProductImages productImages){
        return  productImageService.saveProductImage(productImages);
    }
}