package fr.z29k.fontainenoire.controller;

import fr.z29k.fontainenoire.service.IProductCategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockController {

    @Autowired
    IProductCategoriesService productCategoriesService;
    @GetMapping("/allproductcatogories")
    public ResponseEntity<String> getAllProductCategories()
    {
        return ResponseEntity.ok("LOUBNAAAAAAAA");
    }
}
