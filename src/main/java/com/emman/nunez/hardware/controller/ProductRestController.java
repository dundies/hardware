package com.emman.nunez.hardware.controller;

import com.emman.nunez.hardware.model.Product;
import com.emman.nunez.hardware.service.ProductService;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    public List<Product> getProducts(@RequestParam(name = "page", required = false, defaultValue = "1") Integer page,
                                     @RequestParam(name = "pageSize", required = false, defaultValue = "10") Integer pageSize) {
        return productService.getProducts(page, pageSize);
    }
}
