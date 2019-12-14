package com.emman.nunez.hardware.controller;

import com.emman.nunez.hardware.model.Product;
import com.emman.nunez.hardware.service.ProductService;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductRestController {

    private ProductService productService;

    @Autowired
    public void setProductService(final ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getProducts() {

//        final Product c2 = new Product();
//        c2.setId(1L);
//        c2.setName("C2 Apple");
//
//        final Product kokoCrunch = new Product();
//        kokoCrunch.setId(2L);
//        kokoCrunch.setName("Koko Crunch");

        return productService.getProducts();
    }
}
