package com.shadab.Ecommerce;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CategoryMetaService {

        private static List<CategoryMetaField> catmeta=new ArrayList<>();
        static {
            catmeta.add(new CategoryMetaField(1l,"T-Shirt",40,"Red",40));
            catmeta.add(new CategoryMetaField(2l,"jeans",30,"Blue",40));
            catmeta.add(new CategoryMetaField(3l,"Blazzer",42,"Maroon",40));
        }
        public List<CategoryMetaField> findAll(){
            return catmeta;
        }
        public CategoryMetaField save(CategoryMetaField catmetas){
            catmeta.add(catmetas);
            return catmetas;
        }
        public CategoryMetaField findOne(int id){
            for(CategoryMetaField catmetas:catmeta){
                if(catmetas.getId()==id){
                    return catmetas;

                }
            }
            return null;
        }
        public void updateCategory(int id,CategoryMetaField catmetas){
            for(int i=0;i<catmeta.size();i++){
                CategoryMetaField cat=catmeta.get(i);
                if(cat.getId()==id){
                    catmeta.set(i,catmetas);
                    return;
                }
            }
        }

        public void deleteCategory(int id){
            catmeta.removeIf(t ->t.getId()==id);
        }

    }
