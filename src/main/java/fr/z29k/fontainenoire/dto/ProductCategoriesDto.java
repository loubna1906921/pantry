package fr.z29k.fontainenoire.dto;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class ProductCategoriesDto {
    private int idProductCategories;
    private String nameProductCategories;
    private Date createdAtProductCategories;
    private Date updateAtProductCategories;
}
