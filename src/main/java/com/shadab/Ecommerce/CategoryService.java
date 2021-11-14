package com.shadab.Ecommerce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryeRepository categoryRepository;
    private static List<Categorye> categories = new ArrayList<>();

    static {
        categories.add(new Categorye(1l, "T-Shirt", 1l));
        categories.add(new Categorye(2l, "Jeans", 2l));
        categories.add(new Categorye(3l, "Blazzer", 3l));
    }

    public List<Categorye> findAll() {
        return categories;
    }

    public Categorye save(Categorye category) {
        categories.add(category);
        return category;
    }

    public Categorye findOne(int id) {
        for (Categorye category : categories) {
            if (category.getId() == id) {
                return category;

            }
        }
        return null;
    }

    public void updateCategory(int id, Categorye category) {
        for (int i = 0; i < categories.size(); i++) {
            Categorye cat = categories.get(i);
            if (cat.getId() == id) {
                categories.set(i, category);
                return;
            }
        }
    }

    public void deleteCategory(int id) {
        categories.removeIf(t -> t.getId() == id);
    }


}
