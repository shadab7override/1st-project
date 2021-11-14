package com.shadab.Ecommerce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoryMetaController {


        @Autowired
        private CategoryMetaService categoryMetaService;

        @GetMapping("meta")
        public List<CategoryMetaField> retriveAll(){
            return categoryMetaService.findAll();
        }
        @GetMapping("meta/{id}")
        public  CategoryMetaField retriveOne(@PathVariable int id){
            return categoryMetaService.findOne(id);
        }
        @PostMapping("metaAdd")
        public  void createCategory(@RequestBody CategoryMetaField catmetas){
            CategoryMetaField savedCategory=categoryMetaService.save(catmetas);
        }
        @PutMapping("metaAdd/{id}")
        public void Update(@RequestBody CategoryMetaField cat,@PathVariable int id){
            categoryMetaService.updateCategory(id,cat);
        }

        @DeleteMapping("meta/{id}")
        public void delete(@PathVariable int id){
            categoryMetaService.deleteCategory(id);
        }


}
