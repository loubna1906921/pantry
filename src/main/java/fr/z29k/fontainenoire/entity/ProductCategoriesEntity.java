package fr.z29k.fontainenoire.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;

@Entity
@Table(name="product_categories")
public class ProductCategoriesEntity {

    @GeneratedValue
    @Id
    @Column(name = "id")
    private int idProductCategories;

    @Column(name = "name")
    private String nameProductCategories;

    @CreatedDate
    @Column(name = "created_at")
    private Date createdAtProductCategories;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private Date updatedAtProductCategories;
}
