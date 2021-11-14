package com.shadab.Ecommerce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SellerController {
    @Autowired
    private SellerService sellerService;

    @Autowired
    private ProductRepository productRepository;



    @GetMapping("sellers")
    public List<Seller> retriveAll(){
        return sellerService.findAll();
    }
    @GetMapping("sellers/{id}")
    public  Seller retriveOne(@PathVariable int id){
        return sellerService.findOne(id);
    }
    @PostMapping("sellerAdd")
    public  void createCategory(@RequestBody Seller seller){
        Seller savedCategory=sellerService.save(seller);
    }
    @PutMapping("sellerAdd/{id}")
    public void Update(@RequestBody Seller cat, @PathVariable int id){
        sellerService.updateSeller(id,cat);
    }



    @GetMapping(value = "/all")
    public List<Product> getAll() {
        return productRepository.findAll();
    }

    @GetMapping(value = "/get")
    public Product get(@RequestParam("id") int id) {
        return productRepository.findById(id).get();
    }

    @PostMapping(value = "/add")
    public List<Product> persist(@RequestBody final Product product) {
        productRepository.save(product);
        return productRepository.findAll();
    }

    @DeleteMapping(value = "/delete")
    public List<Product> delete(@PathVariable int id) {
        productRepository.deleteById(id);
        return productRepository.findAll();
    }

    @PutMapping(value = "/put/{id}")
    public List<Product> put(@PathVariable int id, @RequestBody Product product) {
        if (productRepository.existsById(id)) {
            productRepository.deleteById(id);
            productRepository.save(product);
        }

        return productRepository.findAll();
    }

}
