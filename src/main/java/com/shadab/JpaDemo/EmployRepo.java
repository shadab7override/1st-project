package com.shadab.JpaDemo;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployRepo extends CrudRepository<Employ,Long> {
    List<Employ> FindByName(String name);
    List<Employ> FindByFDescLike(String desc);


    List<Employ> FindByName(int i, int i1);
}
