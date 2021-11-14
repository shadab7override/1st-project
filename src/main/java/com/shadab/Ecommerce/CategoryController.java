package com.shadab.Ecommerce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("category")
    public List<Categorye> retriveAll(){
        return categoryService.findAll();
    }
    @GetMapping("category/{id}")
    public Categorye retriveOne(@PathVariable int id){
        return categoryService.findOne(id);
    }
    @PostMapping("CategoryAdd")
    public  void createCategory(@RequestBody Categorye category){
        Categorye savedCategory=categoryService.save(category);
    }
    @PutMapping("categoryAdd/{id}")
    public void Update(@RequestBody Categorye cat, @PathVariable int id){
        categoryService.updateCategory(id,cat);
    }

    @DeleteMapping("category/{id}")
    public void delete(@PathVariable int id){
        categoryService.deleteCategory(id);
    }

}
