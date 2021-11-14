package com.shadab.Ecommerce;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Categorye {
    @Id
    @Column(name="category_id")
    private Long id;
    private String name;
    private Long parentCategoryId;

 /*   @ManyToOne
    @JoinColumn(name="uid")
    private Set<Product> products;
*/
    @ManyToMany(mappedBy = "categories")
    private Set<CategoryMetaField> categoryMetaFields;


    public Categorye(Long id, String name, Long parentCategoryId) {
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
