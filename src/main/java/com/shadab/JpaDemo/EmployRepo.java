package com.shadab.JpaDemo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface EmployRepo extends PagingAndSortingRepository<Employ,Long> {
    List<Employ> findByName(String srk);
   /*List<Employ> findByName(String name);
    List<Employ> findByDescLike(String desc);


    List<Employ> findByName(int i, int i1);*/
}
