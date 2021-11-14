package com.shadab.Ecommerce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
@CrossOrigin("*")
public class CategoryResource {

    /** The category repository. */
    @Autowired
    private CategoryRepository categoryRepository;

    /**
     * Gets all categories.
     *
     * @return all categories
     */
    @GetMapping(value = "/all")
    public List<Category> getAll() {
        return categoryRepository.findAll();
    }
    /**
     * Gets category.
     *
     * @return category if exists
     */
    @GetMapping(value = "/get")
    public Category get(@RequestParam("id") int id) {
        return categoryRepository.findById(id).get();
    }
    /**
     * Persist category.
     *
     * @param category the category
     * @return the list
     */
    @PostMapping(value = "/add")
    public List<Category> persist(@RequestBody final Category category) {
        categoryRepository.save(category);
        return categoryRepository.findAll();
    }
    /**
     * Delete category.
     *
     * @param id the id
     * @return all categories
     */
    @DeleteMapping(value = "/delete")
    public List<Category> delete(@PathVariable int id) {
        categoryRepository.deleteById(id);
        return categoryRepository.findAll();
    }
    /**
     * Put category.
     *
     * @param id 		the id
     * @param category  the category
     * @return all categories
     */
    @PutMapping(value = "/put/{id}")
    public List<Category> put(@PathVariable int id, @RequestBody Category category) {
        if (categoryRepository.existsById(id)) {
            categoryRepository.deleteById(id);
            categoryRepository.save(category);
        }

        return categoryRepository.findAll();
    }
}
