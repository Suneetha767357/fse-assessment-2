package com.ProductAssessment2.productDemo.repository;

import com.ProductAssessment2.productDemo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface ProductRepo extends JpaRepository<Product, Integer> {

    List<Product> findByBrand(String brand);

    List<Product> findByColor(String color);

    List<Product> findByPriceRange(double low, double high);

    public interface ProductRepository extends JpaRepository<Product, Integer> {
        @Query(value = "select * from product p where p.brand = ?1 ", nativeQuery = true)
        public List<Product> findByBrand(@Param("brand") String brand);

        @Query(value = "select * from product p where p.color = ?1 ", nativeQuery = true)
        public List<Product> findByColor(@Param("color") String color);

        @Query(value = "select * from product p where p.price BETWEEN ?1 and ?2 ", nativeQuery = true)
        public List<Product> findByPriceRange(@Param("low") double low, @Param("high") double high);

    }
}
