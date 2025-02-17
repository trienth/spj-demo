package com.tbb.spj.entity;

import lombok.Data;
import org.hibernate.envers.Audited;
import jakarta.persistence.*;

@Data
@Audited // Kích hoạt Envers cho entity này
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double price;
    private int quantity;
}
