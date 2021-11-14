package com.shadab.Ecommerce;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SellerService {

    private static List<Seller> sellers=new ArrayList<>();
    static {
        sellers.add(new Seller(1l,0.5d,"sdhfbi", "ShadabLdt","kr","kata"));
        sellers.add(new Seller(2l,2d,"kk","k2","sdkb","bata"));
        sellers.add(new Seller(3l,0.3d,"sfbi", "ShaLdt","kr","ta"));
    }
    public List<Seller> findAll(){
        return sellers;
    }
  
    public Seller findOne(int id){
        for(Seller sel:sellers){
            if(sel.getUserId()==id){
                return sel;

            }
        }
        return null;
    }
    public Seller save(Seller seller){
        sellers.add(seller);
        return seller;
    }
    public void updateSeller(int id,Seller sell){
        for(int i=0;i<sellers.size();i++){
            Seller cat=sellers.get(i);
            if(cat.getUserId()==id){
                sellers.set(i,sell);
                return;
            }
        }
    }




}
