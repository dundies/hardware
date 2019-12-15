package com.emman.nunez.hardware.service;

import com.emman.nunez.hardware.model.Product;
import com.emman.nunez.hardware.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private ProductRepository productRepository;

    @Autowired
    public void setProductRepository(final ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getProducts(final Integer page, final Integer pageSize) {
        final Pageable pageRequest = PageRequest.of(page - 1, pageSize);

        return productRepository.findAll(pageRequest).toList();
    }
}
