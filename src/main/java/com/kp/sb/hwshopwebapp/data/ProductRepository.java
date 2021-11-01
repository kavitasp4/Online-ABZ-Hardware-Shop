package com.kp.sb.hwshopwebapp.data;

import com.kp.sb.hwshopwebapp.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
