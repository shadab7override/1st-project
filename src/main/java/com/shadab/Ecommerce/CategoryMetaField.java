package com.shadab.Ecommerce;

import javax.persistence.*;
import java.util.Set;

@Entity
public class CategoryMetaField {
    @Id
    @Column(name="meta_id")
    private Long id;
    private String name;

    private Integer size;
    private String color;
    private Integer length;

    @ManyToMany
    @JoinTable(
            name = "CategoryMetaFieldValues",
            joinColumns = @JoinColumn(name = "category_id"),
            inverseJoinColumns = @JoinColumn(name = "meta_id"))
    private Set<Categorye> categories;

    public CategoryMetaField(Long id, String name, Integer size, String color,
                             Integer length, Set<Categorye> categories) {
        this.id = id;
        this.name = name;
        this.size = size;
        this.color = color;
        this.length = length;
        this.categories = categories;
    }

    public CategoryMetaField(long id, String name, int size, String red, int length) {
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

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Set<Categorye> getCategories() {
        return categories;
    }

    public void setCategories(Set<Categorye> categories) {
        this.categories = categories;
    }
}
