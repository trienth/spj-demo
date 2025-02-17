package com.tbb.spj.controller;

import com.tbb.spj.entity.Product;
import com.tbb.spj.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.history.Revision;
import org.springframework.data.history.Revisions;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productService.createProduct(product);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable Long id, @RequestBody Product product) {
        return ResponseEntity.ok(productService.updateProduct(id, product));
    }

    @GetMapping("/{id}/history")
    public ResponseEntity<Revisions<Long, Product>> getProductHistory(@PathVariable Long id) {
        return ResponseEntity.ok(productService.getProductHistory(id));
    }

    @GetMapping("/{id}/revision/{revisionNumber}")
    public ResponseEntity<Revision<Long, Product>> getProductRevision(@PathVariable Long id, @PathVariable Long revisionNumber) {
        Optional<Revision<Long, Product>> revision = productService.getProductRevision(id, revisionNumber);
        return revision.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/{id}/revision/last")
    public ResponseEntity<Revision<Long, Product>> getLastProductRevision(@PathVariable Long id) {
        Optional<Revision<Long, Product>> revision = productService.getLastProductRevision(id);
        return revision.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }
}