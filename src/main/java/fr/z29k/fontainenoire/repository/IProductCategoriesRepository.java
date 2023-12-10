package fr.z29k.fontainenoire.repository;

import fr.z29k.fontainenoire.entity.ProductCategoriesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductCategoriesRepository extends JpaRepository<ProductCategoriesEntity , Integer> {
}
