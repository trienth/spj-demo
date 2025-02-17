package com.tbb.spj.service;

import com.tbb.spj.entity.Product;
import com.tbb.spj.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.history.Revision;
import org.springframework.data.history.Revisions;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    @Transactional
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Transactional
    public Product updateProduct(Long id, Product updatedProduct) {
        Product existingProduct = productRepository.findById(id).orElseThrow();
        existingProduct.setName(updatedProduct.getName());
        existingProduct.setPrice(updatedProduct.getPrice());
        existingProduct.setQuantity(updatedProduct.getQuantity());
        return productRepository.save(existingProduct);
    }

    @Transactional
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }

    public Revisions<Long, Product> getProductHistory(Long id) {
        return productRepository.findRevisions(id);
    }

    public Optional<Revision<Long, Product>> getProductRevision(Long id, Long revisionNumber) {
        return productRepository.findRevision(id, revisionNumber);
    }

    public Optional<Revision<Long, Product>> getLastProductRevision(Long id) {
        return productRepository.findLastChangeRevision(id);
    }
}
