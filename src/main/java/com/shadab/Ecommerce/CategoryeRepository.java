package com.shadab.Ecommerce;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryeRepository extends JpaRepository<Categorye, Integer> {


}