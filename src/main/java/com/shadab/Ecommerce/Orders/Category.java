/*
package com.shadab.Ecommerce;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Category {
    @Id
    private Long id;
    private String name;
    private Long parentCategoryId;

    @ManyToOne
    @JoinColumn(name="uid")
    private Set<Product> products;

    @ManyToMany(mappedBy = "Category")
    private Set<CategoryMetaField> categoryMetaFields;

    public Category(Long id, String name, Long parentCategoryId) {
        this.id = id;
        this.name = name;
        this.parentCategoryId = parentCategoryId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getParentCategoryId() {
        return parentCategoryId;
    }

    public void setParentCategoryId(Long parentCategoryId) {
        this.parentCategoryId = parentCategoryId;
    }
}
*/
