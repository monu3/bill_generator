package org.com.example.billgenerator.service;


import org.com.example.billgenerator.models.Item;
import org.com.example.billgenerator.repo.BillRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillService {

    //this is dependency injection
    BillRepository billRepository;
    public BillService(BillRepository billRepository) {
            this.billRepository = billRepository;
    }


    //to add item in database
    public void addItem(Item item) {
       billRepository.save(item);
    }

    //getting the item
    public List<Item> getItems() {
        return billRepository.findAll();
    }


    public Item getItemById(int id) {
        return billRepository.findById(id).orElse(new Item());
    }

    public void updateItem(Item item) {
        billRepository.save(item);
    }


    public void deleteItemById(int id) {
        billRepository.deleteById(id);
    }
}
