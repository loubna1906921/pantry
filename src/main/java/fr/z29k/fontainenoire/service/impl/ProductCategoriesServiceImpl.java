package fr.z29k.fontainenoire.service.impl;

import fr.z29k.fontainenoire.dto.ProductCategoriesDto;
import fr.z29k.fontainenoire.entity.ProductCategoriesEntity;
import fr.z29k.fontainenoire.mapper.ProductCategoriesMapper;
import fr.z29k.fontainenoire.repository.IProductCategoriesRepository;
import fr.z29k.fontainenoire.service.IProductCategoriesService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Data
public class ProductCategoriesServiceImpl implements IProductCategoriesService {

    @Autowired
    IProductCategoriesRepository pcRepository;

    ProductCategoriesEntity pcEntity;

    @Autowired
    ProductCategoriesMapper pcMapper;


    /*
    private List<ProductCategoriesDto> getAllProductCategories()
    {
        List<ProductCategoriesEntity> listpcEntity;
        listpcEntity = pcRepository.findAll();



    } */

}
