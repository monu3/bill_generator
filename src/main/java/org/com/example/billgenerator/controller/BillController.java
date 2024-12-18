package org.com.example.billgenerator.controller;


import org.com.example.billgenerator.models.Item;
import org.com.example.billgenerator.service.BillService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BillController {


    //this is dependency Injection
    BillService billService;
    public BillController(BillService billService) {
        this.billService = billService;
    }

    //just for check or display to the home page
    @GetMapping("/")
    public String greet(){
        return "Bill Generator ";
    }

    //creating of items
    @PostMapping("/addItems")
    public void addItem(@RequestBody Item item){
       billService.addItem(item);
    }


    //retrieving the data from the database
    @GetMapping("/items")
    public List<Item> getItems(){
       return billService.getItems();
    }


    //retrieve item by searching id
    @GetMapping("/items/{id}")
    public Item getItem(@PathVariable int id){
        return billService.getItemById(id);
    }


    //to update the item in the database
    @PutMapping("/items")
    public void updateItem(@RequestBody Item item){
        billService.updateItem(item);
    }


    //to delete the item from the databasec
    @DeleteMapping("/items/{id}")
    public void deleteItem(@PathVariable int id){
        billService.deleteItemById(id);
    }



}
