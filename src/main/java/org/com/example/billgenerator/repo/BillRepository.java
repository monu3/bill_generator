package org.com.example.billgenerator.repo;

import org.com.example.billgenerator.models.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillRepository extends JpaRepository<Item, Integer> {
}
