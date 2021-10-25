/*
package com.shadab.Ecommerce;

import javax.persistence.*;
import java.util.Set;

@Entity
public class CategoryMetaField {
    @Id
    private Long id;
    private String name;

    @ManyToMany
    @JoinTable(
            name = "CategoryMetaFieldValues",
            joinColumns = @JoinColumn(name = "id"),
            inverseJoinColumns = @JoinColumn(name = "id"))
    private Set<Category> categories;

    public CategoryMetaField(Long id, String name) {
        this.id = id;
        this.name = name;
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
}
*/
