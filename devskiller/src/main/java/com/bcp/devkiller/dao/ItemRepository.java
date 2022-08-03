package com.bcp.devkiller.dao;

import com.bcp.devkiller.model.Item;
import com.bcp.devkiller.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item,Long> {
    @Query(value = "SELECT i FROM Item i where (select AVG(r.rating) FROM Review r where r.item = i) < :rating")
    List<Item> findItemsWithAverageRatingLowerThan(@Param("rating") Double rating);
}
